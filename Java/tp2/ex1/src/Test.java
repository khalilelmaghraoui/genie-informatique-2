public class Test {
    public static void main(String[] args) {
        Banque compte1 = new Banque(1,5000.75f,"AB 1200");

        float solde1=compte1.avoirSolde();
        System.out.println("votre solde =  " + solde1);
        compte1.avoirInf();
        compte1.deposer(500);
        compte1.avoirInf();
        System.out.println("votre solde =  " + solde1);

        compte1.retirer(200);











    }
}
