package me.rldnd.demowebmvc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@Controller
public class SampleController {

    @RequestMapping(value = "hello", headers = HttpHeaders.FROM + "=" + "111")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    //파라미터도 가능하다
    //@RequestMapping(value = "hello", params = "name")

    //결국 consumes와 produces 모두 headers로 맵핑할 수 있는 것이다.
}
