package Figuras;

public class Elipse extends Forma {
	double radioLargo = 0.0;
	double radioCorto = 0.0;
	
	public Elipse(double radioLargo, double radioCorto){
		super(area);
		this.radioLargo = radioLargo;
		this.radioCorto = radioCorto;
	}

	public double getRadioLargo() {
		return radioLargo;
	}

	public void setRadioLargo(double radioLargo) {
		this.radioLargo = radioLargo;
	}

	public double getRadioCorto() {
		return radioCorto;
	}

	public void setRadioCorto(double radioCorto) {
		this.radioCorto = radioCorto;
	}

	@Override
	public void calcularArea(){
		double area = this.getRadioLargo() * this.getRadioCorto() * 3.14;
		setAreaForma(area);
	}
	@Override
	public double getArea(){
		return getAreaForma();
	}
}
