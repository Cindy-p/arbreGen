/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import graphique.al.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author linked
 */
public class FenetreNew extends JFrame{
    
    public FenetreNew(Onglet ong) throws ParseException{
	this.setSize(600, 250);
	this.setLocationRelativeTo(null);
	
	this.setTitle("Nouvelle personne");
	
	JPanel panPrincipal = new JPanel();
	GridLayout gl = new GridLayout(7, 2, 10, 10);
	panPrincipal.setLayout(gl);
	
	JPanel pan1 = new JPanel();
	pan1.setLayout(new BoxLayout(pan1, BoxLayout.LINE_AXIS));
		
	panPrincipal.add(new JLabel("*Nom :"));
	JTextField TextNom = new JTextField(10);
	panPrincipal.add(TextNom);
	
	panPrincipal.add(new JLabel("*Prenoms : (Séparés par des espaces)"));
	JTextField TextPrenom = new JTextField(10);
	panPrincipal.add(TextPrenom);
	
	panPrincipal.add(new JLabel("*Sexe :"));
	JRadioButton masc = new JRadioButton("Masculin");
	JRadioButton fem = new JRadioButton("Feminin");
	ButtonGroup sexe = new ButtonGroup();
	sexe.add(fem);
	sexe.add(masc);
	pan1.add(masc);
	pan1.add(fem);
	panPrincipal.add(pan1);
	
	panPrincipal.add(new JLabel("Date de naissance : "));
	
	    MaskFormatter date = new MaskFormatter("##/##/####");
	    JFormattedTextField dateNaiss = new JFormattedTextField(date);
	    JFormattedTextField dateMort = new JFormattedTextField(date);
	    panPrincipal.add(dateNaiss);
	    panPrincipal.add(new JLabel("Date de décès : "));
	    panPrincipal.add(dateMort);
	
	panPrincipal.add(new JLabel("Photo : "));
	JTextField cheminPhoto = new JTextField(); // remplacer par fileChooser
	panPrincipal.add(cheminPhoto);
	
	JButton valider = new JButton("Valider");
	JButton annuler = new JButton("Annuler");
	panPrincipal.add(valider);
	panPrincipal.add(annuler);
	annuler.addActionListener(new ALAnnuler(this));
	valider.addActionListener(new ALAddPersonne(this, ong, TextNom, TextPrenom, masc, dateNaiss, dateMort, cheminPhoto));
	
	this.setContentPane(panPrincipal);
	
	this.setVisible(true);
    }
}
