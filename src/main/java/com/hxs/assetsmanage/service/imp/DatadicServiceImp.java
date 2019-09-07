package com.hxs.assetsmanage.service.imp;

import com.hxs.assetsmanage.dao.DatadicMapping;
import com.hxs.assetsmanage.model.Datadic;
import com.hxs.assetsmanage.service.DatadicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatadicServiceImp implements DatadicService {

    @Autowired
    private DatadicMapping datadicMapping;

    @Override
    public Datadic getOne(Integer did) {
        return datadicMapping.getOne(did);
    }

    @Override
    public List<Datadic> getDatadic() {
        return datadicMapping.getDatadic();
    }

    @Override
    public int addDatadic(Datadic datadic) {
        return datadicMapping.addDatadic(datadic);
    }

    @Override
    public int uptDatadic(Datadic datadic) {
        return datadicMapping.uptDatadic(datadic);
    }

    @Override
    public int delDatadic(Integer did) {
        return datadicMapping.delDatadic(did);
    }

}
