package com.abao.module.mapper;

import com.abao.module.model.User;

import java.util.List;

public interface UserMapper {


    int deleteByPrimaryKey(String uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> queryUserForList();


}