package Ejercicio3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ColaAlumnosTest {

	private static ColaAlumnos cola;
	private static  Alumno a;
	private  Alumno b;
	private  Alumno c;
	private  Alumno d;
	private  Alumno e;

	@Before
	public void setUp() throws Exception {
		cola = new ColaAlumnos();
		a = new Alumno("Manolo", "Perez");
		b = new Alumno("Frodo", "Bolson");
		c = new Alumno("Faustino", "IV");
		d = new Alumno("Adam", "Shepard");
		e = new Alumno("Arya", "Stark");
		
		cola.addAlumnos(a);
		cola.addAlumnos(b);
		cola.addAlumnos(c);
		cola.addAlumnos(d);
		cola.addAlumnos(e);
	}

	@Test
	public void ordenAlumnos(){
		//Meter alumnos y ver la gente en cola sin borrarlos.	
		cola.mostrarCola();
	}
	
	@Test
	public void posicionAlumnos(){
		//ver  la posicion de los alumnos en la cola.
		System.out.println("Alumno");
		a.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(a));
		System.out.println("Alumno");
		b.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(b));
		System.out.println("Alumno");
		c.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(c));
		System.out.println("Alumno");
		d.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(d));
		System.out.println("Alumno");
		e.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(e));
	}
	
	@Test
	public void genteEnCola(){
		//Mostrar gente en cola
		System.out.println(cola.sizeCola());
	}
	
	@Test
	public void salirCola(){
		//Eliminar gente de la cola y comprobar que las demas avanzan.
		System.out.println("Alumno");
		d.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(d));
		System.out.println("Alumnos en cola: " + cola.sizeCola());
		System.out.println("Alumno");
		c.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(c));
		System.out.println("Alumno");
		c.getAlumno();
		System.out.println("Sale de la Cola");
		cola.salirCola(c);
		System.out.println("-----------------");
		System.out.println("Alumnos en cola: " + cola.sizeCola());
		System.out.println("El alumno");
		d.getAlumno();
		System.out.println("Esta ahora la posicion: " + cola.posicionCola(d));
	}
	
	@Test
	public void moverseCola(){
		//Mover personas entre posiciones.		
		System.out.println("Alumno");
		a.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(a));
		System.out.println("Alumno");
		b.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(b));
		cola.moverCola(b, 1);
		System.out.println("------------------");
		System.out.println("Alumno");
		b.getAlumno();
		System.out.println("Ahora esta en la posicion: " + cola.posicionCola(b));
		System.out.println("Y alumno");
		a.getAlumno();
		System.out.println("Esta en la posicion: " + cola.posicionCola(a));
	}
		
		@Test
		public  void colaInvertidaTest(){
			//Mostrar la cola empezando desde el final.
			cola.colaInvertida();
		}
		
		@Test
		public void elimiarTest1(){
	  //Quitar todos los elementos de la lista mostrandolo por pantalla, desde el inicio.
			System.out.println("Tamaño de la cola: " + cola.sizeCola());
			cola.eliminarInicio();
			System.out.println("-----------");
			System.out.println("Tamaño de la cola actual: " + cola.sizeColaClear());
		}
		
		@Test
		public void eliminarTest2(){
		//Quitar todos los elementos de la lista mostrandolo por pantalla, desde el final.
			System.out.println("Tamaño de la cola: " + cola.sizeCola());
			cola.eliminarFinal();
			System.out.println("-----------");
			System.out.println("Tamaño de la cola actual: " + cola.sizeColaClear());
		}
	
}
