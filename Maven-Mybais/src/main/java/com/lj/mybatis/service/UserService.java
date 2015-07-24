package com.lj.mybatis.service;

import java.util.List;

import com.lj.mybatis.entity.User;

public interface UserService {
	
	/**
	 * ����û�
	 */
	public void addUser(int id,String username,String password);
	/**
	 * �޸��û�
	 */
	public int updateUser(int id,String username,String password);
	/**
	 * �����û�IDɾ���û�
	 */
	public void deleteUser(int id);
	/**
	 * �����û�ID��ȡ�û�
	 */
	public User getUserByID(int id);
	/**
	 * ��ȡ�����û�
	 */
	public List<User> getAllUsers();
	/**
	 * ��ҳ��ȡ�û�,
	 */
	public List<User> getUsersByPage(int offset,int pageSize);

}
