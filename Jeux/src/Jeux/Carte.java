package Jeux;

import java.util.*;

public class Carte {
	
	// Attributs
	
	private int nbL;
	private int nbC;
	private char [][] carte;
	
	//Constructeur
	
	public Carte(int l, int c) {
		
		nbL = l;
		nbC = c;
		carte = new char[nbL][nbC]; 
		
		for(int i=0; i<nbL; i++) {
			for(int j=0; j<nbC; j++) {
				
				carte[i][j] ='-';
				
			}
		}
	}
	
	// Getters
	
	public char getCase(int l, int c) {
		return carte[l-1][c-1];
	}
	
	//Methodes
	
	public void afficher() {
		System.out.println();
		for(int i=0; i<nbL; i++) {
			for(int j=0; j<nbC; j++) {
				
				System.out.print("|__" + carte[i][j]+ "__");
				
			}
			
			System.out.println("|");
		}
		
		System.out.println();
	}
	
	public void placer(int l, int c, char t ) {
		
		l = l-1;
		c = c-1;
		
		if (l<0 || c<0 || l>nbL || c>nbC) {
			
			System.out.print("Error !");
			return;
		}
		
		if(carte[l][c] == '-') {
			carte[l][c] = t;
		}
		else {
			System.out.print("Error, cette n'est pas vide !") ;
		}
		
	}
	
public void deplacer () {
	
	char tmp;
	for(int i=0; i<nbL; i++) {
		for(int j=0; j<nbC; j++) {
			
			if(carte[i][j] == 'J') {
				if(i-1 >= 0 ) {
					tmp = carte[i][j]; //On copie le joueur
					carte[i-1][j] = tmp; //On déplace le joueur
					
				}
			}
			
		}
		
		
	}
		
	}


	
	

}
