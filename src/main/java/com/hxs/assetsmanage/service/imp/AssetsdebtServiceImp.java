package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.AssetsdebtMapping;
import com.hxs.assetsmanage.model.Assetsdebt;
import com.hxs.assetsmanage.service.AssetsdebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsdebtServiceImp implements AssetsdebtService {

    @Autowired
    private AssetsdebtMapping assetsdebtMapping;

    @Override
    public int uptMoney(Assetsdebt assetsdebt) {
        return assetsdebtMapping.uptMoney(assetsdebt);
    }

    @Override
    public Assetsdebt getOne(Integer adid) {
        return assetsdebtMapping.getOne(adid);
    }

    @Override
    public List<Assetsdebt> getAssetsdebt() {
        return assetsdebtMapping.getAssetsdebt();
    }

    @Override
    public int addAssetsdebt(Assetsdebt assetsdebt) {
        return assetsdebtMapping.addAssetsdebt(assetsdebt);
    }

    @Override
    public int uptAssetsdebt(Assetsdebt assetsdebt) {
        return assetsdebtMapping.uptAssetsdebt(assetsdebt);
    }

    @Override
    public int delAssetsdebt(Integer adid) {
        return assetsdebtMapping.delAssetsdebt(adid);
    }
}
