package com.ensah.core.services.impl;

import com.ensah.core.dao.IUtilisateurDao;
import com.ensah.core.services.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UtilisateurServiceImpl  implements IUtilisateurService {

    @Autowired
    private  IUtilisateurDao utilisateurService;




}
