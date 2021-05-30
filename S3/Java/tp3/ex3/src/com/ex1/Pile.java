package com.ex1;

public class Pile {

//    Pile[] pile = new Pile[100];
    private final static int taille=10;
    private Object[] pile;
    private int pos=0;

    public static int getTaille() {
        return taille;
    }
    public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }
public Pile(){
this.pile=new Object[taille];
}
public void empiler(Object a) throws PilePlien {
    if(pos>=taille) {
        throw new PilePlien();
    } else pile[pos]=a;
    pos++;

}
public void depiler() throws PileVide {
        if(pos ==0 ) throw new   PileVide();
        else pile[pos]=null;
        pos--;
    }
}


