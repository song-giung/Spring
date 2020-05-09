package me.giung.springbootredis;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import me.giung.springbootredis.account.Account;
import me.giung.springbootredis.account.AccountRepository;

@Component
public class RedisRunner implements ApplicationRunner {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub
        ValueOperations<String, String> values = redisTemplate.opsForValue();
        values.set("rldnd", "giung");
        values.set("springboot", "it's fun");
        values.set("hello", "dev world");

        Account account = new Account();
        account.setEmail("rldnddl87@gmail.com");
        account.setUsername("giung");

        accountRepository.save(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        System.out.println(byId.get().getUsername());
        System.out.println(byId.get().getEmail());

    }

}