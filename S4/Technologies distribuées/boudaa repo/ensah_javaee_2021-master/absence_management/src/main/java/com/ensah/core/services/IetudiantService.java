package com.ensah.core.services;


import com.ensah.core.bo.Etudiant;

public interface IetudiantService {

//    public List<Etudiant> getEtudiantsByIdInscription(String idInscription);

    public Etudiant getEtudiantByCNE(String cne);

}
