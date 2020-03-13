package me.rldnd.demobootmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
}
