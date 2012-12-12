/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import Memoire.*;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author linked
 */
public class CompoPersonne extends JComponent{
    private Personne personne;
    
    public CompoPersonne(Personne personne){
	super();
	this.personne = personne;
	JLabel lib = new JLabel(personne.getNom() +" \n"+ personne.getPrenoms()[0]);
	Border bord = BorderFactory.createTitledBorder(personne.getNom() + " " + personne.getPrenoms()[0]);
	lib.setBorder(bord);
	this.add(lib);
    }
}
