package me.rldnd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@ComponentScan
@Configuration
@EnableWebMvc // with @Configuration
public class WebConfig implements WebMvcConfigurer {

    //WebMvcConfigurer를 사용하여 EnableWebMvc를 통해 등록된 기본 Bean들을 손쉽게 커스터마이징 할 수 있다.
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/",".jsp");
    }
}

