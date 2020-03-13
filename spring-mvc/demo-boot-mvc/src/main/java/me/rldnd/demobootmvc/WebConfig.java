package me.rldnd.demobootmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GreetingInterceptor()).order(0); // 음수일수록 우선순위가 높다.
        registry.addInterceptor(new AnotherInterceptor()).addPathPatterns("/hi").order(-1);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/mobile/**")
                .addResourceLocations("classpath:/mobile/", "file:/Users") //클래스 패스와 파일시스템경로등 여러개를 설정할 수 있다.
                .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
    }

    //Http message converter configure

/*    @Override //사용시 디폴트 컨버터 무효화 등록된것만 작동
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    }*/

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    //의존성 추가로 컨버터를 추가하는방법을 가장 추천함.

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan(Person.class.getPackage().getName());
        return jaxb2Marshaller;
    }
}
