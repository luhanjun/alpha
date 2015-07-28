package com.lj.mybatis.service;

import java.util.List;

import com.lj.mybatis.entity.User;

public interface UserService {
	
	/**
	 * 根据用户ID获取用户
	 */
	public User selectUserByID(int id);
	/**
	 * 获取r所有用户
	 */
	public List<User> selectAllUser();
	
	/**
	 * 添加用户
	 */
	public void insertUser(User user);
	/**
	 * 修改用户密码
	 */
	public void updatePassword(User user);
	
	/**
	 * 删除用户
	 */
	public void deleteUserByID(int id);
	
	
	/**
	 * 分页获取用户,
	 */
	public List<User> getUsersByPage(int offset,int pageSize);

}
