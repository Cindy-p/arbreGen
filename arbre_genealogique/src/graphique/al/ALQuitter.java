/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author linked
 */
public class ALQuitter implements ActionListener{
    public ALQuitter(){
	super();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
	System.exit(0);
    }
}
