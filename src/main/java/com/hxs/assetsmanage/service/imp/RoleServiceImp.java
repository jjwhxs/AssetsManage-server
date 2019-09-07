package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.RoleMapping;
import com.hxs.assetsmanage.dao.UserMapping;
import com.hxs.assetsmanage.model.Role;
import com.hxs.assetsmanage.model.User;
import com.hxs.assetsmanage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleMapping roleMapping;

    @Autowired
    private UserMapping userMapping;

    @Override
    public int uptRole(Role role) {
        return roleMapping.uptRole(role);
    }

    @Override
    public Role getOne(Integer rid) {
        return roleMapping.getOne(rid);
    }

    @Override
    public List<Role> getRole(){
        return roleMapping.getRole();
    }

    @Override
    public List<Role> getRname(){
        return roleMapping.getRname();
    }

    //在删除语句时执行校验操作，实现了表与表之间的关系
    @Override
    public int delRole(Integer rid) {
        //增加是否与用户表发生关系的校验
        int temp_int = 0;
        List<User> userList = userMapping.getRoleOr(rid);
        System.out.println("获取集合长度判断信息："+userList.isEmpty());
        if (userList.isEmpty()){
                return roleMapping.delRole(rid);
        }else{
            temp_int = -1;
        }
        return temp_int;
    }

    @Override
    public int addRole(Role role) {
        return roleMapping.addRole(role);
    }

}
