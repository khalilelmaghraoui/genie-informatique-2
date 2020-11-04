package exe1;

public class Test {
    public static void main(String[] args) {
    	Banque b = new Banque(1,5000.0f,"AB1200");
        System.out.println(b.avoirInf());
        System.out.println(b.avoirSolde());
        b.deposer(500);
        System.out.println(b.avoirInf());
        System.out.println(b.avoirSolde());
        b.retirer(7000);
        System.out.println(b.avoirInf());
        System.out.println(b.avoirSolde());
    }
}

