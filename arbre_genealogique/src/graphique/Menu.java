/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import graphique.al.*;

/**
 *
 * @author linked
 */
public class Menu extends JMenuBar{
   private JMenu menuFich = new JMenu("Fichier");
   private JMenu fichNouveau = new JMenu("Nouveau");
   private JMenuItem nouvArbre = new JMenuItem("Arbre");
   private JMenuItem nouvPers = new JMenuItem("Personne");
   private JMenuItem fichOuvrir = new JMenuItem("Ouvrir");
   private JMenuItem fichSauver = new JMenuItem("Enregistrer");
   private JMenuItem fichSauverSous = new JMenuItem("Enregistrer sous");
   private JMenuItem fichQuitter = new JMenuItem("Quitter");
   
   private JMenu menuEdit = new JMenu("Edition");
   private JMenuItem editAnnuler = new JMenuItem("Annuler");
   private JMenuItem editRetablir = new JMenuItem("Rétablir");
   private JMenuItem editCopier = new JMenuItem("Copier");
   private JMenuItem editColler = new JMenuItem("Coller");
   private JMenuItem editCouper = new JMenuItem("Couper");
   private JMenuItem editSuppr = new JMenuItem("Supprimer");
   private JMenuItem editSelect = new JMenuItem("Selectionner");
   private JMenuItem editSelectAll = new JMenuItem("Selectionner tout");
   private JMenuItem editChercher = new JMenuItem("Rechercher");
   
   private JMenu menuAffi = new JMenu("Affichage");
   
   private JMenu menuOuti = new JMenu("Outils");
   
   private JMenu menuAide = new JMenu("Aide");
   private JMenuItem aideAide = new JMenuItem("Aide");
   private JMenuItem aideAPropos = new JMenuItem("A propos");
   
   public Menu(Fenetre fen){
       this.menuFich.setMnemonic('F');
       this.menuEdit.setMnemonic('E');
       this.menuAffi.setMnemonic('A');
       this.menuOuti.setMnemonic('O');
       this.menuAide.setMnemonic('I');
       
       this.menuFich.add(this.fichNouveau);
       this.fichNouveau.setMnemonic('N');
       
       this.fichNouveau.add(this.nouvArbre);
       this.nouvArbre.addActionListener(new ALNouveau(fen, this));
       this.nouvArbre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
       this.nouvArbre.setMnemonic('A');
       
       this.fichNouveau.add(this.nouvPers);
       this.nouvPers.addActionListener(new ALNouveauPersonne(fen.getOnglets()));
       this.nouvPers.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK));
       this.nouvPers.setMnemonic('P');
       this.nouvPers.setEnabled(false);

       
       this.menuFich.add(this.fichOuvrir);
       this.fichOuvrir.addActionListener(new ALParDefaut());
       this.fichOuvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK));
       this.fichOuvrir.setMnemonic('O');
       
       this.menuFich.addSeparator();
       this.menuFich.add(this.fichSauver);
       this.fichSauver.addActionListener(new ALParDefaut());
       this.fichSauver.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
       this.fichSauver.setMnemonic('S');
       
       this.menuFich.add(this.fichSauverSous);
       this.fichSauverSous.addActionListener(new ALParDefaut());
       this.fichSauverSous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK));
       this.fichSauverSous.setMnemonic('U');
       
       this.menuFich.addSeparator();
       this.menuFich.add(this.fichQuitter);
       this.fichQuitter.addActionListener(new ALQuitter());
       this.fichQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK));
       this.fichQuitter.setMnemonic('Q');
       
       this.menuEdit.add(this.editAnnuler);
       this.editAnnuler.addActionListener(new ALParDefaut());
       this.editAnnuler.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
       this.editAnnuler.setMnemonic('U');
       
       this.menuEdit.add(this.editRetablir);
       this.editRetablir.addActionListener(new ALParDefaut());
       this.editRetablir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK));
       this.editRetablir.setMnemonic('R');
       
       this.menuEdit.addSeparator();
       this.menuEdit.add(this.editCouper);
       this.editCouper.addActionListener(new ALParDefaut());
       this.editCouper.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
       this.editCouper.setMnemonic('O');
       
       this.menuEdit.add(this.editCopier);
       this.editCopier.addActionListener(new ALParDefaut());
       this.editCopier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
       this.editCopier.setMnemonic('C');
       
       this.menuEdit.add(this.editColler);
       this.editColler.addActionListener(new ALParDefaut());
       this.editColler.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
       this.editColler.setMnemonic('L');
       
       this.menuEdit.add(this.editSuppr);
       this.editSuppr.addActionListener(new ALParDefaut());
       this.editSuppr.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
       this.editSuppr.setMnemonic('S');
       
       this.menuEdit.addSeparator();
       this.menuEdit.add(this.editSelect);
       this.editSelect.addActionListener(new ALParDefaut());
       this.editSelect.setMnemonic('E');
       
       this.menuEdit.add(this.editSelectAll);
       this.editSelectAll.addActionListener(new ALParDefaut());
       this.editSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
       this.editSelectAll.setMnemonic('T');
       
       this.menuEdit.addSeparator();
       this.menuEdit.add(this.editChercher);
       this.editChercher.addActionListener(new ALParDefaut());
       this.editChercher.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
       this.editChercher.setMnemonic('H');
       
       this.menuAide.add(this.aideAide);
       this.aideAide.addActionListener(new ALParDefaut());
       this.aideAide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
       this.aideAide.setMnemonic('A');
       
       this.menuAide.add(this.aideAPropos);
       this.aideAPropos.addActionListener(new aProposMsgBox());
       this.aideAPropos.setMnemonic('P');
       
       
       this.add(menuFich);
       this.add(menuEdit);
       this.add(menuAffi);
       this.add(menuOuti);
       this.add(menuAide);
   }
   
   public void enableNouvPerso(boolean b){
       this.nouvPers.setEnabled(b);
   }
}
