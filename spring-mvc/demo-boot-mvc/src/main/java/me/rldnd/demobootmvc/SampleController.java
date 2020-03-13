package me.rldnd.demobootmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    // preHandle 1
    // preHandle 2
    // 요청 처리
    // postHandle 2
    // postHandle 1
    // 뷰 렌더링
    // afterCompletion 2
    // afterCompletion 1

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person) {
        return "hello " + person.getName();
    }


    @GetMapping("/message")
    @ResponseBody //@RestController사용시는 생략 가능하다.
    public String message(@RequestBody String message) {
        return message;
    }

    @GetMapping("/jsonMessage")
    @ResponseBody
    public Person jsonMassage(@RequestBody Person person) {
        return person;
    }
}
