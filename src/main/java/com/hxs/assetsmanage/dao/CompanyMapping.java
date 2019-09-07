package com.hxs.assetsmanage.dao;

import com.hxs.assetsmanage.model.Company;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 公司信息接口绑定
 */
@Mapper
public interface CompanyMapping {

    Company getOne(Integer cid);

    List<Company> getCompany();

    int addCompany(Company company);

    int uptCompany(Company company);

    int delCompany(Integer cid);

    List<Company> getComName();

}
