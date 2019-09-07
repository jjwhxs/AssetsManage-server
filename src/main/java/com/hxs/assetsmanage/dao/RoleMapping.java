package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Role;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 角色信息接口
 */
@Mapper
public interface RoleMapping {

    Role getOne(Integer rid);

    List<Role> getRole();

    List<Role> getRname();

    int delRole(Integer rid);

    int addRole(Role role);

    int uptRole(Role role);

}
