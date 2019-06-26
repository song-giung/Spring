package com.rldnddl87.springdatabinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String getEvnet(@PathVariable Event event){
        System.out.println(event);
        return event.getId().toString();
    }

}
