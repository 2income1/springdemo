package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.User;

@Mapper
public interface UserDao {

	public User queryUserById(Integer id);

	public int addUser(String name, String pass);

	public int deleteByUserName(String name);

	public int updateByUserName(String name, String pass);

}
