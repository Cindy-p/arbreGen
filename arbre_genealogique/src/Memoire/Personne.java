package Memoire;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
/**
 * Cette classe modélise les personnes présentes dans l'arbre.<br>
 * Une personne est caractérisée par un nom, plusieurs prénoms, son genre, sa photo, sa date de naissance et sa date de mort.<br>
 * On peut créer, modifier et supprimer une personne.
 */
public class Personne {
	private String nom;
	private LinkedList<String> prenoms;
	private boolean masculin;
	private Photo photo;
	private String dateNaissance;
	private String dateMort;

	/**
	 * Champs à remplir obligatoirement lors de la création d'une personne
	 * @param nom Nom de la personne
	 * @param prenoms Prénoms de la personne
	 * @param masculin Genre de la personne
	 * @param photo Photo de la personne
	 */
	public Personne(String nom, String[] prenoms, boolean masculin, Photo photo) {
		this.nom = nom;
		this.prenoms = preparePrenoms(prenoms);
		this.masculin = masculin;
		this.photo = photo;
	}

	/**
	 * Champs facultatifs lors de la création d'une personne
	 * @param dateNaiss Date de naissance de la personne
	 * @param dateMort Date de mort de la personne
	 */
	public Personne(String nom, String[] prenoms, boolean masculin,
			Photo photo, String dateNaiss, String dateMort) {
		this.nom = nom;
		this.prenoms = preparePrenoms(prenoms);
		this.masculin = masculin;
		this.photo = photo;
		this.dateNaissance = dateNaiss;
		this.dateMort = dateMort;
	}

	/**
	 * Convertir 
	 * @param prenoms
	 * @return
	 */
	private LinkedList<String> preparePrenoms(String[] prenoms) {
		LinkedList<String> lPr = new LinkedList<String>();
		lPr.addAll(Arrays.asList(prenoms));
		return lPr;
	}

	/**
	 * Récupère la date de mort d'une personne
	 * @return Date de mort
	 */
	public String getDateMort() {
		return dateMort;
	}

	/**
	 * Modifie la date de mort d'une personne
	 * @param dateMort Date de mort
	 */
	public void setDateMort(String dateMort) {
		this.dateMort = dateMort;
	}

	
	/**
	 * Récupère la date de naissance d'une personne
	 * @return Date de naissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Modifie la date de naissance d'une personne
	 * @param dateNaissance Date de naissance
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Permet de connaitre le genre d'une personne
	 * @return 1 si la personne est un homme, 0 si la personne est une femme
	 */
	public boolean isMasculin() {
		return masculin;
	}

	/**
	 * Modifie le genre d'une personne
	 * @param masculin Genre
	 */
	public void setMasculin(boolean masculin) {
		this.masculin = masculin;
	}

	/**
	 * Récupère le nom de la personne
	 * @return Nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Modifie le nom de la personne
	 * @param nom Nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Récupère les informations sur la photo d'une personne
	 * @return Nom de la photo
	 */
	public Photo getPhoto() {
		return photo;
	}

	/**
	 * Modifie les informations sur la photo d'une personne
	 * @param photo Photo
	 */
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	/**
	 * Récupère la liste des prénoms d'une personne
	 * @return Liste des prénoms
	 */
	public LinkedList<String> getPrenoms() {
		return prenoms;
	}

	/**
	 * Modifie la liste des prénoms d'une personne
	 * @param prenoms Liste des prénoms
	 */
	public void setPrenoms(LinkedList<String> prenoms) {
		this.prenoms = prenoms;
	}

	/**
	 * Affichage des informations d'une personne
	 */
	public String toString() {
		String s = this.nom + " ";
		for (int i = 0; i < this.prenoms.size(); i++) {
			if (prenoms.get(i) != null)
				s += prenoms.get(i) + ", ";
		}
		if (masculin)
			s += "homme";
		else
			s += "femme";
		return s;
	}
}
