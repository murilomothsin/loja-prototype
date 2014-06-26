
public class MotorolaPrototype extends CelularPrototype {
	protected MotorolaPrototype(MotorolaPrototype motorolaPrototype) {
        this.valor = motorolaPrototype.getValor();
    }
 
    public MotorolaPrototype() {
    	valor = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Código: "+ getCodigo() +
        		"\nMarca: Motorola \n" +
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
