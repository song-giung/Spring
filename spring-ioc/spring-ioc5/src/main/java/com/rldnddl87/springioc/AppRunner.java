package com.rldnddl87.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    BookRepository bookRepository;

    @Value("${app.about}")
    String appAbout;

    @Value("${rldnd.name}")
    String rldndName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment enviroment = ctx.getEnvironment();
        System.out.println(enviroment.getProperty("rldnd.name")); //추가로 경로를 설정한 app.properties파일
        System.out.println(enviroment.getProperty("app.about")); //기본 경로에 있던 application.yml파일


        System.out.println("==============");

        System.out.println(appAbout);
        System.out.println(rldndName);
    }
}
