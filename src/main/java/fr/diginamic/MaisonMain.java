package fr.diginamic;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.MaisonBuilder;

public class MaisonMain {

	public static void main(String[] args) {

		MaisonBuilder builder = new MaisonBuilder();
		builder.modifierStrategieControle(1);
		Maison m2 = builder.addCuisine(0, 12).addSalon(0, 25).addWC(0, 2).addSdb(0, 5).get();
	}
}
