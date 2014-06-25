
public class MotorolaPrototype extends CelularPrototype {
	protected MotorolaPrototype(MotorolaPrototype motorolaPrototype) {
        this.valor = motorolaPrototype.getValor();
    }
 
    public MotorolaPrototype() {
    	valor = 0.0;
    }
    
    public boolean equals(Object o){
    	if(o instanceof MotorolaPrototype){
    		if(((MotorolaPrototype) o).exibirInfo() == this.exibirInfo()){
    			return true;
    		}
    	}
    	return false;
    }
 
    @Override
    public String exibirInfo() {
        return "Marca: Motorola \n" +
        		"Modelo: " +
        		getModelo() +
        		"\nValor: R$" +
                getValor();
    }
 
    @Override
    public CelularPrototype clonar() {
        return new MotorolaPrototype(this);
    }
}