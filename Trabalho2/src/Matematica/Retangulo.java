package Matematica;

public class Retangulo {
	private static float ladoH, ladoV;
	
	public static void definirLados (float ladoh, float ladov) {
		ladoH = ladoh;
		ladoV = ladov;
	}
	
	public static float area() {
		return ladoH * ladoV;
	}
	
	public static float perimetro() {
		return (2 * ladoH) + (2 * ladoV);
	}
	
	public static float getLadoH() {
		return ladoH;
	}

	public static float getLadoV() {
		return ladoV;
	}
}
