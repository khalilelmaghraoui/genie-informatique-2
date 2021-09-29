package com.ensah.core.web.models;

import java.util.Objects;

public class UtilisateurModel {

    private Long idUtilisateur;

    private String  cin;

    private String email;

    private  String nom;
    private String prenom;

    public UtilisateurModel() {
    }

    public UtilisateurModel(Long idUtilisateur) {

        this.idUtilisateur = idUtilisateur;
    }

    @Override
    public String toString() {
        return "UtilisateurModel{" +
            "idUtilisateur=" + idUtilisateur +
            ", cin='" + cin + '\'' +
            ", email='" + email + '\'' +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilisateurModel that = (UtilisateurModel) o;
        return Objects.equals(idUtilisateur, that.idUtilisateur) &&
            Objects.equals(cin, that.cin) &&
            Objects.equals(email, that.email) &&
            Objects.equals(nom, that.nom) &&
            Objects.equals(prenom, that.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUtilisateur, cin, email, nom, prenom);
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
