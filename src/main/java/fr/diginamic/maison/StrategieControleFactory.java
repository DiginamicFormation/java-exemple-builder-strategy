package fr.diginamic.maison;

public class StrategieControleFactory {

	public static StrategieControle getInstance(int type) {
		if (type==0) {
			return new StrategieDefaut();
		}
		else if (type==1) {
			return new StrategieControleComplet();
		}
		return null;
	}
}
