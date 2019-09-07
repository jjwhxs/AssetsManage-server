package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Assetsdebt;

import java.util.List;

public interface AssetsdebtService {

    Assetsdebt getOne(Integer adid);

    List<Assetsdebt> getAssetsdebt();

    int addAssetsdebt(Assetsdebt assetsdebt);

    int uptAssetsdebt(Assetsdebt assetsdebt);

    int delAssetsdebt(Integer adid);

    int uptMoney(Assetsdebt assetsdebt);

}
