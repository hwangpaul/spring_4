package com.asd.s4.board.notice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.asd.s4.MyTestCase;
import com.asd.s4.board.BoardDAO;
import com.asd.s4.board.BoardDTO;

public class NoticeDAOTest extends MyTestCase{

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void setInsertTest() throws Exception{
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("title test");
		boardDTO.setWriter("writer test");
		boardDTO.setContents("contents test");
		
		int result = noticeDAO.setInsert(boardDTO);
		assertEquals(1, result);
		
		
	}

}
