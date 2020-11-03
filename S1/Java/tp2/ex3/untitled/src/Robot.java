public class Robot {
    private int abs;
    private int Ord;
    private String Orientation;

    public Robot() {
    }

    public Robot(int abs, int ord, String orientation) {
        this.abs = abs;
        Ord = ord;
        Orientation = orientation;
    }
    public void avancer(int abs , int ord){
        this.abs=abs;
        this.Ord=ord;
        System.out.println("le robot avance par " + abs +"x et  " + ord + "y ");

    }

    public void tournerDroite(){
        Orientation = "doite";
        System.out.println("le robot tourne a droite "  +Orientation );

    }
    public void tournerGauche(){
        Orientation = "gauche";
        System.out.println("le robot tourne a " +Orientation );


    }
    public void affich(){
        System.out.println(abs + " x " + Ord +  "ord" + " orientaion " + Orientation );
    }
}
