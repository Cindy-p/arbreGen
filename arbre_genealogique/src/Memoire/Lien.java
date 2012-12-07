package Memoire;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * Cette classe modélise les liens entre les personnes de l'arbre généalogique.<br> 
 * Un lien est caractérisé par son type et les deux personnes concernées.<br>
 * On peut créer, modifier et supprimer un lien.
 */

public class Lien {
	private String typeLien;
	private Personne origine;
	private Personne destination;
	
	private static String[] liensExistants = {"marital", "fraternel", "parental"};
	private static String[] liensInit = {"marié à", "mariée à", "divorcé de", "divorcée de", "frère de", "soeur de", "père de", "mère de"};
	
	
	/**
	 * @param typeLien Type de lien entre deux personnes
	 * @param origine Première personne concernée par le lien
	 * @param destination Deuxième personne concernée par le lien
	 */
	public Lien(String typeLien, Personne origine, Personne destination) {
		super();
		this.typeLien = typeLien;
		this.origine = origine;
		this.destination = destination;
	}
	
//----------------------------------------------- GETTERS AND SETTERS	
	/**
	 * Récupère le type de lien
	 * @return Type de lien entre deux personnes
	 */
	public String getTypeLien() {
		return typeLien;
	}

	/**
	 * Récupère les informations sur la première personne concernée par le lien
	 * @return Première personne concernée par le lien
	 */
	public Personne getOrigine() {
		return origine;
	}

	/**
	 * Modifie la première personne concernée par le lien
	 * @param origine Première personne concernée par le lien
	 */
	public void setOrigine(Personne origine) {
		this.origine = origine;
	}

	/**
	 * Récupère les informations sur la deuxième personne concernée par le lien
	 * @return Deuxième personne concernée par le lien
	 */
	public Personne getDestination() {
		return destination;
	}

	/**
	 * Modifie la deuxième personne concernée par le lien
	 * @param destination Deuxième personne concernée par le lien
	 */
	public void setDestination(Personne destination) {
		this.destination = destination;
	}

//----------------------------------------------- METHODES
	
	/**
	 * 
	 * @param choix
	 */
	//gérer le cas ou le lien n'est pas valide	
	public void creerLien(int choix){
		if(this.verifierLien())
			this.initialiserLien(choix);
		else
			System.out.println("Le lien saisi n'est pas disponible");
	}
	
	/**
	 * Vérifie que le lien entré par l'utilisateur correspond bien à un lien existant
	 * @return 0 si le lien entré est incorrect, 1 si le lien entré est correct
	 */
	public boolean verifierLien(){
		int i = 0;
		this.typeLien = getTypeLien(); 
		while( i < liensExistants.length){
			if(typeLien.toLowerCase() == liensExistants[i]){
				return true;
			}
			i++;
		}
		i = 0;
		while( i < liensInit.length){
			if(typeLien.toLowerCase() == liensInit[i]){
				System.out.println();
				return true;
			}
			i++;
		}
		return false;
	}
	
	
	/**
	 * 
	 * @param choix
	 * @return
	 */
	public String initialiserLien(int choix) {

		if (typeLien == liensExistants[0]) {
			switch (choix) {
			case 1:
				if (this.origine.isMasculin())
					typeLien = "marié à";
				else
					typeLien = "mariée à";
				break;
			case 2:
				if (this.origine.isMasculin())
					typeLien = "divorcé de";
				else
					typeLien = "divorcée de";
				break;
			}

		} else if (typeLien == liensExistants[1]) {
			if (this.origine.isMasculin())
				typeLien = "frère de";
			else
				typeLien = "soeur de";
		} else {
			if (this.origine.isMasculin())
				typeLien = "père de";
			else
				typeLien = "mère de";
		}
		return typeLien;
	}

	
	/**
	 * 
	 */
	public String toString() {
		String lienEcrit = "";
			
			if(!this.verifierLien()){
				System.out.println(this.typeLien);
				return "Le lien n'a pas pu être créé";
			}
			if(this.origine.isMasculin())
				lienEcrit += this.origine.getNom() + " " + this.origine.getPrenoms().getFirst();
			else
				lienEcrit += this.origine.getNom() + " " + this.origine.getPrenoms().getFirst();
			
			lienEcrit += " " + this.typeLien + " ";
			
			if(this.destination.isMasculin())
				lienEcrit += this.destination.getNom() + " " + this.destination.getPrenoms().getFirst();
			else
				lienEcrit += this.destination.getNom() + " " + this.destination.getPrenoms().getFirst();
			
			return lienEcrit;
	}
	
	
}
