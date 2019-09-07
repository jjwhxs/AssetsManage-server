package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Givemoney;

import java.util.List;

public interface GivemoneyService {

    Givemoney getOne(Integer gid);

    List<Givemoney> getGivemoney();

    int addGivemoney(Givemoney givemoney);

}
