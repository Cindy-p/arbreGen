package Memoire;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Cette classe mod�lise l'arbre g�n�alogique.<br>
 * Un arbre est d�sign� par son nom, ses dates de cr�ation et de modification ainsi qu'une liste de personnes.<br>
 * On peut cr�er un arbre, le sauvegarder et le charger.
 * 
 */

public class Arbre {
	private boolean saved;
	private boolean nouveau;
	private String nomArbre;
	private String dateCreation;
	private String dateModification;
	private LinkedList<Personne> listePersonnes;
	
	/**
	 * @param nomArbre Nom de l'arbre
	 * @param dateCreation Date de cr�ation de l'arbre
	 * @param nouveau Indique si l'arbre vient d'�tre cr�� ou non
	 * @param saved Indique si l'arbre a �t� sauvegard�
	 */
	public Arbre(String nomArbre, String dateCreation, boolean nouveau, boolean saved) {
		super();
		this.nomArbre = nomArbre;
		this.dateCreation = dateCreation;
		this.nouveau = nouveau;
		this.saved = saved;
	}
	
//----------------------------------------------- GETTERS AND SETTERS
	
	/**
	 * Permet de savoir si le fichier a bien �t� sauvegard�
	 * @return 0 si le fichier n'a pas �t� sauvegard�, 1 si le fichier a �t� sauvegard�
	 */
	
	public boolean isSaved() {
		return saved;
	}
	
	
	/**
	 * Permet de modifier le statut de sauvegarde du fichier
	 * @param saved bool�en indiquant l'�tat de sauvegarde du fichier
	 */

	public void setSaved(boolean saved) {
		this.saved = saved;
	}
	
	/**
	 * R�cup�re le nom de l'arbre
	 * @return Nom de l'arbre
	 */
	
	public String getNomArbre() {
		return nomArbre;
	}

	/**
	 * Modifie le nom de l'arbre
	 * @param nomArbre Nom de l'arbre
	 */
	
	public void setNomArbre(String nomArbre) {
		this.nomArbre = nomArbre;
	}
	
	
	/**
	 * R�cup�re la date de cr�ation de l'arbre
	 * @return Date de cr�ation de l'arbre
	 */
	
	public String getDateCreation() {
		return dateCreation;
	}
	
	
	/**
	 * Modifie la date de cr�ation de l'arbre
	 * @param dateCreation Date de cr�ation de l'arbre
	 */
	
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	/**
	 * R�cup�re la date de modification de l'arbre
	 * @return Date de modification de l'arbre
	 */
	
	public String getDateModification() {
		return dateModification;
	}
	
	
	/**
	 * Change la date de modification de l'arbre
	 * @param dateModification Date de modification de l'arbre
	 */
	
	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
	}
	
	
	/**
	 * R�cup�re la liste des personnes pr�sentes dans l'arbre
	 * @return Liste des personnes pr�sentes dans l'arbre
	 */
	
	public LinkedList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	
	
	/**
	 * Modifie la liste des personnes pr�sentes dans l'arbre
	 * @param listePersonnes Liste des personnes pr�sentes dans l'arbre
	 */
	
	public void setListePersonnes(LinkedList<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

// ---------------------------------------------- METHODES
	
	//TODO m�thodes d'enregistrement et de chargement
	
}
