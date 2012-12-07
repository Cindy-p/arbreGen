package Memoire;


/**
 * Cette classe correspond aux photos attribu�es aux personnes de l'arbre g�n�alogique.
 * Une photo est d�sign�e par son nom.
 *
 */
public class Photo {
    private String nomImage;
    
    /**
     * 
     * @param nomImage Nom de la photo
     */
    public Photo(String nomImage){
    	this.nomImage = nomImage;
    }

    /**
     * R�cup�re le nom de la photo d'une personne
     * @return Nom de la photo
     */
    public String getNomImage() {
    	return nomImage;
    }

    /**
     * Modifie le nom de la photo
     * @param nomImage Nom de la photo
     */
    public void setNomImage(String nomImage) {
    	this.nomImage = nomImage;
    }
}
