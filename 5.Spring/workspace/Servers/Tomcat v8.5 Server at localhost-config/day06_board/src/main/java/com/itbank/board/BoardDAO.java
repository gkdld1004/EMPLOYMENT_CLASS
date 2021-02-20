package com.itbank.board;

import java.util.HashMap;
import java.util.List;

public interface BoardDAO {


	int selectCount(HashMap<String, Object> map);

	List<BoardDTO> selectList(HashMap<String, Object> map);

	BoardDTO selectOne(int idx);

	BoardDTO write(String title, String context);

	int insertBoard(BoardDTO user);

	int selectMaxIdx();

}
