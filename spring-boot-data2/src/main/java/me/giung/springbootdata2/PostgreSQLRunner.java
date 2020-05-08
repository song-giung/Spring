package me.giung.springbootdata2;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PostgreSQLRunner implements ApplicationRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub
        try (Connection connecntion = dataSource.getConnection()) {
            System.out.println(dataSource.getClass());
            System.out.println(connecntion.getMetaData().getURL());
            System.out.println(connecntion.getMetaData().getUserName());

            Statement statement = connecntion.createStatement();

            String sql = "CREATE TABLE ACCOUNT(ID INTEGER NOT NULL, name VARCHAR(255),PRIMARY KEY(id))";
            statement.executeUpdate(sql);

        }

        jdbcTemplate.execute("INSERT INTO ACCOUNT VALUES (2,'giung')");
    }

}