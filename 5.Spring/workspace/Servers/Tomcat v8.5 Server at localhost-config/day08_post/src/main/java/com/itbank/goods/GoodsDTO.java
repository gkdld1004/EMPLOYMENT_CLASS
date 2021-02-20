package com.itbank.goods;

public class GoodsDTO {

//	TABLE	   GOODS1
//	IDX        NOT NULL NUMBER       
//	GOODSNAME  NOT NULL VARCHAR2(20) 
//	GOODSPRICE NOT NULL VARCHAR2(20) 
//	GOODSCOUNT NOT NULL NUMBER   
	
	private int idx, goodscount;
	private String goodsname, goodsprice;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getGoodscount() {
		return goodscount;
	}
	public void setGoodscount(int goodscount) {
		this.goodscount = goodscount;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}
	
	
	
}
