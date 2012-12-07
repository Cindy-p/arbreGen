package Memoire;

import java.util.Date;

public class Femme extends Personne {
	public Femme(String nom, String[] prenoms, boolean masculin, Photo photo,
			String dateNaiss, String dateMort) {
		super(nom, prenoms, masculin, photo, dateNaiss, dateMort);
	}

	private String nomDeJeuneFille;

	public String getNomDeJeuneFille() {
		return nomDeJeuneFille;
	}

	public void setNomDeJeuneFille(String nomDeJeuneFille) {
		this.nomDeJeuneFille = nomDeJeuneFille;
	}
	
}
