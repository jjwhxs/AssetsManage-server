package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.BackmoneyMapping;
import com.hxs.assetsmanage.model.Backmoney;
import com.hxs.assetsmanage.service.BackmoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackmoneyServiceImp implements BackmoneyService {

    @Autowired
    private BackmoneyMapping backmoneyMapping;

    @Override
    public Backmoney getOne(Integer baid) {
        return backmoneyMapping.getOne(baid);
    }

    @Override
    public List<Backmoney> getBackmoney() {
        return backmoneyMapping.getBackmoney();
    }
}
