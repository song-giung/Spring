package com.giung.webservice.dto.posts;

import com.giung.webservice.domain.posts.Posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Contorller에서 사용할 DTO 클래스 
 * Posts(Entity)와 유사한 DTO클래스를 추가 했다.
 * 이 Entity 클래스를 Request/Response 클래스로 사용해서는 안된다(Controller를 통한 View Layaer와 DB Layer의 분리를 위해..)
 * 
 * */
@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
	
	private String title;
	private String content;
	private String author;
	
	@Builder
	public PostsSaveRequestDto(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Posts toEntity() {
		return Posts.builder()
				.title(title)
				.content(content)
				.author(author)
				.build();
	}
}
