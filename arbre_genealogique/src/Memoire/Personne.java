package Memoire;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;

public class Personne {
	private String nom;
	private String[] prenoms;
	private boolean masculin;
	private String photo;
	private String dateNaissance;
	private String dateMort;

	public Personne(String nom, LinkedList<String> prenoms, boolean masculin, String photo) {
		this.nom = nom;
		this.prenoms = preparePrenoms(prenoms);
		this.masculin = masculin;
		this.photo = photo;
	}

	public Personne(String nom, LinkedList<String> prenoms, boolean masculin,
			String photo, String dateNaiss, String dateMort) {
		this.nom = nom;
		this.prenoms = preparePrenoms(prenoms);
		this.masculin = masculin;
		this.photo = photo;
		this.dateNaissance = dateNaiss;
		this.dateMort = dateMort;
	}

	private String[] preparePrenoms(LinkedList<String> prenoms) {
		String tab_prenoms[] = new String[prenoms.size()];
		
		for(int i = 0 ; i < tab_prenoms.length ; i++)
			tab_prenoms[i] = prenoms.get(i);
		
		return tab_prenoms;
	}

	public String getDateMort() {
		return dateMort;
	}

	public void setDateMort(String dateMort) {
		this.dateMort = dateMort;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean isMasculin() {
		return masculin;
	}

	public void setMasculin(boolean masculin) {
		this.masculin = masculin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String[] getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}

	@Override
	public String toString() {
		String s = "Nom : " + this.nom.toUpperCase() + "\n" + "Prenom(s) : ";
		for (int i = 0; i < this.prenoms.length; i++) {
			if (prenoms[i] != null)
				s += prenoms[i] + " ";
		}
		s += "\n" + "Genre : ";
		if (masculin)
			s += "homme";
		else
			s += "femme";
		if(this.dateNaissance != "" && this.dateMort != "")
			s+= "\n" + "De " + this.dateNaissance + " � " + this.dateMort;
		
		s+= "\n" + "Photo  : " + this.photo + "\n";
		return s;
	}
}
