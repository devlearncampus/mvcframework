package com.ch.mvcframework.movie.model;

/*
	javaSE 이건, javaEE, javaME 등에 이건 상관없이 재사용이 가능한 중립적 코드를 정의하기 위함 
*/
public class MovieManager {
	
	/*
	모든 플랫폼에서 재사용 가능한 객체 = Model 영역 정의  
	*/
	public String getAdvice(String movie) {
		String msg="선택한 영화가 없음";
		
		if(movie !=null){ //파라미터가 있을때만..
			if(movie.equals("귀멸의칼날")){
				msg="최신 일본 에니메이션 개봉작";		
			}else if(movie.equals("미션임파서블")){
				msg="톰크루즈 첩보 액션 시리즈";		
			}else if(movie.equals("에이리언")){
				msg="외계 생명체 SF 시리즈";		
			}else if(movie.equals("주토피아")){
				msg="디즈니 에니메이션";		
			}
		}		
		return msg;
	}
}
