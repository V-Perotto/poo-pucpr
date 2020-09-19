public class Controle 
{
	public static void main (String[] args)
	{
		
		System.out.println("Cor inicial: " + Semaforo.cor);
		
		for (int i = 0; i < 10; i++)
		{
			Semaforo.mudaProximaCor();
			System.out.println(Semaforo.cor);
			
			switch (Semaforo.cor) 
			{
				case 0:
					System.out.println("Cor verde");
					break;
				
				case 1:
					System.out.println("Cor amarelo");
					break;
			
				case 2:
					System.out.println("Cor vermelho");
					break;
			
				default:
					System.out.println("Não é um número válido.");
				
			}
		
			System.out.println("Fim do loop.");
			
			Semaforo.mudaCorFixa(Semaforo.cor);
			
			System.out.println("Cor fixa (amarela): " + Semaforo.cor);

		}
		
		int verde = 0, 
			amarelo = 1, 
			vermelho = 2;
		
		if (verde == 0 || amarelo == 1 || vermelho == 2) {
			
			Semaforo.mostraCor();
			
			System.out.println("Mostra a cor final: " + Semaforo.cor);
		
		}
		
		else {
			
			System.out.println("Cor inválida");
		}
			
	}
}
