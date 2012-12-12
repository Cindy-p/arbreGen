package Memoire;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Arbre {
	private boolean saved;
	private boolean nouveau;
	private String nomArbre;
	private String dateCreation;
	private String dateModification;
	private LinkedList<Personne> listePersonnes;
	
	public Arbre(String nomArbre, String dateCreation, boolean nouveau, boolean saved) {
		super();
		this.nomArbre = nomArbre;
		this.dateCreation = dateCreation;
		this.nouveau = nouveau;
		this.saved = saved;
		this.listePersonnes = new LinkedList<Personne>();
	}
	
	public Arbre() {
	}
	
	
//----------------------------------------------- GETTERS AND SETTERS	
	
	public boolean isSaved() {
		return saved;
	}

	public void setSaved(boolean saved) {
		this.saved = saved;
	}
	
	public String getNomArbre() {
		return nomArbre;
	}

	public void setNomArbre(String nomArbre) {
		this.nomArbre = nomArbre;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDateModification() {
		return dateModification;
	}
	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
	}
	public LinkedList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	public void setListePersonnes(LinkedList<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

// ---------------------------------------------- METHODES
	
	//TODO m�thodes d'enregistrement et de chargement
	
}
