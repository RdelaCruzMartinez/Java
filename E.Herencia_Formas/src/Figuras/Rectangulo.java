package Figuras;

public class Rectangulo extends Forma {
	double ladoA = 0.0;
	double ladoB = 0.0;
			
	public Rectangulo(Double ladoA, Double ladoB){
		super(area);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	@Override
	public void calcularArea(){
		double area = this.getLadoA()* this.getLadoB();
		setAreaForma(area);
	}
	@Override
	public double getArea(){
		return getAreaForma();
	}
	

}
