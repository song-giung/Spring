package com.rldnddl87.springioc;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment enviroment = ctx.getEnvironment();
        System.out.println(Arrays.toString(enviroment.getActiveProfiles()));
        System.out.println(Arrays.toString(enviroment.getDefaultProfiles())); //설정하지 않아도 항상 적용되는 프로파일
    }
}
