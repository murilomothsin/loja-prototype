import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Estoque estoque = new Estoque();
		
		int opcao = 0;
		
		do{
			System.out.println("Escolha uma opção: ");
			System.out.println("(1) - Adicionar Item");
			System.out.println("(2) - Pesquisar Item");
			System.out.println("(3) - Imprimir Estoque");
			System.out.println("(0) - Sair");
			opcao = entrada.nextInt();
			
			if(opcao == 1){
				System.out.println("Qual a marca?");
				System.out.println("(1) - Motorola");
				System.out.println("(2) - Nokia");
				int marca = entrada.nextInt();
				CelularPrototype m = null;
				if(marca == 1)
					m = Estoque.MOTOROLA;
				else
					m = Estoque.NOKIA;
				System.out.println("Qual o modelo?");
				String modelo = entrada.nextLine();
				System.out.println("Qual o valor?");
				double valor= entrada.nextDouble();
				
				estoque.addItem(m, modelo, valor);
			}
			
			if(opcao == 2) {
				System.out.println("Qual o modelo?");
				String modelo = entrada.nextLine();
				System.out.println(estoque.pesquisar(modelo));
			}
		}while(opcao != 0 );
		
		estoque.addItem(Estoque.MOTOROLA, "G", 799);
		estoque.addItem(Estoque.MOTOROLA, "G", 799);
		estoque.addItem(Estoque.MOTOROLA, "X", 1299.90);
		estoque.addItem(Estoque.MOTOROLA, "E", 524.80);
		
		estoque.addItem(Estoque.NOKIA, "ASHA-501", 324.90);
		estoque.addItem(Estoque.NOKIA, "5225");
		
		estoque.imprimirEstoque();

	}

}
