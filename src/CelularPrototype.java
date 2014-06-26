
public abstract class CelularPrototype {
	protected double valor;
	protected String modelo;
	protected int codigo;
	 
    public abstract String exibirInfo();
 
    public abstract CelularPrototype clonar();
    
    public int hashCode() { 
    	return (getModelo()+getValor()).hashCode();
    }
    
    public boolean equals(CelularPrototype o){
    	if(o.getClass() == this.getClass()){
    		if(((CelularPrototype) o).getModelo().equalsIgnoreCase(this.getModelo()) && ((CelularPrototype) o).getValor() == this.getValor()){
    			return true;
    		}
    	}
    	return false;
    }
 
    public double getValor() {
        return valor;
    }
    
    public int getCodigo() {
    	return codigo;
    }
    
    public void setCodigo( int c ) {
    	this.codigo = c;
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
