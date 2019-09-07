package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Company;
import com.hxs.assetsmanage.service.CompanyService;
import com.hxs.assetsmanage.tool.ResponseMessage;
import com.hxs.assetsmanage.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:徐米米
 * 更新时间:2019-5-25
 * 功能描述:关于公司信息表的增删查改
 */
@Controller
@RestController("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/getHello")
    public String getHello(){
        return "Hello";
    }

    //通过主键ID获取公司信息表中的某一条信息
    @CrossOrigin
    @RequestMapping(value = "/getSinglecom")
    public Company getOne(Integer cid){
        return companyService.getOne(cid);
    }

    //获取所有公司表中的信息
    @CrossOrigin
    @RequestMapping(value = "/getCompany")
    public ResponseMessage getCompany(){
        Map<String, List> map = new HashMap<>();
        List<Company> companyList = companyService.getCompany();
        map.put("List",companyList);
        return Result.success("200",map);
    }

    //往公司表中添加一条公司信息
    @CrossOrigin
    @RequestMapping(value = "/addCompany",method = RequestMethod.PUT)
    public int addCompany(@RequestBody Company company){
        return companyService.addCompany(company);
    }

    //根据ID更新公司信息表中的信息
    @CrossOrigin
    @RequestMapping(value = "/uptCompany",method = RequestMethod.PUT)
    public int uptCompany(@RequestBody Company company){
        return companyService.uptCompany(company);
    }

    //根据ID删除公司信息表中的信息
    @CrossOrigin
    @RequestMapping(value = "delCompany")
    public int delCompany(Integer cid){
        return companyService.delCompany(cid);
    }

    //获取所有公司名称
    @CrossOrigin
    @RequestMapping(value = "/getComName")
    public List<Company> getComName(){
        return companyService.getComName();
    }

}
