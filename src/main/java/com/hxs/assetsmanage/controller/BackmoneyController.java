package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Backmoney;
import com.hxs.assetsmanage.service.BackmoneyService;
import com.hxs.assetsmanage.tool.ResponseMessage;
import com.hxs.assetsmanage.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:郭佳琦
 * 更新时间:2019-5-26
 * 功能描述:关于还款表的查询
 */
@Controller
@RestController("/backmoney")
public class BackmoneyController {

    @Autowired
    private BackmoneyService backmoneyService;

    //根据ID获取还款信息
    @CrossOrigin
    @RequestMapping(value = "/getSingleBac")
    public Backmoney getOne(Integer baid){
        return backmoneyService.getOne(baid);
    }

    //获取所有的还款信息
    @CrossOrigin
    @RequestMapping(value = "getBackmoney")
    public ResponseMessage getBackmoney(){
        Map<String, List> map = new HashMap<>();
        List<Backmoney> backmoneyList = backmoneyService.getBackmoney();
        map.put("List",backmoneyList);
        return Result.success("200",map);
    }

}
