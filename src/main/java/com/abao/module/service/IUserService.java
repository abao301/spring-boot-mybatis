package com.abao.module.service;

import com.abao.module.model.User;

import java.util.List;

/**
 * Todo:
 * Created with: IntelliJ IDEA.
 * User: kevin
 * Date: 2016-04-04-下午5:24
 */
public interface IUserService {

    List<User> queryUserForList();

    int insertUser(User user);
}
