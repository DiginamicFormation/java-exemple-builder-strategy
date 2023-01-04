package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.pieces.Piece;

/** Représente une maison avec toutes ses pièces
 * @author DIGINAMIC
 *
 */
public class Maison {
	
	/** pieces : tableau de pièces de la maison */
	private List<Piece> pieces = new ArrayList<>();
	
	/**
	 * Constructeur
	 */
	public Maison(){
	}

	/** Ajoute une pièce à la maison
	 * @param nvPiece nouvelle pièce à ajouter
	 */
	void ajouterPiece(Piece nvPiece) {
		
		if (nvPiece!=null) {
			pieces.add(nvPiece);
		}
	}

	/** Retourne la superficie d'un étage
	 * @param choixEtage choix de l'étage
	 * @return double
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.size(); i++) {
			if (choixEtage == pieces.get(i).getNumEtage()) {
				superficieEtage = superficieEtage + pieces.get(i).getSuperficie();
			}
		}

		return superficieEtage;
	}
	
	/** Retourne la superficie total pour un type de pièce donné
	 * @param typePiece type de pièce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;

		for (int i = 0; i < pieces.size(); i++) {
			if (typePiece!=null && typePiece.equals(pieces.get(i).getType())) {
				superficie = superficie + pieces.get(i).getSuperficie();
			}
		}

		return superficie;
	}

	/** Retourne la surface totale
	 * @return double
	 */
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieces.size(); i++) {
			superficieTot = superficieTot + pieces.get(i).getSuperficie();
		}

		return superficieTot;
	}

	/** Getter
	 * @return the pieces
	 */
	public List<Piece> getPieces() {
		return pieces;
	}
}
