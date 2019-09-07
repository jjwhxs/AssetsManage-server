package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Backmoney;

import java.util.List;

public interface BackmoneyService {

    Backmoney getOne(Integer baid);

    List<Backmoney> getBackmoney();

}
