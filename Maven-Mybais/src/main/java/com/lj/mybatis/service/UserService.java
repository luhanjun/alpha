package com.lj.mybatis.service;

import java.util.List;

import com.lj.mybatis.entity.User;

public interface UserService {
	
	/**
	 * �����û�ID��ȡ�û�
	 */
	public User selectUserByID(int id);
	/**
	 * ��ȡr�����û�
	 */
	public List<User> selectAllUser();
	
	/**
	 * ����û�
	 */
	public void insertUser(User user);
	/**
	 * �޸��û�����
	 */
	public void updatePassword(User user);
	
	/**
	 * ɾ���û�
	 */
	public void deleteUserByID(int id);
	
	
	/**
	 * ��ҳ��ȡ�û�,
	 */
	public List<User> getUsersByPage(int offset,int pageSize);

}
