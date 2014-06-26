import java.util.ArrayList;

public class Estoque {
	
	static final CelularPrototype MOTOROLA = new MotorolaPrototype();
	static final CelularPrototype NOKIA = new NokiaPrototype();
	
	private ArrayList<CelularPrototype> celulares = new ArrayList<CelularPrototype>();
	
	public void addItem (CelularPrototype marca, String modelo) {
		CelularPrototype novo = marca.clonar();
		novo.setModelo(modelo);
		if(!celulares.contains(novo)){
			celulares.add(novo);
			System.out.println("Item adicionado ao estoque!asd");
		}else
			System.out.println("Item ja existe no estoque!");
	}
	
	public void addItem (CelularPrototype marca, String modelo, double valor) {
		CelularPrototype novo = marca.clonar();
		novo.setModelo(modelo);
		novo.setValor(valor);
		if(!celulares.contains(novo)){
			celulares.add(novo);
			System.out.println("Item adicionado ao estoque!asd");
		}else
			System.out.println("Item ja existe no estoque!");
		
	}
	
	public int totalItens () {
		return celulares.size();
	}
	
	public int posicao (CelularPrototype celular) {
		return celulares.indexOf(celular);
	}
	
	public String pesquisar(String modelo) {
		for(CelularPrototype c : celulares) {
			if(c.getModelo() == modelo)
				return "Posição: " + celulares.indexOf(c) + "\n" + c.exibirInfo();
		}
		return "Modelo não encontrado";
	}
	
	public void imprimirEstoque () {
		for(CelularPrototype c : celulares) {  
			System.out.println(c.exibirInfo());  
		}
	}
	
	
}
