package com.abao.module.controller;

import com.abao.module.model.User;
import com.abao.module.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * Todo:
 * Created with: IntelliJ IDEA.
 * User: kevin
 * Date: 2016-04-04-下午5:34
 */
@RestController
public class UserConroller {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("user/list")
    public String queryUserList(Model model){
        logger.info("开始查询用户列表4445567");
        int a = 1;
       List<User> list = userService.queryUserForList();
        logger.info(list.size()+" --"+a);
        model.addAttribute("userList",list);
        return "userList";
    }

    @RequestMapping("user/add")
    public String addUser(User user,Model model){
        int num = userService.insertUser(user);
        logger.debug("num {}",num);
        return "";
    }
}
