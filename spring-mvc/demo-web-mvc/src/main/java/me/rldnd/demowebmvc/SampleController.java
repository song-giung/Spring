package me.rldnd.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(method = RequestMethod.GET) //클래스범위에서도 지정 가능 하다.
public class SampleController {

    @RequestMapping(value = {"/hello", "/hi"}, method = {RequestMethod.GET, RequestMethod.POST}) //http method에 상관없이 실행된다(get,put,delete..)
    @ResponseBody
    public String hello(){
        return "hello";
    }

    /*
     * 요청 식별자
     * ?(한 글자) : "/hello/???" -> "/hello/123"
     * *(여러 글자) : "/hello/*" -> "/hello/rldnd"
     * **(여러 패스) : "/hello/**" -> "/hello/rldnd/spring/boot"
     * */
}
