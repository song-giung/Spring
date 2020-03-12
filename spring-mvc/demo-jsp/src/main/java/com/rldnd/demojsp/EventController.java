package com.rldnd.demojsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class EventController {

    @GetMapping("/events")
    public String events(Model model){
        Event event1 = new Event();
        event1.setName("event1");
        event1.setStartTime(LocalDateTime.of(2019,2,5,8,5));

        Event event2 = new Event();
        event2.setName("event2");
        event2.setStartTime(LocalDateTime.of(2019,2,7,8,5));

        List<Event> events = Arrays.asList(event1,event2);

        model.addAttribute("events", events);
        model.addAttribute("message", "hello jsp with boot");
        return "events/test";
    }
}
