package me.giung.spingbootdata1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate; //DataSource를 사용하는것 보다 자원관리 및 에러처리가 더 잘 되어 있다.

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()){

            String url = connection.getMetaData().getURL();
            String userName = connection.getMetaData().getUserName();

            System.out.println("url : " + url);
            System.out.println("userName : " + userName);

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE USER(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY(id))";
            statement.executeLargeUpdate(sql);

            jdbcTemplate.execute("INSERT INTO USER VALUES (1,'giung')");

        }
    }
}
