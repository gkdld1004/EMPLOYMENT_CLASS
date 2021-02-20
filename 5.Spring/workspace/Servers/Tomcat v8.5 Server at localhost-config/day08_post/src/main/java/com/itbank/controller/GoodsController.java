package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.goods.GoodsDTO;
import com.itbank.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService gs;
	
	@GetMapping("store")
	public ModelAndView goodsList() {
		
		ModelAndView mav = new ModelAndView("store");
		
		List<GoodsDTO> list = gs.getGoodsList();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("receipt")
	public ModelAndView receiptList() {
		
		ModelAndView mav = new ModelAndView("receipt");
		
		List<GoodsDTO> list = gs.getGoodsList();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("update")
	public void update() {}
	
}
