package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private BuyItemCompleteDAO StockDecreaseDAO = new BuyItemCompleteDAO();

	public String execute() throws SQLException{

		int intStock = Integer.parseInt(session.get("buy_item_Stock").toString());
		int intCount = Integer.parseInt(session.get("count").toString());
		int stockDecrease = intStock - intCount;

		buyItemCompleteDAO.buyItemeInfo(
			session.get("buyItem_id").toString(),
			session.get("login_user_id").toString(),
			session.get("total_price").toString(),
			session.get("count").toString(),
			session.get("pay").toString());


		if(stockDecrease >= 0){
			StockDecreaseDAO.itemStockDecrease(session.get("buyItem_id").toString(), String.valueOf(stockDecrease));
		}
		else{

		}

			String result = SUCCESS;
			return result;
		}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
