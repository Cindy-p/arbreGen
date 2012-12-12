/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import graphique.al.*;

/**
 *
 * @author linked
 */
public class Fenetre extends JFrame {
    
    private JPanel container = new JPanel();
    
    private JPopupMenu popup = new JPopupMenu();
    
    private JMenuItem popupAnnuler = new JMenuItem("Annuler");
    private JMenuItem popupRetablir = new JMenuItem("Rétablir");
    private JMenuItem popupCopier = new JMenuItem("Copier");
    private JMenuItem popupColler = new JMenuItem("Coller");
    private JMenuItem popupCouper = new JMenuItem("Couper");
    private JMenuItem popupSuppr = new JMenuItem("Supprimer");
    private JMenuItem popupSelectAll = new JMenuItem("Selectionner tout");
    private JMenuItem popupChercher = new JMenuItem("Rechercher");
    private JMenuItem popupQuitter = new JMenuItem("Quitter");
    
    private JTabbedPane onglets = new JTabbedPane();
	    
    public static void main(String[] args){
	Fenetre fen = new Fenetre();
    }
    
    public Fenetre(){
	this.setSize(750, 550);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	
	this.setTitle("Généalogic");
	
	container.setBackground(Color.white);
	container.setLayout(new BorderLayout());

	container.addMouseListener(new MouseAdapter(){
	    @Override
	    public void mouseReleased(MouseEvent event){
		//Seulement s'il s'agit d'un clic droit
		if(event.getButton() == MouseEvent.BUTTON3){
		//if(event.isPopupTrigger()){
		    popup = new JPopupMenu();

		    popup.add(popupAnnuler);
		    popup.add(popupRetablir);
		    popup.addSeparator();
		    popup.add(popupCouper);
		    popup.add(popupCopier);
		    popup.add(popupColler);
		    popup.addSeparator();
		    popup.add(popupSuppr);
		    popup.add(popupSelectAll);
		    popup.add(popupChercher);
		    popup.addSeparator();
		    popup.add(popupQuitter);
		    
		    popupAnnuler.addActionListener(new ALParDefaut());
		    popupRetablir.addActionListener(new ALParDefaut());
		    popupCouper.addActionListener(new ALParDefaut());
		    popupCopier.addActionListener(new ALParDefaut());
		    popupColler.addActionListener(new ALParDefaut());
		    popupSuppr.addActionListener(new ALParDefaut());
		    popupSelectAll.addActionListener(new ALParDefaut());
		    popupChercher.addActionListener(new ALParDefaut());
		    popupQuitter.addActionListener(new ALQuitter());

		    //La méthode qui va afficher le menu
		    popup.show(container, event.getX(), event.getY());
		}
	    }
	});
	
	container.add(onglets);
	this.setContentPane(container);
	
	Menu menu = new Menu(this);
	this.setJMenuBar(menu);
	
	
	
	this.setVisible(true);

    }

    public JPanel getContainer() {
	return container;
    }

    public void setContainer(JPanel container) {
	this.container = container;
    }

    public JTabbedPane getOnglets() {
	return onglets;
    }

    public void setOnglets(JTabbedPane onglets) {
	this.onglets = onglets;
    }

    public JPopupMenu getPopup() {
	return popup;
    }

    public void setPopup(JPopupMenu popup) {
	this.popup = popup;
    }
}
