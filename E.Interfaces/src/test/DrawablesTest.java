package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import figuras.*;

import org.junit.Test;

import draw.Dibujable;
import draw.Drawables;

public class DrawablesTest {

	@Test
	public void testDibujarFigura() {
		ArrayList<Dibujable> figuras = new ArrayList<>();
		
		Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 4, 5);
		Circulo circuloConstructorLocal = new Circulo("círculo", 5);
		Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 2);
		Elipse elipseConstructorLocal = new Elipse("elipse", 3, 4);
		
		figuras.add(rectanguloConstructorLocal);
		figuras.add(circuloConstructorLocal);
		figuras.add(cuadradoConstructorLocal);
		figuras.add(elipseConstructorLocal);
		int tamano = figuras.size();
		int solucion = 4;
		Drawables.dibujarFigura(figuras);
		
		
	}
	
	@Test
	public void testAplicarTema() {
		ArrayList<Dibujable> figuras = new ArrayList<>();
		
		Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 4, 5);
		Circulo circuloConstructorLocal = new Circulo("círculo", 5);
		Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 2);
		Elipse elipseConstructorLocal = new Elipse("elipse", 3, 4);
		
		figuras.add(rectanguloConstructorLocal);
		figuras.add(circuloConstructorLocal);
		figuras.add(cuadradoConstructorLocal);
		figuras.add(elipseConstructorLocal);
		int tamano = figuras.size();
		int solucion = 4;
		Drawables.aplicarTema(figuras);
		
		
	}

}
