package Memoire;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Cette classe modélise l'arbre généalogique.<br>
 * Un arbre est désigné par son nom, ses dates de création et de modification ainsi qu'une liste de personnes.<br>
 * On peut créer un arbre, le sauvegarder et le charger.
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
	 * @param dateCreation Date de création de l'arbre
	 * @param nouveau Indique si l'arbre vient d'être créé ou non
	 * @param saved Indique si l'arbre a été sauvegardé
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
	 * Permet de savoir si le fichier a bien été sauvegardé
	 * @return 0 si le fichier n'a pas été sauvegardé, 1 si le fichier a été sauvegardé
	 */
	
	public boolean isSaved() {
		return saved;
	}
	
	
	/**
	 * Permet de modifier le statut de sauvegarde du fichier
	 * @param saved booléen indiquant l'état de sauvegarde du fichier
	 */

	public void setSaved(boolean saved) {
		this.saved = saved;
	}
	
	/**
	 * Récupère le nom de l'arbre
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
	 * Récupère la date de création de l'arbre
	 * @return Date de création de l'arbre
	 */
	
	public String getDateCreation() {
		return dateCreation;
	}
	
	
	/**
	 * Modifie la date de création de l'arbre
	 * @param dateCreation Date de création de l'arbre
	 */
	
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	/**
	 * Récupère la date de modification de l'arbre
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
	 * Récupère la liste des personnes présentes dans l'arbre
	 * @return Liste des personnes présentes dans l'arbre
	 */
	
	public LinkedList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	
	
	/**
	 * Modifie la liste des personnes présentes dans l'arbre
	 * @param listePersonnes Liste des personnes présentes dans l'arbre
	 */
	
	public void setListePersonnes(LinkedList<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

// ---------------------------------------------- METHODES
	
	//TODO méthodes d'enregistrement et de chargement
	
}
