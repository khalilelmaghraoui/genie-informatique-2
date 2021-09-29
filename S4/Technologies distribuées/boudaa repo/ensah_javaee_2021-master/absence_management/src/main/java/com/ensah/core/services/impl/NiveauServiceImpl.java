package com.ensah.core.services.impl;

import com.ensah.core.bo.Niveau;
import com.ensah.core.dao.INiveauDao;
import com.ensah.core.services.INiveauServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NiveauServiceImpl  implements INiveauServiceImpl {

    @Autowired
    private INiveauDao niveauService;


    @Override
    public List<Niveau> getAllNiveau() {
        return niveauService.getAll();
    }
}
