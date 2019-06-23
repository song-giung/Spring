package com.giung.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.giung.webservice.service.PostsService;

import lombok.AllArgsConstructor;
/*
 * @GetMapping 은 @RequestMapping(value="/", method=RequestMethod.GET)과 같다.
 * 
 * handlebars-springb-boot-starter 로 인해서 컨트롤러에서 return으로 문자열을 반환할 때
 * prefix와 suffix가 자동으로 지정된다.(prefix: src/main/resource/templates, suffix:.hbs)
 * 
 * */
@Controller
@AllArgsConstructor
public class WebController {
	
	private PostsService postsService;
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("posts", postsService.findAllDesc());
		return "main";
	}
}
