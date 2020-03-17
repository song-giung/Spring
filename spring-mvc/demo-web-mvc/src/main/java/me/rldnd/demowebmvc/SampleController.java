package me.rldnd.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @GetMapping("/events/{id}")
    @ResponseBody
    public Event getEvents(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "rldnd") String name) {
        Event event = new Event();
        event.setId(id);
        event.setName(name);
        return event;
    }




}
