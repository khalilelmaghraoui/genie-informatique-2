import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Random r= new Random();
        int x;
        x=r.nextInt(100);
        System.out.println("enter un entier");
        int n=scanner.nextInt();
        int cmpt =0;
        while (true)
        {
            cmpt+=1;

            if(n>x) {
                System.out.println("trop grand");
                System.out.println("enter un entier");
                 n=scanner.nextInt();

            }
            else if(n<x) {
                System.out.println("trop petit");
                System.out.println("enter un entier");
                 n=scanner.nextInt();
            }
            else
            {
                System.out.println("Bravo");
                return;
            }



        }
    }
}
