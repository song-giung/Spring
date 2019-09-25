package com.rldnddl87.httpmessegeconverter.springhttpmessageconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(String body) {

        return "hello";
    }
}
