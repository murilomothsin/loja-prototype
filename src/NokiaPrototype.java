
public class NokiaPrototype extends CelularPrototype {
	protected NokiaPrototype(NokiaPrototype nokiaPrototype) {
        this.valor = nokiaPrototype.getValor();
    }
 
    public NokiaPrototype() {
    	valor = 0.0;
    }
    
    public boolean equals(Object o){
    	if(o instanceof NokiaPrototype){
    		if(((NokiaPrototype) o).exibirInfo() == this.exibirInfo()){
    			return true;
    		}
    	}
    	return false;
    }
 
    @Override
    public String exibirInfo() {
        return "Marca: Nokia \n" +
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
