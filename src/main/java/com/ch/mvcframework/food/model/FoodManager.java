package com.ch.mvcframework.food.model;

/*
	javaSE 이건, javaEE, javaME 등에 이건 상관없이 재사용이 가능한 중립적 코드를 정의하기 위함 
*/
public class FoodManager {
	/*
	모든 플랫폼에서 재사용 가능한 객체 = Model 영역 정의  
	*/
	public String getAdvice(String movie) {
		String msg="선택한 음식이 없음";
		
		if(movie !=null){ //파라미터가 있을때만..
			if(movie.equals("부대찌게")){
				msg="햄과 고기가 들어간 한식";		
			}else if(movie.equals("돈까스")){
				msg="돼지고기 튀긴것";		
			}else if(movie.equals("에그드랍")){
				msg="요즘 뜨는 샌드위치 브랜드";		
			}else if(movie.equals("초밥")){
				msg="일본 대표음식";		
			}
		}		
		return msg;
	}
}
