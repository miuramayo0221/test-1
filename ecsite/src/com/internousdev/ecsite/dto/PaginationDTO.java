package com.internousdev.ecsite.dto;

import java.util.ArrayList;
import java.util.List;

public class PaginationDTO {
	//全ページ数
	private int totalPageSize;
	//現在のページ数
	private int currentPageNo;
	//全レコード数
	private int totalRecordSize;
	//開始レコード番号
	private int startRecordNo;
	//終了レコード番号
	private int endRecordNo;
	//ページャーに表示するページ番号一覧
	private List<Integer> pageNumberList = new ArrayList<Integer>();
	//1ページ分の商品情報
	private List<ItemInfoDTO> currentItemInfoPage;
	//次ページが存在するか
	private boolean hasNextPage;
	//次ページ番号
	private int nextPageNo;
	//前ページが存在するか
	private boolean hasPreviousPage;
	//前ページ番号
	private int previousPageNo;
	public int getTotalPageSize() {
		return totalPageSize;
	}
	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public int getTotalRecordSize() {
		return totalRecordSize;
	}
	public void setTotalRecordSize(int totalRecordSize) {
		this.totalRecordSize = totalRecordSize;
	}
	public int getStartRecordNo() {
		return startRecordNo;
	}
	public void setStartRecordNo(int startRecordNo) {
		this.startRecordNo = startRecordNo;
	}
	public int getEndRecordNo() {
		return endRecordNo;
	}
	public void setEndRecordNo(int endRecordNo) {
		this.endRecordNo = endRecordNo;
	}
	public List<Integer> getPageNumberList() {
		return pageNumberList;
	}
	public void setPageNumberList(List<Integer> pageNumberList) {
		this.pageNumberList = pageNumberList;
	}
	public List<ItemInfoDTO> getCurrentItemInfoPage() {
		return currentItemInfoPage;
	}
	public void setCurrentItemInfoPage(List<ItemInfoDTO> currentItemInfoPage) {
		this.currentItemInfoPage = currentItemInfoPage;
	}
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public int getNextPageNo() {
		return nextPageNo;
	}
	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}
	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}
	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}
	public int getPreviousPageNo() {
		return previousPageNo;
	}
	public void setPreviousPageNo(int previousPageNo) {
		this.previousPageNo = previousPageNo;
	}


}
