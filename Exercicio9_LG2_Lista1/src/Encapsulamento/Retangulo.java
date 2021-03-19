package Encapsulamento;

public class Retangulo {

	private Double base;
	private Double altura;
	
	public Retangulo() {}
	
	public Double getBase() {
		return this.base;
    }
	
    public void setBase(Double base) {
        if(base > 0) {
        	this.base = base;
        }
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setAltura(Double altura) {
        if(altura > 0) {
            this.altura = altura;
        }
    }

    public Double calcularArea () {
    	
        Double area = this.base * this.altura;
        return area;
    }

    public Double calcularPerimetro () {

        Double perimetro = (2 * this.base) + (2 * this.altura);
        return perimetro;
    }
}