package com.hexagon.mvcframework.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hexagon.mvcframework.controller.Controller;
import com.hexagon.mvcframework.dao.BoardDAO;
import com.hexagon.mvcframework.domain.Board;
import com.hexagon.mvcframework.dto.BoardDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegistController implements Controller{

	private BoardDAO boardDAO=new BoardDAO();
	private String viewName;
	private boolean forward;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		log.debug("게시판 등록을 처리합니다");
		
		//클라이언트가 전송한 파라미터를 BoardDTO로 받는다..(보안상)
		Board board = new Board();
		board.setTitle(request.getParameter("subject"));
		board.setWriter(request.getParameter("writer"));
		board.setContent(request.getParameter("content"));
		
		int result = boardDAO.insert(board);
		if(result!=1) { //등록 실패라면..에러 페이지 보여주기 
			viewName="error/result";  //   /views/error/result.jsp
			forward=true; //에러메시지를 저장하기 위해..
			request.setAttribute("errorMessage", "등록 실패입니다");
		}else {
			viewName="redirect:/board/list"; //현재 요청을 끊고, 목록 페이지를 새롭게 들어오도록 만든다
			forward=false;
		}
	}

	@Override
	public String getViewName() {
		return viewName;
	}

	@Override
	public boolean isForward() {
		return forward;
	}

}
