package me.giung.springbootmongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import me.giung.springbootmongodb.account.Account;
import me.giung.springbootmongodb.account.AccountRepository;

@Component
public class MongoDBRunner implements ApplicationRunner {

    @Autowired
    MongoTemplate mongoTemplate; // MongoTemplate를 사용하거나 MongoRepository를 사용할 수 있다.

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub
        Account account = new Account();
        account.setEmail("rldnddl87@gmail.com");
        account.setUsername("giung");

        mongoTemplate.insert(account);

        // accountRepository.insert(account);
    }

}