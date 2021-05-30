package com.ex4;

import java.util.concurrent.RecursiveTask;

public class EntNat {
   private int a;


    public EntNat(int a) throws ErrConst {
        if(a<=0) throw new ErrConst(a);
        else
         this.a = a;
    }

    public int  getN(){
        return a;

    }
    public void setN(int a ) throws ErrModif{
        if(a<0) {
            throw new ErrModif(a);
        } else {
            this.a=a;
        }
    }


}
