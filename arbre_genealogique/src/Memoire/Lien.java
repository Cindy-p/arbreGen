package Memoire;

import java.util.LinkedList;
import java.util.Scanner;

public class Lien {
	private String typeLien;
	private Personne origine;
	private Personne destination;
	
	private static String[] liensExistants = {"marital", "fraternel", "parental"};
	private static String[] liensInit = {"marié à", "mariée à", "divorcé de", "divorcée de", "frère de", "soeur de", "père de", "mère de"};
	
	public Lien(String typeLien, Personne origine, Personne destination) {
		super();
		this.typeLien = typeLien;
		this.origine = origine;
		this.destination = destination;
	}
	
	public Lien(){
		
	}

//----------------------------------------------- GETTERS AND SETTERS	
	
	public String getTypeLien() {
		return typeLien;
	}
	
	public void setTypeLien(String typeLien){
		this.typeLien = typeLien;
	}

	public Personne getOrigine() {
		return origine;
	}

	public void setOrigine(Personne origine) {
		this.origine = origine;
	}

	public Personne getDestination() {
		return destination;
	}

	public void setDestination(Personne destination) {
		this.destination = destination;
	}

//----------------------------------------------- METHODES
	
//g�rer le cas ou le lien n'est pas valide	
	public void creerLien(int choix){
		if(this.verifierLien())
			this.initialiserLien(choix);
		else
			System.out.println("Le lien saisi n'est pas disponible");
	}
	
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
	
	public String initialiserLien(int choix ){
		
		if(typeLien == liensExistants[0]){
			switch(choix){ 
				case 1 :
					if (this.origine.isMasculin())
						typeLien = "marié à";
					else
						typeLien = "mariée à";
				break;
				case 2 :
					if (this.origine.isMasculin())
						typeLien = "divorcé de";
					else
						typeLien = "divorcée de";
				break;
			}
		
		}
		else if(typeLien == liensExistants[1]){
			if (this.origine.isMasculin())
				typeLien = "frère de";
			else
				typeLien = "soeur de";
		}
		else {
			if (this.origine.isMasculin())
				typeLien = "père de";
			else
				typeLien = "mère de";
		}
		return typeLien;
	}

	@Override
	public String toString() {
		String lienEcrit = "";
			
			if(!this.verifierLien()){
				System.out.println(this.typeLien);
				return "Le lien n'a pas pu être créé";
			}
			if(this.origine.isMasculin())
				lienEcrit += this.origine.getNom() + " " + this.origine.getPrenoms()[0];
			else
				lienEcrit += this.origine.getNom() + " " + this.origine.getPrenoms()[0];
			
			lienEcrit += " " + this.typeLien + " ";
			
			if(this.destination.isMasculin())
				lienEcrit += this.destination.getNom() + " " + this.destination.getPrenoms()[0];
			else
				lienEcrit += this.destination.getNom() + " " + this.destination.getPrenoms()[0];
			
			return lienEcrit;
	}
	
	
}
