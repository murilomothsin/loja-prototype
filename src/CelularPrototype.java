
public abstract class CelularPrototype {
	protected double valor;
	protected String modelo;
	 
    public abstract String exibirInfo();
 
    public abstract CelularPrototype clonar();
    
    public int hashCode() { 
    	return exibirInfo().hashCode();
    }
 
    public double getValor() {
        return valor;
    }
    
    public String getModelo() {
    	return modelo;
    }
    
    public void setModelo(String modelo) {
    	this.modelo = modelo;
    }
 
    public void setValor(double valor) {
        this.valor = valor;
    }
}
