package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.BorrowmoneyMapping;
import com.hxs.assetsmanage.model.Borrowmoney;
import com.hxs.assetsmanage.service.BorrowmoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowmoneyServiceImp implements BorrowmoneyService {

    @Autowired
    private BorrowmoneyMapping borrowmoneyMapping;

    @Override
    public int uptStatus(Borrowmoney borrowmoney) {
        return borrowmoneyMapping.uptStatus(borrowmoney);
    }

    @Override
    public Borrowmoney getOne(Integer bid) {
        return borrowmoneyMapping.getOne(bid);
    }

    @Override
    public List<Borrowmoney> getBorrowmoney() {
        return borrowmoneyMapping.getBorrowmoney();
    }

    @Override
    public int addBorrowmoney(Borrowmoney borrowmoney) {
        return borrowmoneyMapping.addBorrowmoney(borrowmoney);
    }

    @Override
    public int uptBorrowmoney(Borrowmoney borrowmoney) {
        return borrowmoneyMapping.uptBorrowmoney(borrowmoney);
    }

    @Override
    public int delBorrowmoney(Integer bid) {
        return borrowmoneyMapping.delBorrowmoney(bid);
    }

}
