package me.rldnd.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    @GetMapping("/events/form")
    public String eventsForm(Model model) {
        Event newEvent = new Event();
        newEvent.setLimit(50);
        model.addAttribute("event", newEvent);
        return "/events/form";
    }

    @PostMapping("/events")
    public String createEvents(@Valid @ModelAttribute Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
           return "/events/form";
        }

        List<Event> eventList = new ArrayList<>();
        eventList.add(event);
        //db save
        return "redirect:/events/lists";
    }

    @GetMapping("/events/lists")
    public String getEvents(Model model) {

        //db read
        Event event = new Event();
        event.setName("spring");
        event.setLimit(50);

        List<Event> eventList = new ArrayList<>();
        eventList.add(event);

        model.addAttribute(eventList);


        return "/events/lists";
    }


}
