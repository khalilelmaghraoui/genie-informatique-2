public class Materiel implements Produits {

    private String designation;
    private float prixUnaitre;
    private float quantite;

    public Materiel(String designation, float prixUnaitre, float quantite) {
        this.designation = designation;
        this.prixUnaitre = prixUnaitre;
        this.quantite = quantite;
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
