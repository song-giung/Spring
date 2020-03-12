package com.demo.springmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc 활성화 시 스프링 부트의 Mvc 자동 설정을 사용하지 않는다.
public class WebConfig implements WebMvcConfigurer {


}
