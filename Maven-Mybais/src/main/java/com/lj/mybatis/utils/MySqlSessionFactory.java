package com.lj.mybatis.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lj.mybatis.service.UserService;

public class MySqlSessionFactory {
	public static SqlSessionFactory sqlSessionFactory=null;
	
	public static MySqlSessionFactory mySqlSessionFactory=null;
	private MySqlSessionFactory(){
		 String rs = "mybatis-config.xml";  
	        Reader reader = null;  
	        try  
	        {  
	            reader = Resources.getResourceAsReader(rs);  
	        } catch (IOException e)  
	        {  
	            e.printStackTrace();  
	        }  
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);  
	        // 注解方式查询时需要注册mapper  
//	        sqlSessionFactory.getConfiguration().addMapper(UserService.class);		
	}
	public static MySqlSessionFactory getInstance(){
		if(mySqlSessionFactory==null){
			mySqlSessionFactory=new MySqlSessionFactory();
		}
		return mySqlSessionFactory;
	}
	
	 public static SqlSessionFactory getSqlSessionFactory()  
	    {  
	        return sqlSessionFactory;  
	    }  
	
	

}
