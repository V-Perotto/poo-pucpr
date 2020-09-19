package Matematica;

public class Circulo {
	
	// Atributo estatico
	private	static double PI = 3.141516;
	private static double raio;
	
	// Metodos
	public static double area(double r) {
		return PI * r * r;
	}
	
	public static double perimetro(double r) {
		return 2 * PI * r;
	}
	
	public static void defina_raio(double r) {
		raio = r;
	}
	
	public static double area() {
		return PI * raio * raio;
	}
	
	public static double perimetro() {
		return 2 * PI * raio;
	}
}
