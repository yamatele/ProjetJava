package Jeux;

import Classes.NonNeighbouringAttackedTerritoryException;
import Classes.NonOwnerAttackingTerritoryException;
import Classes.OneDiceAttackingTerritoryException;
import Classes.OwnerAttackedTerritoryException;
import Classes.Territoire;

// Repr�sente un joueur d�une partie d�fini par un attribut JoueurID (

public class Joueur {
	
	//Attributes
	 private final int JoueurID;
	
	// Contractors
	
	public Joueur() {
		JoueurID = 1;
	}
	
	public Joueur( int id) {
		JoueurID = id; // Renvoie l'id
	}
	
	// Getters
	
	public int getJoueurID() {
		return JoueurID;
	}
	
	// Setters
	
	public void setJoueurID(int id) {
		JoueurID = id; // Definie l'id
	}
	
	// Methods
	
	public void attaquer(int IDTerritoireAttaquant, int IDterritoireDefenseur) throws NonProprioTerritAttaquantException,PasvoisinException, OneDiceAttackingTerritoryException, OwnerAttackedTerritoryException{
		Territoire territoireAttaquant = this.territoiresConquis.get(IDTerritoireAttaquant);
		int[] IDTerritoiresVoisins = territoireAttaquant.getIDTerritoiresVoisins();
		
	}
	
	public void terminerTour( String Break) {
		
		 
	}
	
	public String toString() {
		
		return "L'id du joueur = "+JoueurID;
	}
}
