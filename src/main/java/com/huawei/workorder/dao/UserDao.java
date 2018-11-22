package com.huawei.workorder.dao;

import org.apache.ibatis.annotations.Mapper;

import com.huawei.workorder.model.User;

@Mapper
public interface UserDao {

	//select
	public User selectUserByUserCode(String userCode);
	
	
	//insert
	public void inserUser(User user);
	
	
	public void updatePasswordByUserId(long userId, String password);
}
