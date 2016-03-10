package figuras;

import draw.Dibujable;

public class Circulo extends FiguraGeometrica implements Dibujable{

	private double radio = 0d;
	// el valor de la propiedad PI no puede variar => final
	private final double PI = Math.PI;
	
	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Circulo(){
		super();
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	
	public void draw(){
		System.out.println("Esto es un círculo");
	}
	
	@Override
	public void applyTheme(){
		System.out.println("Se le aplica un tema muy bonito");
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}

	@Override
	public double area() {
		// math.pow(numero, potencia) = elevar un número a una potencia
		return PI * Math.pow(this.radio, 2);
	}
}
