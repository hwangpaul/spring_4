package com.asd.s4.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asd.s4.board.BoardDAO;
import com.asd.s4.board.BoardDTO;
import com.asd.s4.util.Pager;

@Service
public class QnaService implements BoardDAO {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		pager.setTotalCount(qnaDAO.getCount(pager));
		pager.makePage();
		
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getOne(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
