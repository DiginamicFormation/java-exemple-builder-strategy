package fr.diginamic.maison;

import fr.diginamic.pieces.Piece;

public class StrategieControleComplet implements StrategieControle {

	@Override
	public void controler(Maison maison) {
		boolean trouve = false;
		for (Piece p: maison.getPieces()) {
			if (p.getType().equals(Piece.TYPE_CHAMBRE)) {
				trouve = true;
			}
		}
		
		if (!trouve) {
			// Une RuntimeException est non contrôlée : normalement réservée aux exceptions graves (techniques).
			throw new RuntimeException("Votre maison est mal construite. Elle n'a pas de chambre");
		}
	}

}
