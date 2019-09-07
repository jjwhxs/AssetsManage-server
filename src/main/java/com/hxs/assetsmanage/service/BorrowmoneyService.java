package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Borrowmoney;

import java.util.List;

public interface BorrowmoneyService {

    Borrowmoney getOne(Integer bid);

    List<Borrowmoney> getBorrowmoney();

    int addBorrowmoney(Borrowmoney borrowmoney);

    int uptBorrowmoney(Borrowmoney borrowmoney);

    int delBorrowmoney(Integer bid);

    int uptStatus(Borrowmoney borrowmoney);

}
