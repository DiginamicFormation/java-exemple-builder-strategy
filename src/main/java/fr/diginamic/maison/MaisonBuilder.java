package fr.diginamic.maison;

import fr.diginamic.pieces.Cuisine;
import fr.diginamic.pieces.SalleDeBain;
import fr.diginamic.pieces.Salon;
import fr.diginamic.pieces.WC;

public class MaisonBuilder {

	private StrategieControle strategie = StrategieControleFactory.getInstance(0);
	
	private Maison maison = new Maison();
	
	public MaisonBuilder() {
		
	}

	public MaisonBuilder addCuisine(int etage, int superficie) {
		maison.ajouterPiece(new Cuisine(etage, superficie));
		return this; // Fluent pattern
	}
	
	public MaisonBuilder addSalon(int etage, int superficie) {
		maison.ajouterPiece(new Salon(etage, superficie));
		return this;
	}
	
	public MaisonBuilder addWC(int etage, int superficie) {
		maison.ajouterPiece(new WC(etage, superficie));
		return this;
	}
	
	public MaisonBuilder addSdb(int etage, int superficie) {
		maison.ajouterPiece(new SalleDeBain(etage, superficie));
		return this;
	}
	
	public void modifierStrategieControle(int type) {
		strategie = StrategieControleFactory.getInstance(type);
	}
	
	public Maison get() {
		strategie.controler(maison);
		return maison;
	}
}
