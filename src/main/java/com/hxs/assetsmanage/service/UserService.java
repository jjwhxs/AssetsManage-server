package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.User;

import java.util.List;

public interface UserService {

    User getUser(String account,String password);

    List<User> getUserlist();

    int delUser(Integer uid);

    User getSingleUser(Integer uid);

    List<User> getRoleOr(Integer rid);

    int addUser(User user);

    int goRegister(User user);

}
