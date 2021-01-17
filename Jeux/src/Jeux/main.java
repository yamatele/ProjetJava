package Jeux;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Début de la partie...");
		System.out.println("Creation du joueur...");
		Joueur j1 = new Joueur();
		System.out.println("Affichage du Joueur...");
		
		/*System.out.println("Veillez entrez un id :");
		Scanner sc1 = new Scanner(System.in);
		int id = sc1.nextInt();
		System.out.println("Votre id est :" + id);*/
		
		//On crée la carte
		Carte c1 = new Carte(10, 10);
		
		//On place le joueur
		c1.placer(3, 5, 'J');
		
		//Affiche la carte
		c1.afficher();
		
		//Test carte
		System.out.println("Nous avons "+c1.getCase(3, 5)+" à cette position");
	

	}

}
