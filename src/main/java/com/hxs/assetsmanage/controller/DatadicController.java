package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Datadic;
import com.hxs.assetsmanage.service.DatadicService;
import com.hxs.assetsmanage.tool.ResponseMessage;
import com.hxs.assetsmanage.tool.Result;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:姜家玮
 * 更新时间:2019-5-25
 * 功能描述:关于数据字典表的增删查改
 */
@Controller
@RestController("/datadic")
public class DatadicController {

    @Autowired
    private DatadicService datadicService;

    //获取所有的数据字典信息
    @CrossOrigin
    @RequestMapping(value = "/getDatadic",method = RequestMethod.GET)
    public ResponseMessage getDatadic(){
        Map<String,List> map = new HashMap<>();
        List<Datadic> datadicList = datadicService.getDatadic();
        map.put("List",datadicList);
        return Result.success("200",map);
    }

    //通过主键ID获取数据字典表中的某一条信息
    @CrossOrigin
    @RequestMapping(value = "/getSingle",method = RequestMethod.GET)
    public Datadic getOne(Integer did){
        return datadicService.getOne(did);
    }

    //往数据字典表中添加数据信息
    @CrossOrigin
    @RequestMapping(value = "/addDatadic",method = RequestMethod.PUT)
    public int addDatadic(@RequestBody Datadic datadic){
        return datadicService.addDatadic(datadic);
    }

    //根据ID更新数据字典表中的信息
    @CrossOrigin
    @RequestMapping(value = "/uptDatadic",method = RequestMethod.PUT)
    public int uptDatadic(@RequestBody Datadic datadic){
        return datadicService.uptDatadic(datadic);
    }

    //根据ID删除数据字典表中的信息
    @CrossOrigin
    @RequestMapping(value = "delDatadic",method = RequestMethod.GET)
    public int delDatadic(Integer did){
        return datadicService.delDatadic(did);
    }
}
