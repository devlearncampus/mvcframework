package com.ch.mvcframework.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 엔터프라이즈급의 규모가 큰 애플리케이션에서 클라이언의 수많은 요청 마다 1:1 대응하는 서블릿을 선언하고
 * 매핑한다면, 매핑규모가 너무나 방대해지고 유지보수성이 오히려 저해 된다. 
 * 해결책) 앞으로 요청에 대한 매핑은 오직 하나의 진입점으로 몰아서 관리하자!!(예- 대기업의 고객센터와 흡사)
 * */
public class DispatcherServlet extends HttpServlet{
	
	//음식, 영화, 블로그, 음악 등등의 모든 요청을 이 클래스에서 받아야 함,,이때 요청 시 메서드가 Get, Post, Put, Delete..모든 종류의
	//요청을 다 받을 수 있어야 함 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}













