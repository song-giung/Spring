package me.rldnd.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("event") //배열 형식{} 으로 여러 값을 설정할 수 있고 Model의Attribute에 설정한 이름의 값이 담긴다면 자동으로 세션에도 담긴다.
public class SampleController {

    @GetMapping("/events/form")
    public String eventsForm(Model model, HttpSession httpSession) {
        Event newEvent = new Event();
        newEvent.setLimit(50);
        model.addAttribute("event", newEvent);
        httpSession.setAttribute("event1", newEvent);
        return "/events/form";
    }

    @PostMapping("/events")
    public String createEvents(@Valid @ModelAttribute Event event, BindingResult bindingResult, SessionStatus sessionStatus) {
        if (bindingResult.hasErrors()) {
           return "/events/form";
        }

        List<Event> eventList = new ArrayList<>();
        eventList.add(event);
        //db save
        sessionStatus.setComplete();
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
