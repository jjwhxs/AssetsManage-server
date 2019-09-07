package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.CompanyMapping;
import com.hxs.assetsmanage.model.Company;
import com.hxs.assetsmanage.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImp implements CompanyService {

    @Autowired
    private CompanyMapping companyMapping;

    @Override
    public Company getOne(Integer cid) {
        return companyMapping.getOne(cid);
    }

    @Override
    public List<Company> getCompany() {
        return companyMapping.getCompany();
    }

    @Override
    public int addCompany(Company company) {
        return companyMapping.addCompany(company);
    }

    @Override
    public int uptCompany(Company company) {
        return companyMapping.uptCompany(company);
    }

    @Override
    public int delCompany(Integer cid) {
        return companyMapping.delCompany(cid);
    }

    @Override
    public List<Company> getComName() {
        return companyMapping.getComName();
    }
}
