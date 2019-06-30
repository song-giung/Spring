package com.rldnddl87.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {



    @Autowired
    MessageSource messageSource;



    @Override
    public void run(ApplicationArguments args) throws Exception {

        while(true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"rldnd"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"rldnd"}, Locale.getDefault()));
            Thread.sleep(1000l);
        }

    }
}
