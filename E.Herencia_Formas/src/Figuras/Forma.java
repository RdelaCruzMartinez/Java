package Figuras;

public abstract class Forma {
	static Double area;
	public Forma (Double area){
		Forma.area =area;
	}
	public static Double getAreaForma(){
		return area;
	}

	public static void setAreaForma(Double area){
		Forma.area = area;
	}
	public void calcularArea(){
		
	}
	public double getArea(){
		return 0;
	}
}
