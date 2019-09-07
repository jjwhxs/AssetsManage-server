package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Datadic;

import java.util.List;

/**
 * 数据字典信息服务接口
 */
public interface DatadicService {

    Datadic getOne(Integer did);

    List<Datadic> getDatadic();

    int addDatadic(Datadic datadic);

    int uptDatadic(Datadic datadic);

    int delDatadic(Integer did);

}
