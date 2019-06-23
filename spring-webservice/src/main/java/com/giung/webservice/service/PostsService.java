package com.giung.webservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giung.webservice.domain.posts.PostsRepository;
import com.giung.webservice.dto.posts.PostsMainResponseDto;
import com.giung.webservice.dto.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

/*
 * 비지니스 로직과 트랜잭션 관리는 모두 Service에서 담당한다.
 * View와 연동되는 부분은 Controller에서 담당한다.
 * @Transaction이란 메소드에서 Exception이 발생하면 메소드에서 실행된 DB작업을 모두 초기화 시킨다.
 * */
@AllArgsConstructor
@Service
public class PostsService {
	
	private PostsRepository postsRepository;
	
	@Transactional
	public Long save(PostsSaveRequestDto dto) {
	    return postsRepository.save(dto.toEntity()).getId();
	}
	
	/*
	 * .map(PostsMainResponseDto::new)는 람다식으로 실제로는 .map(posts -> new PostsMainResponseDto(posts))와 같다.
	 * PostsRepository결과로 넘어온 Posts의 Stream을 map을 통해 PostsMainResponseDto로 변환한 뒤 -> List로 반환하는 메소드이다.
	 * */
	@Transactional(readOnly = true)
	public List<PostsMainResponseDto> findAllDesc(){
		return postsRepository.findAllDesc()
				.map(PostsMainResponseDto::new)
				.collect(Collectors.toList());
	}
	
}
