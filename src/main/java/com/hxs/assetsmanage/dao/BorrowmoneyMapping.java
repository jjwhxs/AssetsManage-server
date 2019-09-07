package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Borrowmoney;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 借款信息接口绑定
 */
@Mapper
public interface BorrowmoneyMapping {

    Borrowmoney getOne(Integer bid);

    List<Borrowmoney> getBorrowmoney();

    int addBorrowmoney(Borrowmoney borrowmoney);

    int uptBorrowmoney(Borrowmoney borrowmoney);

    int delBorrowmoney(Integer bid);

    int uptStatus(Borrowmoney borrowmoney);

}
