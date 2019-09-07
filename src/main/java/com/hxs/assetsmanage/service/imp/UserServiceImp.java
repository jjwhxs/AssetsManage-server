package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.UserMapping;
import com.hxs.assetsmanage.model.User;
import com.hxs.assetsmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapping userMapping;

    @Override
    public List<User> getRoleOr(Integer rid) {
        return userMapping.getRoleOr(rid);
    }

    @Override
    public User getSingleUser(Integer uid) {
        return userMapping.getSingleUser(uid);
    }

    @Override
    public User getUser(String account,String password){
        System.out.println(userMapping.getUser(account,password));
        return userMapping.getUser(account,password);
    }

    @Override
    public List<User> getUserlist() {
        return userMapping.getUserlist();
    }

    @Override
    public int delUser(Integer uid) {
        return userMapping.delUser(uid);
    }

    @Override
    public int addUser(User user) {
        return userMapping.addUser(user);
    }

    @Override
    public int goRegister(User user) {
        return userMapping.goRegister(user);
    }
}
