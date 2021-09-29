package com.ensah.core.services;

import com.ensah.core.bo.Absence;

import java.util.Date;
import java.util.List;

public interface IAbsenceService {

    public void createAbsence(Absence absence);
    public List<Absence> getEtudiantAbsenceByIdInscription(String idInscription);
    public void updateAbsence(Absence absence, Long idAbsence , Date date);

    public Absence getAbsenceById(Long idAbsence);

}
