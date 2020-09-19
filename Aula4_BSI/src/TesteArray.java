import java.util.ArrayList;

public class TesteArray {
	
	// Atributo da classe é uma coleção de objetos Integer em uma ArrayList
	private ArrayList<Integer> vetor;
	
	// metodo construtor da classe TesteArray
	public TesteArray() {
		// criar instancia pra poder utiliza-lo
		this.vetor = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		
		TesteArray objTesteArray = new TesteArray();
		
		objTesteArray.vetor.add(new Integer(10));
		objTesteArray.vetor.add(new Integer(9));
		objTesteArray.vetor.add(new Integer(8));
		objTesteArray.vetor.add(new Integer(6));
		
		double somaValores = 0;
		
		// percorrendo/varrendo todos os elementos em ArrayList
		for (Integer i : objTesteArray.vetor) {
			somaValores += i;
		}
		
		double media = somaValores / objTesteArray.vetor.size();
		
		System.out.println("Acumulado = " + somaValores);
		System.out.println("No. Elementos = " + objTesteArray.vetor.size());
		System.out.println("Media = " + media);
		
	}

}
