/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import graphique.*;

/**
 *
 * @author linked
 */
public class ALNouveau implements ActionListener{
    
    private Fenetre fen;
    private Menu menu;
    
    public ALNouveau(Fenetre fen, Menu menu){
	super();
	this.fen = fen;
	this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
	JTabbedPane onglets = fen.getOnglets();
	
	JOptionPane jop = new JOptionPane();
	String nom = jop.showInputDialog(fen, "Veuillez entrer le nom du nouvel arbre", "Nouvel Arbre", JOptionPane.QUESTION_MESSAGE);
	
	Onglet pan = new Onglet(nom);
	
	onglets.add(nom, pan);
	onglets.setSelectedComponent(pan);
	fen.setOnglets(onglets);
	
	menu.enableNouvPerso(true);
	fen.setJMenuBar(menu);
    }
    
}
