package Figuras;

public class Cuadrado extends Forma {
	double lado = 0.0;
	
	public Cuadrado(double lado){
		super(area);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea(){
		double area = this.getLado() * this.getLado();
		setAreaForma(area);
	}
	@Override
	public double getArea(){
		return getAreaForma();
	}
}
