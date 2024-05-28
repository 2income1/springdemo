package com.example.demo.entity;

import lombok.AllArgsConstructor; 
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor 
public class User {
	
	private int user_Id;
	private String user_Name;
	private String user_Pass;
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Pass() {
		return user_Pass;
	}
	public void setUser_Pass(String user_Pass) {
		this.user_Pass = user_Pass;
	}
}
