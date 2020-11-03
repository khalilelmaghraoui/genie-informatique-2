import java.util.Date;

public  class Logiciel  implements Produits{


    private String designation;
    private float prixUnaitre;
    private float quantite;
    private String editeru;
    private Date anneeEdition;

    public Logiciel(String designation, float prixUnaitre, float quantite, String editeru, Date anneeEdition) {
        this.designation = designation;
        this.prixUnaitre = prixUnaitre;
        this.quantite = quantite;
        this.editeru = editeru;
        this.anneeEdition = anneeEdition;
    }

    public String getEditeru() {
        return editeru;
    }

    public Date getAnneeEdition() {
        return anneeEdition;
    }

    @Override
    public String getDesignation() {
        return null;
    }

    @Override
    public float getPrixUnitaire() {
        return 0;
    }

    @Override
    public float getQuantité() {
        return 0;
    }

    @Override
    public char getNaure() {
        return 0;
    }
}
