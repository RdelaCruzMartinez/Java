package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import draw.Dibujable;
import draw.Drawables;
import figuras.*;

public class DrawablesTest2 {

	private ArrayList<Dibujable> figuras;
	private Rectangulo rectanguloConstructorLocal;
	private Circulo circuloConstructorLocal;
	private Cuadrado cuadradoConstructorLocal;
	private Elipse elipseConstructorLocal;


	@Before
	public void preparativos(){
		figuras = new ArrayList<>();
		
		rectanguloConstructorLocal = new Rectangulo("rectángulo", 4, 5);
		circuloConstructorLocal = new Circulo("círculo", 5);
		cuadradoConstructorLocal = new Cuadrado("cuadrado", 2);
		elipseConstructorLocal = new Elipse("elipse", 3, 4);
		
		figuras.add(rectanguloConstructorLocal);
		figuras.add(circuloConstructorLocal);
		figuras.add(cuadradoConstructorLocal);
		figuras.add(elipseConstructorLocal);
	}
	
	
	@Test
	public void testDibujarFigura() {
		Drawables.dibujarFigura(figuras);;
	}

	@Test
	public void testAplicarTema() {
		Drawables.aplicarTema(figuras);
	}

}
