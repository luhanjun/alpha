package com.lj.mybatis.entity;
/**
 * 实体-用户类
 * @author Administrator
 *
 */
public class User {
	private int id;
    private String userName;
    private String password;
    private int userAge;
    private String userAddress;
    private int dr;//校验是否删除 1、为删除  0、正常
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getDr() {
		return dr;
	}
	public void setDr(int dr) {
		this.dr = dr;
	}
    
    
    
    
    
    
    

}
