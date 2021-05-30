package exe5;

public class Personne {
	
	private String nom;
	private int code;
	private Compte compte[];
	
	public Personne() {
		super();
	}

	public Personne(String nom, int code, Compte t[]) {
		this.nom = nom;
		this.code = code;
		compte=new Compte[t.length];
		for(int i=0;i<t.length;i++) {
			compte[i]=t[i];
		}
		
	}

	public String getNom() {
		return nom;
	}

	public int getCode() {
		return code;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getInf() {
		return nom+" "+code;
	}
	
	public void afficher() {
		System.out.println(nom+ "  "+code);
		for(int i=0;i<compte.length;i++)
			System.out.println(compte[i].getInf());
	}
	public static void main(String[] args) {
		Compte tab[]= {new Compte(1,100f), new Compte(2,200f)};
		Personne personne=new Personne("ahmed",1000,tab);
		personne.afficher();
		
		

	}

}
