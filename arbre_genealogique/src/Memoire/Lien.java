package Memoire;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * Cette classe mod�lise les liens entre les personnes de l'arbre g�n�alogique.<br> 
 * Un lien est caract�ris� par son type et les deux personnes concern�es.<br>
 * On peut cr�er, modifier et supprimer un lien.
 */

public class Lien {
	private String typeLien;
	private Personne origine;
	private Personne destination;
	
	private static String[] liensExistants = {"marital", "fraternel", "parental"};
	private static String[] liensInit = {"mari� �", "mari�e �", "divorc� de", "divorc�e de", "fr�re de", "soeur de", "p�re de", "m�re de"};
	
	
	/**
	 * @param typeLien Type de lien entre deux personnes
	 * @param origine Premi�re personne concern�e par le lien
	 * @param destination Deuxi�me personne concern�e par le lien
	 */
	public Lien(String typeLien, Personne origine, Personne destination) {
		super();
		this.typeLien = typeLien;
		this.origine = origine;
		this.destination = destination;
	}
	
//----------------------------------------------- GETTERS AND SETTERS	
	/**
	 * R�cup�re le type de lien
	 * @return Type de lien entre deux personnes
	 */
	public String getTypeLien() {
		return typeLien;
	}

	/**
	 * R�cup�re les informations sur la premi�re personne concern�e par le lien
	 * @return Premi�re personne concern�e par le lien
	 */
	public Personne getOrigine() {
		return origine;
	}

	/**
	 * Modifie la premi�re personne concern�e par le lien
	 * @param origine Premi�re personne concern�e par le lien
	 */
	public void setOrigine(Personne origine) {
		this.origine = origine;
	}

	/**
	 * R�cup�re les informations sur la deuxi�me personne concern�e par le lien
	 * @return Deuxi�me personne concern�e par le lien
	 */
	public Personne getDestination() {
		return destination;
	}

	/**
	 * Modifie la deuxi�me personne concern�e par le lien
	 * @param destination Deuxi�me personne concern�e par le lien
	 */
	public void setDestination(Personne destination) {
		this.destination = destination;
	}

//----------------------------------------------- METHODES
	
	/**
	 * 
	 * @param choix
	 */
	//g�rer le cas ou le lien n'est pas valide	
	public void creerLien(int choix){
		if(this.verifierLien())
			this.initialiserLien(choix);
		else
			System.out.println("Le lien saisi n'est pas disponible");
	}
	
	/**
	 * V�rifie que le lien entr� par l'utilisateur correspond bien � un lien existant
	 * @return 0 si le lien entr� est incorrect, 1 si le lien entr� est correct
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
					typeLien = "mari� �";
				else
					typeLien = "mari�e �";
				break;
			case 2:
				if (this.origine.isMasculin())
					typeLien = "divorc� de";
				else
					typeLien = "divorc�e de";
				break;
			}

		} else if (typeLien == liensExistants[1]) {
			if (this.origine.isMasculin())
				typeLien = "fr�re de";
			else
				typeLien = "soeur de";
		} else {
			if (this.origine.isMasculin())
				typeLien = "p�re de";
			else
				typeLien = "m�re de";
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
				return "Le lien n'a pas pu �tre cr��";
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
