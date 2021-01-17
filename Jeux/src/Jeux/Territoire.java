package Jeux;

public class Territoire {
	
	//Attributes
		private int TerritoireID;
		private int Force;
		
		
		// Contractors
		
		public Territoire() {
			TerritoireID = 1;
			Force = 7  ;
		}
		
		public Territoire( int id, int f) {
			TerritoireID = id; // Renvoie l'id
			Force = f;
		}
		
		// Getters
		
		public int getTerritoireID() {
			return TerritoireID;
		}
		
		public int getForce() {
			return Force;
		}
		
		// Setters
		
		public void setTerritoireID(int id) {
			TerritoireID = id; // Definie l'id
		}
		
		public void setForce(int f) {
			Force = f; // Definie l'id
		}
		
}
