package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.GivemoneyMapping;
import com.hxs.assetsmanage.model.Givemoney;
import com.hxs.assetsmanage.service.GivemoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GivemoneyServiceImp implements GivemoneyService {

    @Autowired
    private GivemoneyMapping givemoneyMapping;

    @Override
    public Givemoney getOne(Integer gid) {
        return givemoneyMapping.getOne(gid);
    }

    @Override
    public List<Givemoney> getGivemoney() {
        return givemoneyMapping.getGivemoney();
    }

    @Override
    public int addGivemoney(Givemoney givemoney) {
        return givemoneyMapping.addGivemoney(givemoney);
    }

}
