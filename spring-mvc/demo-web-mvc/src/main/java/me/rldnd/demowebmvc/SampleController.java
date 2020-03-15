package me.rldnd.demowebmvc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
public class SampleController {

    @GetHelloMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @PostMapping(value = "hello")
    @ResponseBody
    public String helloPost() {
        return "hello";
    }


    @GetMapping("/events")
    @ResponseBody
    public String getEvents() {
        return "events";
    }

    @GetMapping("/events/{id}")
    @ResponseBody
    public String getEventsWithId(@PathVariable("id") int id) {
        return "events " + id;
    }

    @PostMapping(value = "/events", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String createEventsWithHeader() {
        return "events";
    }

    @DeleteMapping("/events/{id}")
    @ResponseBody
    public String deleteAnEvent(@PathVariable("id") int id) {
        return "deleted " + id;
    }
}
