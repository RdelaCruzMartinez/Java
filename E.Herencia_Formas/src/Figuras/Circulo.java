package Figuras;

public class Circulo extends Forma {
	Double radio = 0.0;
	
	public Circulo(Double radio){
		super(area);
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	};
	
@Override
public void calcularArea(){
	double area = 3.14 * this.getRadio() * this.getRadio();
	setAreaForma(area);
}

@Override
public double getArea(){
	return getAreaForma();
}

}
