/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.al;

import graphique.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JTabbedPane;

/**
 *
 * @author linked
 */
public class ALNouveauPersonne implements ActionListener{
    private JTabbedPane ong;
    public ALNouveauPersonne(JTabbedPane ong){
	super();
	this.ong = ong;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
	try {
	    FenetreNew fen = new FenetreNew((Onglet) ong.getSelectedComponent());
	} catch (ParseException ex) {
	    ex.printStackTrace();
	}
    }
    
}
