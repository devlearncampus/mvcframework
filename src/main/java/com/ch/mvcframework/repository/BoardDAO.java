package com.ch.mvcframework.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ch.mvcframework.dto.Board;
import com.ch.mvcframework.mybatis.MybatisConfig;

//Model
public class BoardDAO {
	MybatisConfig mybatisConfig=MybatisConfig.getInstance();
	//글 한건 등록 
	public int insert(Board board) {
		int result=0;
		SqlSession sqlSession=mybatisConfig.getSqlSession();
		result=sqlSession.insert("Board.insert", board);
		//SqlSession은 디폴트로 autocommit 속성이 false로 되어있음
		//즉 commit 하지 않으면 insert 가 db에 확정되지 않음 
		sqlSession.commit();//DML만을 대상으로 함 
		mybatisConfig.release(sqlSession);
		return result;
	}
	
	//모든 글 가져오기 
	public List selectAll() {
		List list=null;
		SqlSession sqlSession=mybatisConfig.getSqlSession();
		list=sqlSession.selectList("Board.selectAll");
		mybatisConfig.release(sqlSession);
		return list;
	}
	
	//게시물 1건 가져오기 
	public Board select(int board_id) {
		Board board=null;
		SqlSession sqlSession=mybatisConfig.getSqlSession();
		board=sqlSession.selectOne("Board.select", board_id);
		mybatisConfig.release(sqlSession);
		return board;
	}
	
	//1건 삭제 
	public int delete(int board_id) {
		int result=0;
		//SqlSession = Connection + PreparedStatement 두개를 합친객체
		SqlSession sqlSession=mybatisConfig.getSqlSession();
		sqlSession.delete("Board.delete", board_id);
		sqlSession.commit();//트랜잭션 확정 
		mybatisConfig.release(sqlSession);
		return result;
	}
	
	//1건 수정 
	public int update(Board board) {
		int result=0;
		SqlSession sqlSession=mybatisConfig.getSqlSession();
		sqlSession.update("Board.update", board);
		//DML은 commit 대상임
		sqlSession.commit();
		mybatisConfig.release(sqlSession);
		return result;
	}
}









