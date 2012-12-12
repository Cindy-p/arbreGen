/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author linked
 */
public class ALAnnuler implements ActionListener{
    private JFrame fen;
    public ALAnnuler(JFrame fen){
	super();
	this.fen = fen;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
	fen.dispose();
    }
}
