package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Role;

import java.util.List;

/**
 * 角色信息服务接口
 */
public interface RoleService {

    Role getOne(Integer rid);

    List<Role> getRole();

    List<Role> getRname();

    int delRole(Integer rid);

    int addRole(Role role);

    int uptRole(Role role);

}
