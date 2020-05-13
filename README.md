# 목차
- - -   
## Spirng 공부
- [IoC](https://github.com/rldnddl87/Spring/tree/master/spring-ioc)
- [Data Binding - PropertyEditor and Converter and Formatter](https://github.com/rldnddl87/Spring/tree/master/spring-databinder)
- [SpEL](https://github.com/rldnddl87/Spring/tree/master/spring-el)
- [AOP](https://github.com/rldnddl87/Spring/tree/master/spring-aop)
- [Null-Safety](https://github.com/rldnddl87/Spring/tree/master/spring-null-safety)
- - -  
## Spring MVC
- [Spring Boot 의 MVC 설정](https://github.com/rldnddl87/Spring/tree/master/spring-mvc/mvc1)
- [Spring MVC 기본 설정](https://github.com/rldnddl87/Spring/tree/master/spring-mvc/basicservlet) 
- [Spring Boot환경에서 JSP사용하기](https://github.com/rldnddl87/Spring/tree/master/spring-mvc/demo-jsp)
- [Spring MVC 기타 설정](https://github.com/rldnddl87/Spring/tree/master/spring-mvc/demo-boot-mvc)
	1. [MVC환경에서 Formatter 사용](https://github.com/rldnddl87/Spring/commit/4fb05b1dbae59dfdb6d38b653ca45eec14ff586e#diff-a2d42c4e0ae8b26c60004ee29804b68a)
	2. [Boot환경에서 Formatter 사용](https://github.com/rldnddl87/Spring/commit/a4683017bfd629616e8532378b7561b998f3cd3b#diff-a2d42c4e0ae8b26c60004ee29804b68a)
	3. [JPA Repository 도메인 컨버터](https://github.com/rldnddl87/Spring/commit/8f7802e3e3b1bebe8ff1eba5539610a352888f9c#diff-a2d42c4e0ae8b26c60004ee29804b68a)
	4. [핸들러 인터셉터](https://github.com/rldnddl87/Spring/commit/7f31245afb87f0b5782367c5696a583fe054091f#diff-a2d42c4e0ae8b26c60004ee29804b68a)
	5. [리소스 핸들러](https://github.com/rldnddl87/Spring/commit/560b2498bc9dbb40a518ea4c05701ad5434a9fd4#diff-a2d42c4e0ae8b26c60004ee29804b68a)
	6. [HTTP 메세지 컨버터 - JSON](https://github.com/rldnddl87/Spring/commit/45543f1f629e30a5bdc00b79a2309c18adc25eb1#diff-a2d42c4e0ae8b26c60004ee29804b68a)
	7. [HTTP 메세지 컨버터 - XML](https://github.com/rldnddl87/Spring/commit/fe05d2f20ce6720ca0d0c31b21cc958149161672#diff-a2d42c4e0ae8b26c60004ee29804b68a)
- [Spring MVC 활용](https://github.com/rldnddl87/Spring/tree/master/spring-mvc/demo-web-mvc)
	- 요청 맵핑하기  
		1. [HTTP METHOD / URI 패턴](https://github.com/rldnddl87/Spring/commit/408df5a8c477da210aaf5c3e6eca1e68785f39fb#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		2. [미디어 타입](https://github.com/rldnddl87/Spring/commit/00c4903804fe26746c5cbc90755fd5798081b38f#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		3. [헤더 / 파라미터](https://github.com/rldnddl87/Spring/commit/185cb21fa76d327feca992aa30c43d9b721b220a#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		4. [head / options 요청](https://github.com/rldnddl87/Spring/commit/bb6a41557d3c55ce44210c874d7a612346816db3#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		5. [커스텀 어노테이션](https://github.com/rldnddl87/Spring/commit/220f6e8904f974fb70e2f6a1b90473cce1d07589#diff-671cb6602c95d6bf30d96a92cbfdff1f)
	- 핸들러 메소드  
		1. [URI패턴 @PathVariable & @MatrixVariable](https://github.com/rldnddl87/Spring/commit/81628054b8d53f3148b8452c425351e34b2240ec#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		2. [요청 매개변수(단순 타입)](https://github.com/rldnddl87/Spring/commit/c02bc28cb8c395eaf26b1150dc13ce669f27294c#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		3. [요청 매개변수(단순타입) / 폼 서브밋](https://github.com/rldnddl87/Spring/commit/5880107051689e80f0768272a5fe22ad21df42d3#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		4. [@ModelAttribute + BindingResult / @Valid](https://github.com/rldnddl87/Spring/commit/455e9814812df4d03507f5437280ef7724553981#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		5. [@Validated 그룹화](https://github.com/rldnddl87/Spring/commit/9f785abfcb7c1858b7fcfaf0f2f3359c513c04e2#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		6. [폼 서브밋 에러 처리 / post,redirect,get 패턴](https://github.com/rldnddl87/Spring/commit/739bcea0168e6bdd5eb86f075dd04b98468bab87#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		7. [@SessionAttributes / SessionStatus / @ModelAttribute의 Session 데이터 바인딩](https://github.com/rldnddl87/Spring/commit/b8083f080584a802c326c8d21138f62c111637b5#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		8. [멀티 폼 서브밋](https://github.com/rldnddl87/Spring/commit/5dc20bddd3e8d42d549d17f6dea829ea09f41001#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		9. [@SessionAttribute](https://github.com/rldnddl87/Spring/commit/55bc6561ec8e1a539811299ab5ff079c52ca7094#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		10. [RedirectAttributes](https://github.com/rldnddl87/Spring/commit/a7ae14337246891edabb22245270ea6f4183b921#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		11. [FlashAttributes](https://github.com/rldnddl87/Spring/commit/2d84763f2871222c5f96bef33c57431fc9086ec9#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		12. [MultipartFile](https://github.com/rldnddl87/Spring/commit/3411acd391d0d2254859fcdadf1c9ddadcafbbac#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		13. [ResponseEntity / 파일 다운로드](https://github.com/rldnddl87/Spring/commit/edb58ab56b22fd7e525ccfe3c7ba826c6be8fb3c#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		14. [@RequestBody & HttpEntity](https://github.com/rldnddl87/Spring/commit/fadcb5e65e96ebd326ba1d25b9b66db8587f2047#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		15. [@ResponseBody & ResponseEntity](https://github.com/rldnddl87/Spring/commit/7506f4dfe9c19c9b2c79b59f27c7120e4b9bba01#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		16. [@ModelAttribute](https://github.com/rldnddl87/Spring/commit/869e1cdbe12216fc786c82e55720472b2c368f0e#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		17. [@JsonView](https://github.com/rldnddl87/Spring/commit/52cad6ce019a2c447a5879a1ed9a3cacca3e6a75#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		18. [@InitBinder](https://github.com/rldnddl87/Spring/commit/3a9bbfe550f6227e7ab4919451312ec6b68eea90#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		19. [@ExceptionHandler](https://github.com/rldnddl87/Spring/commit/94bd6a8ebe5c7034f71c07741579f1f75e29edc7#diff-671cb6602c95d6bf30d96a92cbfdff1f)
		20. [@ControllerAdvice](https://github.com/rldnddl87/Spring/commit/9f25779aa7d6d24edc6d9ba9babc0fd3de57bd15#diff-671cb6602c95d6bf30d96a92cbfdff1f)
- - -
## Spring Boot
- Spring Boot Auto-Configuration
	1. [Create](https://github.com/rldnddl87/Spring/commit/16cddbd13bd718edccabbde7f7891e7985ec719c)
	2. [Apply](https://github.com/rldnddl87/Spring/commit/7eafd149dff9d88dbab37ac4a27451ec65a90c81)
- 내장 웹 서버의 이해
	1. [서블릿 컨테이너 변경하기(tomcat -> undertow)](https://github.com/rldnddl87/Spring/commit/73b7130b29bb564583972ab992860be709898bd9)
	2. [https 적용](https://github.com/rldnddl87/Spring/commit/2aa57f9a411e121bc15507cd516c22c0819b5376)
	3. [http2 적용](https://github.com/rldnddl87/Spring/commit/5a8b6d6897be0fa3375835e621d01632ce01739a)
- [@ConfigurationProperties](https://github.com/rldnddl87/Spring/commit/00f14283508b77315806a0e1d79adf0ea30c6100)
- [Profile](https://github.com/rldnddl87/Spring/commit/d3b39cf768b0a110909c89a2492e068016089b9e)
- [로깅](https://github.com/rldnddl87/Spring/commit/e1fd8a01a4cab2713dd63cd35b16480ae797c82b)
- 테스트
	1. [MockMvc](https://github.com/rldnddl87/Spring/commit/9ae39f0eea0d7df07dcaea96fec6fdd3d72e4c8b)
	2. [MockBean](https://github.com/rldnddl87/Spring/commit/490714aacd1cf55be5e2f56f4b9af99e37427389)
	3. [WebTestClient](https://github.com/rldnddl87/Spring/commit/62a3c10b189073386037b5ef915c7fde3414dfe9)
- Spring MVC
  - [HttpMessageConverter](https://github.com/rldnddl87/Spring/commit/8ac604953aaabc309e7c0f2ac7cf535c8fb39183)
  - [HttpMessageConverter - xml](https://github.com/rldnddl87/Spring/commit/4849dca4e9c1217d855f3f36240e5a98474dfb14)
  - [정적리소스](https://github.com/rldnddl87/Spring/commit/642e3a8c09e2afe8dc91a82d9f818045ea888b28)
  - [WebJar지원](https://github.com/rldnddl87/Spring/commit/19ddf6dc7aede898bdb5bae394fd49b265ae881e)
  - [Thymeleaf](https://github.com/rldnddl87/Spring/commit/2fe3b2ace645eec8b8418b15b74660cacf276a24)
  - [HtmlUnit을 이용한 html 테스트](https://github.com/rldnddl87/Spring/commit/f4f41e4098ff672aac7e9b42b2cac6c7ee050599)
  - [예외처리](https://github.com/rldnddl87/Spring/commit/a13dbeb3cd784dfb3b6d666672f9b974aa30b589)   
  - [HATEOAS 맛보기](https://github.com/rldnddl87/Spring/commit/571823342d80f0a8746608958a37f2bc2d381c82)
  - [CORS설정](https://github.com/rldnddl87/Spring/commit/e77ca5d07844dfff5c572103d68b0968c31beaca)
- Spring Data
  - [H2](https://github.com/rldnddl87/Spring/commit/eb158fcbfa61b3627052255bf03978b7aa2e8e86)
  - [PostgreSQL](https://github.com/rldnddl87/Spring/commit/9fb0d33fdc377dc07c9292848912a4ebe0750ba6)
  - [Entity/Repository/슬라이스 테스트](https://github.com/rldnddl87/Spring/commit/dd016aa590c23281c931066ad8f1cb0f7c635052)
  - [DB 초기화](https://github.com/rldnddl87/Spring/commit/df009c52d66dd19680614cecdf16293eac97c20a)
  - [DB 형상관리/마이그레이션툴 flyway 맛보기](https://github.com/rldnddl87/Spring/commit/02e167a1a3ff696da17c9cb3dd99eee1c3b85b04)
  - [Redis](https://github.com/rldnddl87/Spring/commit/8a1efb23f217ee7d72c1ea8bce84dc97150ae83e)
  - [MongDB](https://github.com/rldnddl87/Spring/commit/ac949471311b64c269208d072e57c31f26896342)
  - [Neo4j](https://github.com/rldnddl87/Spring/commit/f349b9ba6d5018c2525e1f112385ad455600e4f5)
- [Spring Security 맛보기](https://github.com/rldnddl87/Spring/commit/df72e293196259f4508f1fa6e514aaae9bada7ac)

- - -
## Side Project
- [file-name-converter](https://github.com/rldnddl87/Spring/tree/master/file-name-converter) : 파일 이름 변환기
- [Spring-webservice](https://github.com/rldnddl87/Spring/tree/master/spring-webservice) : 간단한 웹 서비스 만들어 보기
- [Spring-boot-admin](https://github.com/rldnddl87/Spring/tree/master/spring-boot-admin) : JPA를 이용한 CRUD