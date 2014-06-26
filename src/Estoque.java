import java.util.ArrayList;

public class Estoque {
	
	static final CelularPrototype MOTOROLA = new MotorolaPrototype();
	static final CelularPrototype NOKIA = new NokiaPrototype();
	
	private int index = 1;
	
	private ArrayList<CelularPrototype> celulares = new ArrayList<CelularPrototype>();
	
	private void addItemList (CelularPrototype c) {
		c.setCodigo(index);
		if(!celulares.contains(c)){
			celulares.add(c);
			System.out.println();
			System.out.println("Item adicionado ao estoque!");
			System.out.println(c.exibirInfo());
			index++;
		}else{
			System.out.println("Item já existe no estoque!");
			System.out.println(c.exibirInfo());
		}
	}
	
	public void addItem (CelularPrototype marca, String modelo) {
		CelularPrototype novo = marca.clonar();
		novo.setModelo(modelo);
		addItemList(novo);
	}
	
	public void addItem (CelularPrototype marca, String modelo, double valor) {
		CelularPrototype novo = marca.clonar();
		novo.setModelo(modelo);
		novo.setValor(valor);
		addItemList(novo);
	}
	
	public void removeItem (int n) {
		CelularPrototype excluido = null;
		for(CelularPrototype c : celulares) {
			if(c.getCodigo() == n)
				excluido = celulares.remove(celulares.indexOf(c));
		}
		if(excluido != null){
			System.out.println("Item removido com sucesso!");
			System.out.println(excluido.exibirInfo());
		}else
			System.out.println("Item não encontrado no estoque");
	}
	
	public int totalItens () {
		return celulares.size();
	}
	
	public String pesquisar(String modelo) {
		for(CelularPrototype c : celulares) {
			if(c.getModelo().equalsIgnoreCase(modelo))
				return c.exibirInfo();
		}
		return "Modelo não encontrado";
	}
	
	public void imprimirEstoque () {
		for(CelularPrototype c : celulares) {
			System.out.println(c.exibirInfo());  
		}
	}
	
	
}
