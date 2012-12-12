/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author linked
 */
public class aProposMsgBox implements ActionListener{
    public aProposMsgBox(){
	super();
    }
    
    final String s = "Projet Java réalisé par Erwan Masson, \nCindy Perat, Steven Marie\net Jean-Baptiste Louvet.";
    
    @Override
    public void actionPerformed(ActionEvent ae) {
		JOptionPane.showMessageDialog(null, s, "A Propos", JOptionPane.INFORMATION_MESSAGE);
	    }
}