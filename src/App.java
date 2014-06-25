
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		estoque.addItem(Estoque.MOTOROLA, "G", 799);
		estoque.addItem(Estoque.MOTOROLA, "G", 799);
		estoque.addItem(Estoque.MOTOROLA, "X", 1299.90);
		estoque.addItem(Estoque.MOTOROLA, "E", 524.80);
		
		estoque.addItem(Estoque.NOKIA, "ASHA-501", 324.90);
		estoque.addItem(Estoque.NOKIA, "5225");
		
		estoque.imprimirEstoque();

	}

}
