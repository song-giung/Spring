package me.giung.springbootneo4j;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import me.giung.springbootneo4j.Account.Account;
import me.giung.springbootneo4j.Account.AccountRepository;
import me.giung.springbootneo4j.Account.Role;

@Component
public class Noe4jRunner implements ApplicationRunner {

    @Autowired
    SessionFactory sessionFactory; // SessionFactory를 사용하거나 Neo4jRepository를 사용할 수 있다.

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub
        Account account = new Account();
        account.setUsername("giung2");
        account.setEmail("test@test.com");

        Role role = new Role();
        role.setName("admin2");

        account.getRoles().add(role);

        // Session session = sessionFactory.openSession();
        // session.save(account);
        // sessionFactory.close();
        accountRepository.save(account);

        System.out.println("saved!!");

    }

}