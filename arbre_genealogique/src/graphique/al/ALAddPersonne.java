/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.al;

import Memoire.*;
import graphique.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author linked
 */
public class ALAddPersonne implements ActionListener{
    private JFrame fen;
    private Onglet ong;
    private JTextField nom;
    private JTextField prenoms;
    private JRadioButton masculin;
    private JFormattedTextField dateNaiss;
    private JFormattedTextField dateMort;
    private JTextField photo;

    
    public ALAddPersonne(JFrame fen, Onglet ong, JTextField nom, JTextField prenoms, JRadioButton masculin, JFormattedTextField dateNaiss, JFormattedTextField dateMort, JTextField photo){
	super();
	this.fen = fen;
	this.ong = ong;
	this.nom = nom;
	this.prenoms = prenoms;
	this.dateMort = dateMort;
	this.dateNaiss = dateNaiss;
	this.masculin = masculin;
	this.photo = photo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
	fen.dispose();
	Arbre arbre = ong.getArbre();
	LinkedList<Personne> lPerso = arbre.getListePersonnes();
	LinkedList<String> lPrenoms = new LinkedList(Arrays.asList(prenoms.getText().split(" ")));
	
	if(dateNaiss.getText() == null && dateMort.getText() == null && photo.getText() == null)
	    lPerso.add(new Personne(nom.getText(), lPrenoms, masculin.isSelected(), "default.png"));
	else if(dateNaiss.getText() == null && dateMort.getText() == null && photo.getText() != null)
	    lPerso.add(new Personne(nom.getText(), lPrenoms, masculin.isSelected(), photo.getText()));
	else if(photo.getText() == null)
    	    lPerso.add(new Personne(nom.getText(), lPrenoms, masculin.isSelected(), "default.png", dateNaiss.getText(), dateMort.getText()));
	else
	    lPerso.add(new Personne(nom.getText(), lPrenoms, masculin.isSelected(), photo.getText(), dateNaiss.getText(), dateMort.getText()));
	
	arbre.setListePersonnes(lPerso);
	ong.setArbre(arbre);
	ong.repaint();
	ong.add(new CompoPersonne(lPerso.getLast()));
    }
}
