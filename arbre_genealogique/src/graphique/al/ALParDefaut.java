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
public class ALParDefaut implements ActionListener{
    public ALParDefaut(){
	super();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
		JOptionPane.showMessageDialog(null, "Fonction non supportée", "Information", JOptionPane.ERROR_MESSAGE);	    
	    }
}
