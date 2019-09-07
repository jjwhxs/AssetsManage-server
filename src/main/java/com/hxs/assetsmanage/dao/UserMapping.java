package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.User;

import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapping {

    User getUser(@Param("account") String account,@Param("password") String password);

    List<User> getUserlist();

    int delUser(Integer uid);

    User getSingleUser(Integer uid);

    List<User> getRoleOr(Integer rid);

    int addUser(User user);

    int goRegister(User user);

}
