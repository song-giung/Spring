package com.admin.springbootadmin.service;

import com.admin.springbootadmin.ifs.CRUDInterface;
import com.admin.springbootadmin.model.entity.User;
import com.admin.springbootadmin.model.network.Header;
import com.admin.springbootadmin.model.network.request.UserApiRequest;
import com.admin.springbootadmin.model.network.response.UserApiResponse;
import com.admin.springbootadmin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserApiService implements CRUDInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserRepository userRepository;

    //1. request data
    //2. user crud
    //3. response data
    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {

        UserApiRequest userApiRequest = request.getData();

        User user = User.builder()
                .account(userApiRequest.getAccount())
                .password(userApiRequest.getPassword())
                .email(userApiRequest.getEmail())
                .phoneNumber(userApiRequest.getPhoneNumber())
                .status("REGISTERED")
                .registeredAt(LocalDateTime.now())
                .build();

        User savedUser = userRepository.save(user);

       return response(savedUser);
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        Optional<User> optional = userRepository.findById(id);

        return optional
                .map(user -> response(user))
                .orElseGet(() -> Header.ERROR("데이터 없음")
                );
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();

        Optional<User> optional = userRepository.findById(userApiRequest.getId());

        return optional.map(user -> {
            user.setAccount(userApiRequest.getAccount())
                    .setPassword(userApiRequest.getPassword())
                    .setStatus(userApiRequest.getStatus())
                    .setPhoneNumber(userApiRequest.getPhoneNumber())
                    .setEmail(userApiRequest.getEmail())
                    .setRegisteredAt(userApiRequest.getRegisteredAt())
                    .setUnregisteredAt(userApiRequest.getUnregisteredAt());


            return user;
        })
        .map(user ->  userRepository.save(user)) // update
        .map(updatedUser ->  response(updatedUser)) // response
        .orElseGet(() -> Header.ERROR("데이터 없음"));

    }

    @Override
    public Header delete(Long id) {
        Optional<User> optional = userRepository.findById(id);


        return optional.map(user -> {
            userRepository.delete(user);
            return Header.OK();
        })
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }


    private Header<UserApiResponse> response(User user) {
        UserApiResponse response = UserApiResponse.builder()
                .id(user.getId())
                .account(user.getAccount())
                .password(user.getPassword())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .status(user.getStatus())
                .registeredAt(user.getRegisteredAt())
                .unregisteredAt(user.getUnregisteredAt())
                .build();


        return Header.OK(response);
    }

}
