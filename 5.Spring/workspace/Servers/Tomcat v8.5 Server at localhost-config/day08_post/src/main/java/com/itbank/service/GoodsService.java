package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.goods.GoodsDAO;
import com.itbank.goods.GoodsDTO;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsDAO dao;

	public List<GoodsDTO> getGoodsList() {
		return dao.selectGoodsList();
	}
}
