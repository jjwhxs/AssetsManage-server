package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Role;
import com.hxs.assetsmanage.service.RoleService;
import com.hxs.assetsmanage.tool.ResponseMessage;
import com.hxs.assetsmanage.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:张炜
 * 更新时间:2019-5-25
 * 功能描述:关于角色表的增删查改
 */
@Controller
@RestController("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    //通过主键ID获取角色表中的某一条信息
    @CrossOrigin
    @RequestMapping(value = "/getOne")
    public Role getOne(Integer rid){
        return roleService.getOne(rid);
    }

    //获取下拉框的内容
    @CrossOrigin
    @RequestMapping(value = "/getRname")
    public List<Role> getRname(){
        return roleService.getRname();
    }

    //获取所有的角色信息
    @CrossOrigin
    @RequestMapping(value = "/getRole")
    public ResponseMessage getRole(){
        Map<String,List> map = new HashMap<>();
        List<Role> roleList = roleService.getRole();
        map.put("List",roleList);
        return Result.success("200",map);
    }

    //根据ID删除角色表中的信息
    @CrossOrigin
    @RequestMapping(value = "/delRole",method = RequestMethod.GET)
    public int delRole(Integer rid){
        return roleService.delRole(rid);
    }

    //往角色表中添加数据信息
    @CrossOrigin
    @RequestMapping(value = "/addRole",method = RequestMethod.PUT)
    public int addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }

    //根据ID更新角色表中的信息
    @CrossOrigin
    @RequestMapping(value = "/uptRole",method = RequestMethod.PUT)
    public int uptRole(@RequestBody Role role){
        return roleService.uptRole(role);
    }
}
