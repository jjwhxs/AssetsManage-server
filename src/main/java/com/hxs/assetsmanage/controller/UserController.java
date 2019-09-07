package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.User;
import com.hxs.assetsmanage.service.UserService;
import com.hxs.assetsmanage.tool.ResponseMessage;
import com.hxs.assetsmanage.tool.Result;
import com.hxs.assetsmanage.tool.VCodeGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述:关于用户表登录查询及个人中心维护
 */
@Controller
@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;
    String code= "";

    //获取用户的全部信息
    @CrossOrigin
    @RequestMapping(value = "/getUserlist")
    public ResponseMessage getUserlist(){
        Map<String, List> map = new HashMap<>();
        List<User> userList = userService.getUserlist();
        map.put("List",userList);
        return Result.success("200",map);
    }

    /**
     * 用户注册
     */
    @CrossOrigin
    @RequestMapping(value = "/getRegister",method = RequestMethod.PUT)
    public String goRegister(@RequestBody User user){
        String responseStr = "注册失败！";
        if (userService.goRegister(user) == 1) {
            responseStr = "注册成功！";
        }
        return responseStr;
    }

    /**
     * 用户登录
     */
    @CrossOrigin
    @RequestMapping(value = "/getLogin",method = RequestMethod.GET)
    public String getUser(String vCode,String account,String password){

        String responseStr = "";
        System.out.println(vCode + " " + account + " " + password);

        if(!code.equalsIgnoreCase(vCode)){//先判断验证码是否正确
            responseStr = "验证码不正确！";
        }else{
            User loginUser = userService.getUser(account,password);
               if(loginUser != null){
                responseStr = "登录成功！"+loginUser.getStatus()+loginUser.getAccount();
            }else{
                responseStr ="用户名或密码不正确！";
            }
        }

        return responseStr;

    }

    @RequestMapping(value = "/getStr",method = RequestMethod.GET)
    public String getStr(String str){
        return "hello"+str;
    }

    //通过用户名和密码获取用户信息
    //@CrossOrigin
    //@RequestMapping(value = "/getUser",method = RequestMethod.GET)
    //public User getUser(String username) {
    // return userService.getUser(account);
    //}

    //通过主键ID删除用户
    @CrossOrigin
    @RequestMapping(value = "/delUser")
    public int delUser(Integer uid){
        return userService.delUser(uid);
    }

    //根据ID获取一条用户信息
    @CrossOrigin
    @RequestMapping(value = "/getSingleUser")
    public User getSingleUser(Integer uid){
        return userService.getSingleUser(uid);
    }


    //根据角色主键查询用户是否有对应的角色名称信息
    @CrossOrigin
    @RequestMapping(value = "/getRoleOr")
    public List<User> getRoleOr(Integer rid){
        return userService.getRoleOr(rid);
    }

    //添加用户信息
    @CrossOrigin
    @RequestMapping(value = "/addUser",method = RequestMethod.PUT)
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    /**
     * 获取验证码
     */
    @CrossOrigin
    @RequestMapping(value = "/getVCode",method = RequestMethod.GET)
    private void getVCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //创建验证码生成器对象
        VCodeGenerator vcGenerator = new VCodeGenerator();
        //生成验证码
        String vcode = vcGenerator.generatorVCode();
        code = vcode;
        //将验证码保存在session域中,以便判断验证码是否正确
        //request.getSession().setAttribute("vcode", vcode);
        //生成验证码图片
        BufferedImage vImg = vcGenerator.generatorRotateVCodeImage(vcode, true);
        //输出图像
        ImageIO.write(vImg, "gif", response.getOutputStream());
    }

}