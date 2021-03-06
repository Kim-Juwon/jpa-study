# jpa-study
JPA 공부 및 내용 정리

### Reference
- [자바 ORM 표준 JPA 프로그래밍](http://www.yes24.com/Product/Goods/19040233) 
- [실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1)
- [실전! 스프링 부트와 JPA 활용2 - API 개발과 성능 최적화](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-API%EA%B0%9C%EB%B0%9C-%EC%84%B1%EB%8A%A5%EC%B5%9C%EC%A0%81%ED%99%94) 

### Goal
- 프로젝트 개발시 JPA를 능숙하게 사용하기 위함
- 일주일마다 목표 분량을 정해서 공부
- 블로그 or 깃허브 레포지토리에 기록 남기기 (저작권 주의)
___

### 공부 내용 기록
#### 자바 ORM 표준 JPA 프로그래밍
##### 1장. JPA 소개
- [SQL을 직접 다룰 때 발생하는 문제점](https://blog.naver.com/damiano102777/222780824494)
- [패러다임의 불일치](https://blog.naver.com/damiano102777/222782356774) 
- [JPA와 ORM 프레임워크는 무엇일까](https://blog.naver.com/damiano102777/222784239123)

##### 2장. JPA 시작
- [엔티티 매니저로 간단한 CRUD 실습해보기](https://blog.naver.com/damiano102777/222788340822) 

##### 3장. 영속성 관리
- [영속성 컨텍스트에 대하여](https://blog.naver.com/damiano102777/222791964802) 
- [플러시(flush)에 대하여](https://blog.naver.com/damiano102777/222794130931) 
- [준영속(Detached)](https://blog.naver.com/damiano102777/222796557021) 
- [SQL 실행 방식](https://blog.naver.com/damiano102777/222797622459) 

##### 4장. 엔티티 매핑
- [테이블 매핑](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/%ED%85%8C%EC%9D%B4%EB%B8%94%20%EB%A7%A4%ED%95%91%20%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98.md) 
- [기본 키 매핑](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/%EA%B8%B0%EB%B3%B8%20%ED%82%A4%20%EB%A7%A4%ED%95%91.md) 
- [필드와 컬럼 매핑](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/%ED%95%84%EB%93%9C%EC%99%80%20%EC%BB%AC%EB%9F%BC%20%EB%A7%A4%ED%95%91.md) 

##### 5장. 연관관계 매핑 기초
- 핵심 키워드
  - [다중성](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/JPA%EC%97%90%EC%84%9C%EC%9D%98%20%EB%8B%A4%EC%A4%91%EC%84%B1%20.md) 
  - [방향](https://blog.naver.com/damiano102777/222807922706)
  - [연관관계의 주인](https://blog.naver.com/damiano102777/222822536268)
- 어노테이션
  - [@ManyToOne과 @JoinColumn](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/%40ManyToOne%EA%B3%BC%20%40JoinColumn.md)
  - @OneToMany
  
##### 6장. 다양한 연관관계 매핑
- 다대일
- 일대다
- 일대일
- 다대다

#### 실전! 스프링 부트와 JPA 활용
- [JPA에서의 properties 파일 주요 속성](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/properties%20%ED%8C%8C%EC%9D%BC%20%EC%A3%BC%EC%9A%94%20%EC%86%8D%EC%84%B1%20.md) 

#### 개인적인 정리
- [엔티티 detach후 merge시 에러 발생에 대하여](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/%EC%97%94%ED%8B%B0%ED%8B%B0%20detach%ED%9B%84%20merge%EC%8B%9C%20%EC%97%90%EB%9F%AC%20%EB%B0%9C%EC%83%9D%EC%97%90%20%EB%8C%80%ED%95%98%EC%97%AC.md)
- [JDBC와 Persistence 프레임워크](https://github.com/Kim-Juwon/today-i-learned/blob/main/jpa/JDBC%EC%99%80%20Persistence%20%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC.md) 
