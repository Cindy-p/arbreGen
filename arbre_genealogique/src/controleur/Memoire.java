package controleur;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;
import java.text.ParseException;


import Memoire.*;

public class Memoire {

	public final static int EXIT_SUCCESS = 0;
	public final static int EXIT_FAILURE = 1;
	
	
	public static void main(String[] args) throws ParseException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choix ;
		System.out.println(" ***** Genealogie v0.1 *****\n\n");
		
		System.out.println("1 - Créer Arbre\n");
		System.out.println("2 - Ouvrir Arbre\n");
		System.out.println("3 - Quitter\n");
		
		do{
			System.out.print("votre choix : ");
			choix = sc.nextInt();
		
			switch(choix){
			
				case 1 : 
//					System.out.println("choix 1");
					@SuppressWarnings("unused")
					Arbre arbre = creerArbre();
					
					System.out.println(" ***** Genealogie v0.1 *****\n\n");
					
					System.out.println("1 - Créer Personne\n");
					System.out.println("2 - Modifier Personne\n");
					System.out.println("3 - Créer Lien\n");
					System.out.println("4 - Modifier Lien\n");
					System.out.println("5 - Enregistrer\n");
					System.out.println("6 - Retour Menu principal\n");
					System.out.println("7 - Quitter\n");
					
					do{
						System.out.println("votre choix : ");
						choix = sc.nextInt();
						
						switch(choix){
							case 1 :
								System.out.println("choix 1");
								//TODO creerPersonne();
							break;
							case 2 :
								System.out.println("choix 2");
								//TODO modifierPersonne();
							break;
							case 3 : 
								System.out.println("choix 3");
								//TODO creerLien();
							break;
							case 4 :
								System.out.println("choix 4");
								//TODO modifierLien();
							break;
							case 5 :
								System.out.println("choix 5");
								//TODO enregistrer();
							break;
							case 6 :
								System.out.println("choix  6");
								retour();
							break;
							case 7 :
								quitter();
							default :
								System.out.println("le choix saisi est incorrect\n");
							break;
						}
					}while(choix != 1 && choix != 2 && choix != 3 && choix != 4 && choix != 5 && choix != 6 && choix != 7);
				break;
				case 2 :
					System.out.println("choix 2");
					//TODO modifierArbre();
				break;
				case 3 :
					quitter();
				break;
				default :
					System.out.println("le choix saisi est incorrect\n");
				break;
			}
		}while(choix != 1 && choix != 2 && choix != 3);

	}
	
	public static void quitter(){
		System.exit(EXIT_SUCCESS);
	}

// ----------------------------------------------- METHODES	

// --------------------- ARBRE
	
	@SuppressWarnings("resource")
	public static Arbre creerArbre() throws ParseException{
		Scanner sc = new Scanner(System.in);
		String nom = "";
		Arbre arbre = null;
		
		System.out.print("Nom de l'arbre : ");
		nom = sc.nextLine();
		while(nom.isEmpty()|| nom == ""){
			System.out.println("vous devez saisir un nom.\n");
			nom = sc.nextLine();
		}
		
		Calendar cal = Calendar.getInstance();
		int jour = cal.get(Calendar.DAY_OF_MONTH);
		int mois = cal.get(Calendar.MONTH)+1; // car renvoie le numero d'une case de tableau (donc de 0 à 11)
		int annee = cal.get(Calendar.YEAR);
		
		String dateCreation = jour + "/" + mois + "/" + annee;
		
		try {
			arbre = new Arbre(nom, dateCreation, true, false);
		} catch (Exception e){
			System.out.println("Erreur : " + e + "\n");
			System.exit(EXIT_FAILURE); // en cas d'erreur on sort du programme
		}
		return arbre;
	}
	
	public static void ouvrirArbre(){
		//TODO
	}


	public static void enregistrer(){
		//TODO
	}
	
// --------------------- PERSONNE
	
	
	@SuppressWarnings({ "unused", "resource" })
	public static void creerPersonne(){
		Scanner sc = new Scanner(System.in);
		String nom = "";
		String prenom = "";
		LinkedList<String> prenoms = new LinkedList<String>();
		String DateNaissance = "";
		String DateMort = "";
		Photo photo;
		
		System.out.println("Homme (1) ou Femme (2)");
		int choix; 
		do{
			choix = sc.nextInt();
		}while(choix != 1 && choix != 2);
		
		//TODO gestion du genre
		
		
		System.out.println("Nom de la personne : ");
		nom = sc.nextLine();
		
		System.out.println("Prénoms de la personne : ");
		while(!prenom.isEmpty() || prenom != "\n"){
			prenom = sc.nextLine();
			prenoms.add(prenom);
		}
		
		System.out.println("Date de Naissance : (de la forme jj/mm/yyyy)");
		do{
			DateNaissance = sc.nextLine();
		}while(DateNaissance.length() != 10);
		
		System.out.println("Date de mort : (de la forme jj/mm/yyyy)");
		do{
			DateMort = sc.nextLine();
		}while(DateNaissance.length() != 10);
		
		System.out.println("Photo : (entrer le chemin absolu du fichier)");
		String tmp = sc.nextLine();
		photo = new Photo(tmp);
	}
	
	public static void modifierPersonne(){
		//TODO
	}

// --------------------- LIEN
	
	public static void creerLien(){
		//TODO
	}
	
	public static void modifierLien(){
		//TODO
	}
	
// --------------------- DIVERS
	
	public static void retour(){
		try {
			Memoire.main(null);
		} catch (ParseException e) {
			System.out.println("Erreur : " + e + "\n");
			System.exit(EXIT_FAILURE);
		}
	}
}
