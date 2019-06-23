package com.giung.webservice.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


/*
 * URL호출시 제대로 페이지가 호출 되는지에 대한 테스트
 * TestRestTemplate를 통해 "/"를 호출하게 되고 main.hbs에 있는 문자열들이 있는지 확인한다. 
 * */


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class WebControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void 메인페이지_로딩() {
		//when
		String body = this.restTemplate.getForObject("/", String.class);
		
		//then
		assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
	}

}
