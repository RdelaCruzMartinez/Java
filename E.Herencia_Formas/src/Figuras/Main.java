package Figuras;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCirculo();
		//testRectangulo();
		//testCuadrado();
		//testElipse();
		areasFormasGeometricas();
	}

	public static void testCirculo(){
		Circulo circulazo = new Circulo(2.0);
		circulazo.calcularArea();
		System.out.println(circulazo.getArea());
	}
	public static void testRectangulo(){
		Rectangulo rectangulito = new Rectangulo(2.0,4.0);
		rectangulito.calcularArea();
		System.out.println(rectangulito.getArea());
	}
	public static void testCuadrado(){
		Cuadrado cuadradito = new Cuadrado(2.0);
		cuadradito.calcularArea();
		System.out.println(cuadradito.getArea());
	}
	public static void testElipse(){
		Elipse elipsita = new Elipse(2.0,4.0);
		elipsita.calcularArea();
		System.out.println(elipsita.getArea());
	}
	public static void areasFormasGeometricas(){
		Circulo circulazo			= new Circulo(2.0);
		Rectangulo rectangulito		= new Rectangulo(2.0,3.0);
		Cuadrado cuadradito			= new Cuadrado(2.0);
		Elipse elipsita				= new Elipse(2.0,4.0);
		ArrayList<Forma> listaFormas= new ArrayList<Forma>();
		listaFormas.add(circulazo);
		listaFormas.add(rectangulito);
		listaFormas.add(cuadradito);
		listaFormas.add(elipsita);
		for (Forma figura : listaFormas){
			figura.calcularArea();
			System.out.println(figura.getArea());
		}
	}
}
