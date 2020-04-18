package me.giung.springboot;

import me.giung.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner {

    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(holoman);
    }

    /*
    자동 설정으로 생성된 bean을 재정의할 경우 에러가 발생한다.
    해결법
    1. application.yml에 allow-bean-definition-overriding: true 설정하거나(설정시 자동설정이 적용된다 커스텀 으로 생성된 빈은 적용되지 않음)
    2. 자동 설정을 작성시 @ConditionalOnMissingBean을 추가해준다.(커스텀 빈이 적용된다)
    */

    /*@Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setName("rldnd");
        holoman.setHowLong(60);
        return holoman;
    }*/
}
