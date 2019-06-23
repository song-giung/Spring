package com.giung.webservice.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.giung.webservice.domain.posts.Posts;
import com.giung.webservice.domain.posts.PostsRepository;
import com.giung.webservice.dto.posts.PostsMainResponseDto;
import com.giung.webservice.dto.posts.PostsSaveRequestDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {

	@Autowired
	private PostsService postsService;
	
	@Autowired
	private PostsRepository postsRepository;
	
	@After
	public void cleanup() {
		postsRepository.deleteAll();
	}
	
	@Test
	public void Dto_save_postsTable() {
		//given
		PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
									.title("테스트 이름")
									.content("테스트 내용")
									.author("rldnddl87@gmail.com")
									.build();
		//when
		postsService.save(dto);
		
		//then
		Posts posts = postsRepository.findAll().get(0);
		assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
		assertThat(posts.getContent()).isEqualTo(dto.getContent());
		assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
		
	}
	

	
}
