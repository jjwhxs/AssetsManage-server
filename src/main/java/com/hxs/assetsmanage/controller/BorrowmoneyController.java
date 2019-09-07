package com.hxs.assetsmanage.controller;

import com.hxs.assetsmanage.model.Borrowmoney;
import com.hxs.assetsmanage.service.BorrowmoneyService;
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
 * 更新时间:2019-5-26
 * 功能描述:关于借款信息表的增删查改
 */
@Controller
@RestController("/borrowmoney")
public class BorrowmoneyController {

    @Autowired
    private BorrowmoneyService borrowmoneyService;

    //通过主键ID获取公司信息表中的某一条信息
    @CrossOrigin
    @RequestMapping(value = "/getSingleBor")
    public Borrowmoney getOne(Integer bid){
        return borrowmoneyService.getOne(bid);
    }

    //获取所有的借款表信息
    @CrossOrigin
    @RequestMapping(value = "/getBorrowmoney")
    public ResponseMessage getBorrowmoney(){
        Map<String, List> map = new HashMap<>();
        List<Borrowmoney> borrowmoneyList = borrowmoneyService.getBorrowmoney();
        map.put("List",borrowmoneyList);
        return Result.success("200",map);
    }

    //往借款表中添加数据信息
    @CrossOrigin
    @RequestMapping(value = "/addBorrowmoney",method = RequestMethod.PUT)
    public int addBorrowmoney(@RequestBody Borrowmoney borrowmoney){
        return borrowmoneyService.addBorrowmoney(borrowmoney);
    }

    //根据ID更新借款表中的信息
    @CrossOrigin
    @RequestMapping(value = "/uptBorrowmoney")
    public int uptBorrowmoney(@RequestBody Borrowmoney borrowmoney){
        return borrowmoneyService.uptBorrowmoney(borrowmoney);
    }

    //根据ID删除借款表中的信息
    @CrossOrigin
    @RequestMapping(value = "delBorrowmoney")
    public int delBorrowmoney(Integer bid){
        return borrowmoneyService.delBorrowmoney(bid);
    }

    //根据ID改变借款的状态
    @CrossOrigin
    @RequestMapping(value = "/uptStatus",method = RequestMethod.PUT)
    public int uptStatus(@RequestBody Borrowmoney borrowmoney){
        return borrowmoneyService.uptStatus(borrowmoney);
    }

}
