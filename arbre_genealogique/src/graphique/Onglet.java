/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import Memoire.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author linked
 */
public class Onglet extends JPanel{
    String nom;
    Arbre arbre;
    
    public Onglet(String nom){
	super();
	this.nom = nom;
	this.setLayout(new FlowLayout());
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	this.arbre = new Arbre(this.nom, formatter.format(new Date()), true, false);
	
	LinkedList<String> per = new LinkedList<>();
	per.add("Erwan");
	Personne personne = new Personne("Masson", per, true, "default.png");
	
	JLabel lib = new JLabel(personne.getNom() +" \n"+ personne.getPrenoms()[0]);
	Border bord = BorderFactory.createTitledBorder(personne.getNom() + " " + personne.getPrenoms()[0]);
	lib.setBorder(bord);
	this.add(lib);
    }
    
    public Onglet(String nom, Arbre arbre){
	super();
	this.nom = nom;
	this.arbre = arbre;
    }

    public Arbre getArbre() {
	return arbre;
    }

    public void setArbre(Arbre arbre) {
	this.arbre = arbre;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }
    
    public void paintComponent(Graphics g){
	LinkedList<Personne> lPerso = this.arbre.getListePersonnes();
	ListIterator<Personne> lilPerso = lPerso.listIterator();
	Personne p;
	
	while(lilPerso.hasNext()){
	    p = lilPerso.next();
/*	    g.drawRect(0, 0, 50, 30);
	    g.drawString(p.getNom(), 5, 5);
	    g.drawString(p.getPrenoms()[0], 15, 5);*/
//	    this.add(new CompoPersonne(p));
//	    this.add(new JButton(p.getNom()));
	}
    }
}