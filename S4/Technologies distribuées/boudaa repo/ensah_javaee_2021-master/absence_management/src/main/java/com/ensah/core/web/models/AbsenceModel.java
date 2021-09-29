package com.ensah.core.web.models;

import java.util.Date;

public class AbsenceModel {

    private Long idInscription;
    private Long idEnseignant;
    private  Long idMatiere;

    private Long idAbsence;
    private int etat;

    private Date dateHeureDebutAbsence;

    private Date dateHeureFinAbsence;


    private String typeSaisie;

    public AbsenceModel() {

    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public AbsenceModel(Long idInscription) {
        this.idInscription = idInscription;
    }

    public AbsenceModel(Long idInscription, Long idMatiere) {
        this.idInscription = idInscription;
        this.idMatiere = idMatiere;
    }


    public Long getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Long idInscription) {
        this.idInscription = idInscription;
    }

    public Long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Long getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Long idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public Long getIdAbsence() {
        return idAbsence;
    }

    public void setIdAbsence(Long idAbsence) {
        this.idAbsence = idAbsence;
    }

    public Date getDateHeureDebutAbsence() {
        return dateHeureDebutAbsence;
    }

    public void setDateHeureDebutAbsence(Date dateHeureDebutAbsence) {
        this.dateHeureDebutAbsence = dateHeureDebutAbsence;
    }

    public Date getDateHeureFinAbsence() {
        return dateHeureFinAbsence;
    }

    public void setDateHeureFinAbsence(Date dateHeureFinAbsence) {
        this.dateHeureFinAbsence = dateHeureFinAbsence;
    }

    public String getTypeSaisie() {
        return typeSaisie;
    }

    public void setTypeSaisie(String typeSaisie) {
        this.typeSaisie = typeSaisie;
    }

    @Override
    public String toString() {
        return "AbsenceModel{" +
            "idInscription=" + idInscription +
            ", idEnseignant=" + idEnseignant +
            ", idMatiere=" + idMatiere +
            ", idAbsence=" + idAbsence +
            ", etat=" + etat +
            ", dateHeureDebutAbsence=" + dateHeureDebutAbsence +
            ", dateHeureFinAbsence=" + dateHeureFinAbsence +
            ", typeSaisie='" + typeSaisie + '\'' +
            '}';
    }
}
