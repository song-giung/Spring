package com.giung.webservice.domain.posts;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.giung.webservice.dto.posts.PostsMainResponseDto;
/*
 * 테스트 코드 생성
 * JUnit 사용
 * - spring-boot-starter-test에 포함되어 있어 따로 build.gradle에 추가 할 필요 없다.
 * - SpringBoot의 테스트 코드는 메모리 DB인 H2를 기본적으로 사용한다.
 * 
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

	@Autowired
	PostsRepository postsRepository;
	
	@After
	public void cleanup() {
		/*
		 * 테스트 메소드가 끝날 때마다 repository 전체를 비워준다 이후 테스트에 영향이 가지 않도록
		 * */
		postsRepository.deleteAll();
	}
	
	@Test
	public void 게시글저장_불러오기() {
		//given (테스트 기반 환경 구축 + builder의 사용)
		postsRepository.save(Posts.builder()
				.title("테스트게시물")
				.content("테스트 본문")
				.author("rldnddl87@gmail.com")
				.build());
		
		//when (테스트 하고자 하는 행위 선언 // 지금은 Posts가 DB에 Insert되는지 확인)
		List<Posts> postsList = postsRepository.findAll();
		
		//then (테스트 결과 검증)
		Posts posts = postsList.get(0);
		assertThat(posts.getTitle(), is("테스트게시물"));
		assertThat(posts.getContent(), is("테스트 본문"));
	}
	
	@Test
	public void BaseTimeEntitly_등록() {
		//given
		LocalDateTime now = LocalDateTime.now();
		postsRepository.save(Posts.builder()
				.title("테스트용 게시글")
				.content("테스트 내용")
				.author("rldnddl87@gmail.com")
				.build());
		
		//when
		List<Posts> postsList = postsRepository.findAll();
		
		//then
		Posts posts = postsList.get(0);
		assertTrue(posts.getCreatedDate().isAfter(now));
		assertTrue(posts.getModifiedDate().isAfter(now));
	}
	
	
	

}
