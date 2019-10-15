package com.admin.springbootadmin.controller.api;

import com.admin.springbootadmin.ifs.CRUDInterface;
import com.admin.springbootadmin.model.network.Header;
import com.admin.springbootadmin.model.network.request.UserApiRequest;
import com.admin.springbootadmin.model.network.response.UserApiResponse;
import com.admin.springbootadmin.service.UserApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController implements CRUDInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiService userApiService;

    @Override
    @PostMapping("")
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> userApiRequest) {
        log.info("userController crate : {}",userApiRequest); //log : userApiRequest.toString()
        return userApiService.create(userApiRequest);
    }

    @Override
    @GetMapping("{id}")
    public Header<UserApiResponse> read(@PathVariable Long id) {
        log.info("userController read id : {}", id);
        return userApiService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> userApiRequest) {
        log.info("userController update : {}", userApiRequest);
        return userApiService.update(userApiRequest);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<UserApiResponse> delete(@PathVariable Long id) {
        log.info("userController delete id : {}", id);
        return userApiService.delete(id);
    }
}
