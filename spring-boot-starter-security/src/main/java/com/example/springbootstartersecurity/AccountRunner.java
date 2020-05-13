package com.example.springbootstartersecurity;

import com.example.springbootstartersecurity.account.Account;
import com.example.springbootstartersecurity.account.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = service.createAccount("rldnd", "pass");
        System.out.println("name : " + account.getUsername());
        System.out.println("password : " + account.getPassword());
    }

}