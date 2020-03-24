package me.rldnd.demowebmvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;

//전역 컨트롤러에 적용 + 범위 지정 가능
//@RestControllerAdvice또한 존재 ResponseBody만 추가되었을 뿐이다.
@ControllerAdvice(assignableTypes = {EventController.class, EventApi.class})
public class BaseController {

    @ExceptionHandler
    public String eventErrorHandler(EventException exception, Model model) {
        model.addAttribute("message", "event error");
        return "error";
    }

    @InitBinder
    public void initEventBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }

    @ModelAttribute
    public void categories(Model model) {
        model.addAttribute("categories", Arrays.asList("study", "seminar", "hobby", "social"));
    }

}
