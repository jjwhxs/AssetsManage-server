package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Givemoney;
import com.hxs.assetsmanage.service.GivemoneyService;
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
 * 更新时间:2019-5-26
 * 功能描述:关于放款表的查询
 */
@Controller
@RestController("/givemoney")
public class GivemoneyController {

    @Autowired
    private GivemoneyService givemoneyService;

    //根据ID获取关于放款的记录信息
    @CrossOrigin
    @RequestMapping(value = "/getSingleGiv")
    public Givemoney getOne(Integer gid){
        return givemoneyService.getOne(gid);
    }

    //获取所有的放款信息
    @CrossOrigin
    @RequestMapping(value = "/getGivemoney")
    public ResponseMessage getGivemoney(){
        Map<String, List> map = new HashMap<>();
        List<Givemoney> givemoneyList = givemoneyService.getGivemoney();
        map.put("List",givemoneyList);
        return Result.success("200",map);
    }

    @CrossOrigin
    @RequestMapping(value = "/addGivemoney",method = RequestMethod.PUT)
    public int addGivemoney(@RequestBody Givemoney givemoney){
        return givemoneyService.addGivemoney(givemoney);
    }

}
