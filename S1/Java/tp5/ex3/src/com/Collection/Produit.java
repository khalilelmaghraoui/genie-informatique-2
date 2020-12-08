package com.Collection;

public class Produit extends Object implements Comparable<Produit>{
  private   String design;
  private   double price;

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Produit(String design, double price) {
        super();
        this.design = design;
        this.price = price;
    }

    @Override
    public int compareTo(Produit produit) {
        int d = (int) (this.price-produit.price);
        if(d==0) return design.compareTo(produit.design);
        else return d;

    }

    @Override
    public String toString() {
        return "Produit{" +
            "design='" + design + '\'' +
            ", price=" + price +
            '}';
    }

}
