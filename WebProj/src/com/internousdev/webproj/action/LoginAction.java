package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	public String execute(){
		return SUCCESS;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String usrname){
		this.username = usrname;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}
}
