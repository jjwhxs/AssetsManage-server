package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Assetsdebt;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 资产负债信息接口绑定
 */
@Mapper
public interface AssetsdebtMapping {

    Assetsdebt getOne(Integer adid);

    List<Assetsdebt> getAssetsdebt();

    int addAssetsdebt(Assetsdebt assetsdebt);

    int uptAssetsdebt(Assetsdebt assetsdebt);

    int delAssetsdebt(Integer adid);

    int uptMoney(Assetsdebt assetsdebt);

}
