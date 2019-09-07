package com.hxs.assetsmanage.service;

import com.hxs.assetsmanage.model.Company;

import java.util.List;

/**
 * 公司信息服务接口
 */
public interface CompanyService {

    Company getOne(Integer cid);

    List<Company> getCompany();

    int addCompany(Company company);

    int uptCompany(Company company);

    int delCompany(Integer cid);

    List<Company> getComName();

}
