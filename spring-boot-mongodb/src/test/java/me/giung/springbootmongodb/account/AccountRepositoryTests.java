package me.giung.springbootmongodb.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest // Mongo Repository관련 빈들만 등록이 된다.(슬라이스 테스트)
public class AccountRepositoryTests {

    @Autowired
    AccountRepository repository;

    @Test // 테스트용 in-memory database를 사용한다.
    public void findByEmailTests() {
        Account account = new Account();
        account.setUsername("giung");
        account.setEmail("test@test.com");

        repository.save(account);

        Optional<Account> byId = repository.findById(account.getId());
        assertThat(byId).isNotEmpty();

        Optional<Account> byEmail = repository.findByEmail(account.getEmail());
        assertThat(byEmail).isNotEmpty();
    }
}