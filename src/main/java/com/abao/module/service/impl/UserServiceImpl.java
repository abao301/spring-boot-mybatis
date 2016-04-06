package com.abao.module.service.impl;

import com.abao.module.mapper.UserMapper;
import com.abao.module.model.User;
import com.abao.module.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Todo:
 * Created with: IntelliJ IDEA.
 * User: kevin
 * Date: 2016-04-04-下午5:25
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public List<User> queryUserForList() {
        logger.info("query service");
        return userMapper.queryUserForList();
    }

    @Override
    public int insertUser(User user) {
        user.setUid(UUID.randomUUID().toString().replace("-",""));
        user.setAccount("abc111");
        user.setPassword("abc111");
        user.setApplytime(new Date());
        return userMapper.insert(user);

    }


}
