package Mercado;

public class Carrinho {
    
	private static int maximo = 10;
    private static int quantidade = 0;
    private static int inseridos = 0;
    private static int removidos = 0;
    private static double preco_unitario = 10.00;
    
    public static void inserir()
    {
        assert (quantidade < maximo); //PRE-CONDICAO
        quantidade++;
        inseridos++;
        assert (quantidade == inseridos - removidos); // INVARIANTE
    }
    
    public static void remover()
    {
        assert(quantidade > 0); // PRE-CONDICAO
        quantidade--;
        removidos++;
        assert (quantidade == inseridos - removidos); // INVARIANTE
    }

    public static int quantidade()
    {
        return quantidade;
    }
    
    public static double totalizar(double preco_maximo)
    {
        double preco_total = preco_unitario * quantidade;
        assert (preco_total <= preco_maximo); // POS-CONDICAO
        return preco_total;
    }

}