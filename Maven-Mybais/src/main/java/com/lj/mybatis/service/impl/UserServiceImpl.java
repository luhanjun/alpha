package com.lj.mybatis.service.impl;

import java.util.List;

import com.lj.mybatis.dao.UserDao;
import com.lj.mybatis.entity.User;
import com.lj.mybatis.service.UserService;

public class UserServiceImpl implements UserService  {

	public User selectUserByID(int id) {
		UserDao userdao=new UserDao();
		return userdao.selectUserByID(id);
	}

	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updatePassword(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserByID(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getUsersByPage(int offset, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
