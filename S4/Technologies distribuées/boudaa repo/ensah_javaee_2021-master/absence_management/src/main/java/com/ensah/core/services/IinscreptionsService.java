package com.ensah.core.services;

import com.ensah.core.bo.Inscription;

import java.util.List;
import java.util.Set;

public interface IinscreptionsService {



    public Set<Inscription> getAllInscriptions();

    public List<Inscription> getInscriptionByIdNiveau(String idNiveau);

    public Inscription getEtudiantByIdinscription(String idEtudiant);





}
