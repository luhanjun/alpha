package com.lj.mybatis.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lj.mybatis.entity.User;
import com.lj.mybatis.service.UserService;
import com.lj.mybatis.utils.MySqlSessionFactory;

public class UserDao {
	@SuppressWarnings("static-access")  
    public void add(int id, String username, String password)  
    {  
        SqlSession session = MySqlSessionFactory.getInstance().getSqlSessionFactory().openSession();  
        try  
        {  
            session.getMapper(UserService.class).addUser(id, username, password);  
            session.commit();// 提交事务  
        } catch (Exception e)  
        {  
            e.printStackTrace();  
        } finally  
        {  
            session.close();  
        }  
    }  
  
    @SuppressWarnings("static-access")  
    public void delete(int id)  
    {  
        SqlSession session = MySqlSessionFactory.getInstance().getSqlSessionFactory().openSession();  
        try  
        {  
            session.getMapper(UserService.class).deleteUser(id);  
            session.commit();// 提交事务  
        } catch (Exception e)  
        {  
            e.printStackTrace();  
        } finally  
        {  
            session.close();  
        }  
    }  
  
    @SuppressWarnings("static-access")  
    public int update(String username, String password, int id)  
    {  
        int count = 0;  
        SqlSession session = MySqlSessionFactory.getInstance().getSqlSessionFactory().openSession();  
        try  
        {  
            // Map<String, Object> map=new HashMap<String, Object>();  
            // map.put("username", user.getUsername());  
            // map.put("password", user.getPassword());  
            // session.update("updateUser", map);  
            count = session.getMapper(UserService.class).updateUser(id,username, password);  
            session.commit();// 提交事务  
        } catch (Exception e)  
        {  
            count = 0;  
            e.printStackTrace();  
        } finally  
        {  
            session.close();  
        }  
        return count;  
    }  
  
    @SuppressWarnings("static-access")  
    public List<User> getUsers(int offset, int pageSize)  
    {  
        List<User> users = new ArrayList<User>();  
        SqlSession session = MySqlSessionFactory.getInstance().getSqlSessionFactory().openSession();  
        try  
        {  
            // users=session.selectList("user_list_page", new User(),new  
            // RowBounds(offset,pageSize));//未测试过  
            // 注解方式查询  
            users = session.getMapper(UserService.class).getUsersByPage(offset, pageSize);  
        } catch (Exception e)  
        {  
            e.printStackTrace();  
        } finally  
        {  
            session.close();  
        }  
        return users;  
    }  
}
