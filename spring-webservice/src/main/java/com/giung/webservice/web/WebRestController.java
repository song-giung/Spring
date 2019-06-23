package com.giung.webservice.web;

import java.util.Arrays;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.giung.webservice.dto.posts.PostsSaveRequestDto;
import com.giung.webservice.service.PostsService;

import lombok.AllArgsConstructor;

/*
 * @RestController는 @ResponseBody를 모든 메소드에 적용시켜준다.
 * 즉 hello 메소드의 결과 "HelloWorld!"라는 문자열을 JSON형태로 반환하게 된다.
 * */
@RestController
@AllArgsConstructor
public class WebRestController {

	//스프링 프레임워크에서 Bean주입 방식
	// 1.@Autowired 2.setter 3.생성자(권장, lombom의 @AllArgsConstructor가 생성해준 상태)
	private PostsService postsService;
	private Environment env; //project의 환경 설정 값을 다루는 Bean
	
	
	@GetMapping("/hello")
	public String hello(){
		return "HelloWorld!";
	}
	
	/*포스트맨을 사용하여 실제로 DB에 값이 들어가는지 H2 DATABASE를 통해 확인
	 */
	@PostMapping("/posts")
	public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
	    return postsService.save(dto);
	}
	
	/*실행중인 프로젝트의 profile 이 무엇인지 알 수 있도록 하는 API
	 * */
	@GetMapping("/profile") 
	public String getProfile() {
		return Arrays.stream(env.getActiveProfiles())
				.findFirst()
				.orElse("");
			
				
	}
}
