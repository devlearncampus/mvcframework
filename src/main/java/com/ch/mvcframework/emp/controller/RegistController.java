package com.ch.mvcframework.emp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ch.mvcframework.controller.Controller;
import com.ch.mvcframework.dto.Dept;
import com.ch.mvcframework.repository.DeptDAO;

/*
 사원 등록 요청을 처리하는 하위 컨트롤러
 3단계: 일 시키기
 4단계: DML 이므로 4단계는 생략    
 */
public class RegistController implements Controller{
	DeptDAO deptDAO=new DeptDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//부서관련 정보 --> Dept2 에 등록
		String deptno=request.getParameter("deptno");
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		
		Dept dept = new Dept();//empty
		dept.setDeptno(Integer.parseInt(deptno));
		dept.setDname(dname);
		dept.setLoc(loc);
		
		deptDAO.insert(dept);
		
		//사원관련 정보  --> Emp2 에 등록 
		String empno=request.getParameter("empno");
		String ename=request.getParameter("ename");
		String sal=request.getParameter("sal");
		
	}

	@Override
	public String getViewName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isForward() {
		// TODO Auto-generated method stub
		return false;
	}
	
}










