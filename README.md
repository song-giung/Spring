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
## Side Project
- [file-name-converter](https://github.com/rldnddl87/Spring/tree/master/file-name-converter) : 파일 이름 변환기
- [Spring-webservice](https://github.com/rldnddl87/Spring/tree/master/spring-webservice) : 간단한 웹 서비스 만들어 보기
- [Spring-boot-admin](https://github.com/rldnddl87/Spring/tree/master/spring-boot-admin) : JPA를 이용한 CRUD