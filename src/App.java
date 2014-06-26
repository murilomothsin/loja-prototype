import java.util.Scanner;

public class App {

	private static Scanner entrada;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		Estoque estoque = new Estoque();
		
		int opcao = 0;
		
		do{
			System.out.println();
			System.out.println("Controle de estoque de loja de celular do Murilo - v1.0");
			System.out.println("Itens cadastrados: " + estoque.totalItens());
			System.out.println();
			System.out.println("Escolha uma op��o: ");
			System.out.println("(1) - Adicionar Item");
			System.out.println("(2) - Pesquisar Item");
			System.out.println("(3) - Imprimir Estoque");
			System.out.println("(4) - Excluir Item");
			System.out.println("(0) - Sair");
			opcao = entrada.nextInt();
			entrada.nextLine();
			System.out.println();
			if(opcao == 1){
				System.out.println("Qual a marca?");
				System.out.println("(1) - Motorola");
				System.out.println("(2) - Nokia");
				int marca = entrada.nextInt();
				entrada.nextLine();
				
				CelularPrototype m = null;
				if(marca == 1)
					m = Estoque.MOTOROLA;
				else
					m = Estoque.NOKIA;
				
				System.out.println("Qual o modelo?");
				String modelo = entrada.nextLine();

				System.out.println("Qual o valor?");
				double valor= entrada.nextDouble();
				entrada.nextLine();
				
				estoque.addItem(m, modelo, valor);
			}
			
			if(opcao == 2) {
				System.out.println("Qual o modelo?");
				String modelo = entrada.nextLine();
				System.out.println(estoque.pesquisar(modelo));
			}
			
			if(opcao == 3){
				estoque.imprimirEstoque();
			}
			if(opcao == 4){
				System.out.println("Qual o c�digo do Item?");
				int codigo = entrada.nextInt();
				entrada.nextLine();
				estoque.removeItem(codigo);
			}
		}while(opcao != 0 );
		System.out.println("\nAdeus!");
	}

}
