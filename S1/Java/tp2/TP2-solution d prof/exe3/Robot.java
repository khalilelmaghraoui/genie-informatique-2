package exe3;

public class Robot {
	
	private int abs;
	private int ord;
	private String orientation;
	
	public Robot() {
		abs=0;
		ord=0;
		orientation="Droit";
	}


	public Robot(int abs, int ord, String orientation) {
		this.abs = abs;
		this.ord = ord;
		this.orientation = orientation;
	}

	
	public int getAbs() {
		return abs;
	}

	public int getOrd() {
		return ord;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setAbs(int abs) {
		this.abs = abs;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public void avancer(int d) {
		if(orientation.equals("Droit"))abs+=d;
		else if(orientation.equals("Gauche"))abs-=d;
		else if(orientation.equals("Haut")) ord+=d;
		else if(orientation.equals("Bas")) ord-=d;
	}
	
	public void tournerGauche() {
		if(orientation.equals("Droit"))orientation="Haut";
		else if(orientation.equals("Gauche"))orientation="Bas";
		else if(orientation.equals("Haut")) orientation="Gauche";
		else if(orientation.equals("Bas")) orientation="Droit";
	}
	
	public void tournerDroite() {
		if(orientation.equals("Droit"))orientation="Bas";
		else if(orientation.equals("Gauche"))orientation="Haut";
		else if(orientation.equals("Haut")) orientation="Droit";
		else if(orientation.equals("Bas")) orientation="Gauche";
	}
	
	
	 public void afficher() {
		 System.out.println("abs:"+abs+"   ord:"+ord+"    orientation:"+orientation);
	 }

	public static void main(String[] args) {
			
		Robot robot=new Robot();
		robot.afficher();
		
		robot.avancer(20);
		robot.afficher();
		
		robot.tournerGauche();
		robot.avancer(20);
		robot.afficher();
		

	}

}
