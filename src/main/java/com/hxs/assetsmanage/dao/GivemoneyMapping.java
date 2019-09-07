package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Givemoney;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 放款信息接口绑定
 */
@Mapper
public interface GivemoneyMapping {

    Givemoney getOne(Integer gid);

    List<Givemoney> getGivemoney();

    int addGivemoney(Givemoney givemoney);

}
