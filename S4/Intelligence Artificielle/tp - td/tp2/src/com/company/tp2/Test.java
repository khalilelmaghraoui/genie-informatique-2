package com.company.tp2;

public class Test {

    public static void main(String[] args) {
        // Taquin 3x3
        int[][] etatInitial3x3  = new int[][]{{1, 2, 4}
        									,{3, 6, 5},
        									{7, 0, 8}};
        int[][] etatBut3x3 = new int[][]{
        								{0, 1, 2},
        								{3, 4, 5},
        								{6, 7, 8}};



        // cr�er taquin de 3x3
        Taquin taquin3x3 = new Taquin(etatInitial3x3, etatBut3x3);

        // R�soudre un taquin 3x3
        rechercheInformee.aEtoile(taquin3x3);


    }
}
