package com.lj.mybatis.service;

import java.util.List;

import com.lj.mybatis.entity.User;

public interface UserService {
	
	/**
	 * 添加用户
	 */
	public void addUser(int id,String username,String password);
	/**
	 * 修改用户
	 */
	public int updateUser(int id,String username,String password);
	/**
	 * 根据用户ID删除用户
	 */
	public void deleteUser(int id);
	/**
	 * 根据用户ID获取用户
	 */
	public User getUserByID(int id);
	/**
	 * 获取所有用户
	 */
	public List<User> getAllUsers();
	/**
	 * 分页获取用户,
	 */
	public List<User> getUsersByPage(int offset,int pageSize);

}
