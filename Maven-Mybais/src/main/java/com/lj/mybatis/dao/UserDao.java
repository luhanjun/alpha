package com.lj.mybatis.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lj.mybatis.entity.User;
import com.lj.mybatis.service.UserService;
import com.lj.mybatis.utils.MySqlSessionFactory;

public class UserDao {
	public User selectUserByID(int id){
		User user=new User();
		SqlSessionFactory sqlsessionFactory=MySqlSessionFactory.getInstance().getSqlSessionFactory();
		
		SqlSession session=sqlsessionFactory.openSession();
		try
		{
			user=session.getMapper(UserService.class).selectUserByID(id);
		}catch(Exception e){
			
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return user;
	}
}
