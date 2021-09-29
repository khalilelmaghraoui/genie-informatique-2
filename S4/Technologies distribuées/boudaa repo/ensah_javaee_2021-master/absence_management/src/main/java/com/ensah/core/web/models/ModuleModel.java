package com.ensah.core.web.models;

import java.util.Objects;

public class ModuleModel {

    private Long idModule;
    private String  code;
    private String titre;
    private Long idNiveau;

    public ModuleModel(Long idModule) {
        this.idModule = idModule;
    }

    public ModuleModel(Long idModule, String code, String titre, Long idNiveau) {
        this.idModule = idModule;
        this.code = code;
        this.titre = titre;
        this.idNiveau = idNiveau;
    }


    public ModuleModel() {
    }

    @Override
    public String toString() {
        return "ModuleModel{" +
            "idModule=" + idModule +
            ", code='" + code + '\'' +
            ", titre='" + titre + '\'' +
            ", idNiveau=" + idNiveau +
            '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(idModule, code, titre, idNiveau);
    }

    public Long getIdModule() {
        return idModule;
    }

    public void setIdModule(Long idModule) {
        this.idModule = idModule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(Long idNiveau) {
        this.idNiveau = idNiveau;
    }
}
