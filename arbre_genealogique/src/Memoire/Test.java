package Memoire;

public class Test {
	public static void main(String[] args) {
		
		String[] prenomsP1 = new String[3];
		prenomsP1[0] = "Laurie";
		Personne p1 = new Personne("Perat", prenomsP1, false, new Photo ("photo.jpg"));
		
		String[] prenomsP2 = new String[3];
		prenomsP2[0] = "Steve";
		Personne p2 = new Personne("Perat", prenomsP2, true, new Photo ("photo.jpg"));
		
		Lien l1 = new Lien("marital", p1, p2);
		l1.creerLien(1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(l1);
		
	}
}
