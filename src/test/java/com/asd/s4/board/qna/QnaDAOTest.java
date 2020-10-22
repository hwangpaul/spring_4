package com.asd.s4.board.qna;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.asd.s4.MyTestCase;
import com.asd.s4.board.BoardDAO;
import com.asd.s4.board.BoardDTO;
import com.asd.s4.util.Pager;

public class QnaDAOTest extends MyTestCase{
	
	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void getListTest() throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		
		List<BoardDTO> ar = qnaDAO.getList(pager);
		
		assertEquals(10, ar.size());
		System.out.println(ar.size());
	}
	
	//@Test
	public void setInsertTest() throws Exception{
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("test title a");
		boardDTO.setWriter("test writer a");
		boardDTO.setContents("test contents a");
		
		int result = qnaDAO.setInsert(boardDTO);
		assertEquals(1, result);
		
	}
	
	}
