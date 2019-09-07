package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Assetsdebt;
import com.hxs.assetsmanage.service.AssetsdebtService;
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
 * 更新时间:2019-5-26
 * 功能描述:关于资产负债表的增删查改
 */
@Controller
@RestController("/assetsdebt")
public class AssetsdebtController {

    @Autowired
    private AssetsdebtService assetsdebtService;

    //通过主键ID获取资产负债表中的某一条信息
    @CrossOrigin
    @RequestMapping(value = "/getSingleAss")
    public Assetsdebt getOne(Integer adid){
        return assetsdebtService.getOne(adid);
    }

    //获取所有的资产负债表信息
    @CrossOrigin
    @RequestMapping(value = "/getAssetsdebt")
    public ResponseMessage getAssetsdebt(){
        Map<String, List> map = new HashMap<>();
        List<Assetsdebt> assetsdebtList = assetsdebtService.getAssetsdebt();
        map.put("List",assetsdebtList);
        return Result.success("200",map);
    }

    //往资产负债表中添加数据信息
    @CrossOrigin
    @RequestMapping(value = "addAssetsdebt",method = RequestMethod.PUT)
    public int addAssetsdebt(@RequestBody Assetsdebt assetsdebt){
        return assetsdebtService.addAssetsdebt(assetsdebt);
    }

    //根据ID更新资产负债表中的信息
    @CrossOrigin
    @RequestMapping(value = "uptAssetsdebt")
    public int uptAssetsdebt(@RequestBody Assetsdebt assetsdebt){
        return assetsdebtService.uptAssetsdebt(assetsdebt);
    }

    //根据ID删除资产负债表中的信息
    @CrossOrigin
    @RequestMapping(value = "delAssetsdebt")
    public int delAssetsdebt(Integer adid){
        return assetsdebtService.delAssetsdebt(adid);
    }

    //根据ID更改金额
    @CrossOrigin
    @RequestMapping(value = "/uptMoney",method = RequestMethod.PUT)
    public int uptMoney(@RequestBody Assetsdebt assetsdebt){
        return assetsdebtService.uptMoney(assetsdebt);
    }

}
