package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Backmoney;

import java.util.List;

/**
 * 还款信息接口绑定
 */
public interface BackmoneyMapping {

    Backmoney getOne(Integer baid);

    List<Backmoney> getBackmoney();

}
