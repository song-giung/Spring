package com.rldnddl87.httpmessegeconverter.springhttpmessageconverter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 기본 컨버터 사용하지 않고 추가하기
     * 바이트배열,문자열,Resource컨버터,Form 컨버터 등
     * */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    /**
     *기본 컨버터 사용하고 거기에 추가 컨버터 설정 더하기
     * */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    /**
     * 제일 좋은 방식은 의존성을 통해 추가하는 것이다.(그레들 or 메이븐 사용)
     * */


    /**
     * xml 컨버터 위해 추가
     * */
    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan(Person.class.getPackage().getName());
        return jaxb2Marshaller;
    }

}
