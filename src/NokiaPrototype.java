
public class NokiaPrototype extends CelularPrototype {
	protected NokiaPrototype(NokiaPrototype nokiaPrototype) {
        this.valor = nokiaPrototype.getValor();
    }
 
    public NokiaPrototype() {
    	valor = 0.0;
    }
    
    public boolean equals(CelularPrototype o){
    	if(o instanceof NokiaPrototype){
    		if(((MotorolaPrototype) o).getModelo().equalsIgnoreCase(this.getModelo()) && ((MotorolaPrototype) o).getValor() == this.getValor()){
    			return true;
    		}
    	}
    	return false;
    }
 
    @Override
    public String exibirInfo() {
        return "Código: "+ getCodigo() +
        		"\nMarca: Nokia \n" +
        		"Modelo: " +
        		getModelo() +
        		"\nValor: R$" +
                getValor();
    }
 
    @Override
    public CelularPrototype clonar() {
        return new NokiaPrototype(this);
    }
}
