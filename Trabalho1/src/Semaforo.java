
public class Semaforo
{

	static int cor;		
		
	static void mudaProximaCor()
	{
		switch (cor) 
		{
			case 0:
				cor = 1;
				System.out.println("Pr�xima cor: Amarelo");
			case 1:
				cor = 2;
				System.out.println("Pr�xima cor: Vermelho");
			case 2:
				cor = 0;
				System.out.println("Pr�xima cor: Verde");
			default:
				cor = 0;
				System.out.println("Pr�xima cor: Verde");
		}
	}
		
	static void mudaCorFixa(int novaCor)
	{
		cor = novaCor;
	}
	
	static int mostraCor()
	{
		return cor;
	}

}
