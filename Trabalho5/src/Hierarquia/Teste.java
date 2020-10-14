package Hierarquia;

public class Teste {
	
	public static void main(String[] args) {
		
		Jogador jog = new Jogador("Sam", 0);
		Principiante pri = new Principiante("Frodo", 7, 0.7);
		Profissional pro = new Profissional("Aragorn", 7, 28.0);
		Senior sen = new Senior("Gandalf", 7, 28.0, 2.0);
		
		System.out.println("------- JOGADOR -------");
		jog.imprimir();
		System.out.println("-----------------------\n");
		
		System.out.println("---- PARTICIPANTE ----");
		pri.ganhar(10);
		pri.perder(3);
		pri.imprimir();
		System.out.println("----------------------\n");
	
		System.out.println("---- PROFISSIONAL ----");
		pro.ganhar(10);
		pro.perder(3);
		pro.imprimir();
		System.out.println("----------------------\n");
		
		System.out.println("---- SENIOR ----");
		sen.ganhar(10);
		sen.perder(3);
		sen.imprimir();
		System.out.println("----------------------\n");
	}

}
