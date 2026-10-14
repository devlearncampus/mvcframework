package com.hexagon.mvcframework.dao;

import org.apache.ibatis.session.SqlSession;

import com.hexagon.mvcframework.domain.Board;
import com.hexagon.mvcframework.mybatis.MybatisConfig;

//CRUD를 수행하는 객체, 단 쿼리문을 직접 짜지 않고 mybatis 를 이용한다
public class BoardDAO {
	MybatisConfig config=MybatisConfig.getInstance();
	
	//insert !!
	public int insert(Board board) {
		int result = 0;
		
		try(SqlSession sqlSession = config.getSqlSession()){
			result = sqlSession.insert("Board.insert", board);
			sqlSession.commit();
		}
		//mybatis 에게 시키기 ( SqlSession)
		return result;
	}
}
