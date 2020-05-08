package me.giung.springbootjpa.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest // slicing test 의 경우 in-memory db가 사용된다.
public class AccountRepositoryTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void id() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getUserName());
            // h2 db관련 정보가 출력된다.
        }

    }

    @Test
    public void getId() {
        Account account = new Account();
        account.setUserName("giung");
        account.setPassword("pass");

        Account newAccount = accountRepository.save(account);

        assertThat(newAccount).isNotNull();

        Optional<Account> existingAccount = accountRepository.findByUserName(newAccount.getUserName());
        assertThat(existingAccount).isNotEmpty();

        Optional<Account> nonExistingAccount = accountRepository.findByUserName("none");
        assertThat(nonExistingAccount).isEmpty();

    }
}