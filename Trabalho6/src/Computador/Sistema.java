package Computador;

public class Sistema {

	public static void main(String[] args) {
		
		Disco d = new Disco('C');
		
		Pasta escola = d.criarPasta("Escola");
		Pasta pessoal = d.criarPasta("Pessoal");
		Compactado compact = d.criarCompactada("compact", 23, 234);
		
		// escola
		Texto t = new Texto("Trabalho 10", 8, 4); // nome, primeiro bloco, numero de blocos
		escola.inserir(t);
		Apresentacao a = new Apresentacao("Defesa Projeto 2", 27, 3); // nome, bloco, numero de blocos
		escola.inserir(a);
		Planilha p = new Planilha("Calculo 2", 40, 6); // nome, bloco, numero de blocos
		escola.inserir(p);
		
		//escola list
		escola.listar();
		
		// pessoal
		Video v = new Video("Aniversario", 33, 5);
		pessoal.inserir(v);
		Imagem i = new Imagem("Foto RJ", 70, 2);
		pessoal.inserir(i);
		Som s = new Som("Musica Chico", 58, 7);
		pessoal.inserir(s);
		
		// pessoal list
		pessoal.listar();
		
		// compact
		Imagem img = new Imagem("Compact", 23, 34);
		compact.compactarArquivo(img);
		
		// compact list
		compact.listar(d);
		Compactado k = pessoal.compactar();
		
		System.out.println("\n*********** Disco ANTES de REMOVER pasta [pessoal] ***********");
		d.listarPasta(); // listar as pastas Escola e Pessoal e o arquivo compactado
		d.listarCompactado();
		d.removerPasta("Pessoal");
		
		System.out.println("\n*********** Disco DEPOIS de REMOVER pasta [pessoal] ***********");
		d.listarPasta(); // listar as pastas Escola e Pessoal e o arquivo compactado
		d.listarCompactado();
		
		k.abrir(d); // a pasta Pessoal deve ser recriada no disco
		System.out.println("\n*********** Disco DEPOIS de DESCOMPACTAR pasta [pessoal] ***********");
		d.listarPasta();
		d.listarCompactado();
		
		System.out.println("\n*********** Pasta [escola] abrindo todos os arquivos ***********");
		escola.abrirTodosArquivos();
		
		System.out.println("\n*********** Pasta [pessoal] abrindo todos os arquivos ***********");
		pessoal.abrirTodosArquivos();
		
		escola.remover("Trabalho 10");
		escola.duplicar("Defesa Projeto 2");
		
		System.out.println("\n*********** Pasta [escola] DEPOIS de ***********");
		System.out.println("\t> REMOVER arquivo [Trabalho 10]");
		System.out.println("\t> DUPLICAR arquivo [Defesa Projeto 2]");
		escola.listar();
	}

}
