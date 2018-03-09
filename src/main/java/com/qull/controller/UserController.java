package com.qull.controller;

import com.qull.entiy.User;
import com.qull.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by qull on 18-3-9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value="/add",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @RequestMapping("/findAll/{pageNum}/{pageSize}")
    @ResponseBody
    public Object findAll(@PathVariable("pageNum")int pageNUm, @PathVariable("pageSize")int pageSize) {
        return userService.findAll(pageNUm, pageSize);
    }

}
