package com.ensah.core.services.impl;

import com.ensah.core.bo.Absence;
import com.ensah.core.dao.IAbsenceDao;
import com.ensah.core.services.IAbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class IAbsenceServiceImpl  implements IAbsenceService {


    @Autowired
    private IAbsenceDao absenceDao;

    @Override
    public void createAbsence(Absence absence) {
        absenceDao.create(absence);

    }


    @Override
    public List<Absence> getEtudiantAbsenceByIdInscription(String idInscription) {
        List<Absence> u = absenceDao.getEntityByColValue("Absence", "idInscription", idInscription);
        if (u != null && u.size() != 0) {
            return  absenceDao.getEntityByColValue("Absence", "idInscription", idInscription);
        }

        return null;
    }

    @Override
    public void updateAbsence(Absence absence, Long idAbsence, Date date) {

        Date date1 = new Date();

       long diff = date.getDay()-date1.getDay();

        if(diff<=2) {
            absence.setEtat(0);
            absenceDao.update(absence);
        }else {

            System.out.println("too late to make this update");
        }

    }

    @Override
    public Absence getAbsenceById(Long idAbsence) {
        return absenceDao.findById(idAbsence);
    }
}
