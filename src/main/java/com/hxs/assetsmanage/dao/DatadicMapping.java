package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Datadic;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 数据字典接口绑定
 */
@Mapper
public interface DatadicMapping {

    Datadic getOne(Integer did);

    List<Datadic> getDatadic();

    int addDatadic(Datadic datadic);

    int uptDatadic(Datadic datadic);

    int delDatadic(Integer did);

}
