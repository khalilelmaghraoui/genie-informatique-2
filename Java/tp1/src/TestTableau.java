import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class TestTableau {
    public static void main(String[] args) {

        int[] array = new int[100];

int sum=0;
        Random r= new Random();
        for(int i=0 ; i<array.length-1;i++)
        {
            array[i]=r.nextInt(100)+99;
            sum+=array[i];

        }
        int moy=0;
        int min = Collections.min(Arrays.asList(array));
        int max = Collections.max(Arrays.asList(array));


        for (int i : array
             ) {


            System.out.println(i);

            System.out.println("le moyene = " + sum/100);


        }


    }





}
