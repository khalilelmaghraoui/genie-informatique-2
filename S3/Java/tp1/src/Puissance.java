import java.util.Scanner;

public class Puissance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("donner x ");

        int x=scanner.nextInt();

        System.out.println("dooner n ");
        int n = scanner.nextInt();
        int p=1;


        for (int i =0; i< n ; i++)
        {
            p*=x;

        }

        System.out.println("resultat = " + p );




    }

}
