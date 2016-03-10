package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		//ordenAlumnos();
		//posicionAlumnos();
		//genteEnCola();
		//salirCola();
		//moverseCola();
		//colaInvertidaTest();
		//elimiarTest1();
		eliminarTest2();

	}
	
	public static void ordenAlumnos(){
		//Meter alumnos y ver la gente en cola sin borrarlos.
		ColaAlumnos cola = new ColaAlumnos();
		Alumno a = new Alumno("Manolo", "Perez");
		Alumno b = new Alumno("Frodo", "Bolson");
		Alumno c = new Alumno("Faustino", "IV");
		Alumno d = new Alumno("Adam", "Shepard");
		Alumno e = new Alumno("Arya", "Stark");
		
		cola.addAlumnos(a);
		cola.addAlumnos(b);
		cola.addAlumnos(c);
		cola.addAlumnos(d);
		cola.addAlumnos(e);
		
		cola.mostrarCola();
	}
	
	public static void posicionAlumnos(){
		//ver  la posicion de los alumnos en la cola.
		ColaAlumnos cola = new ColaAlumnos();
		Alumno a = new Alumno("Manolo", "Perez");
		Alumno b = new Alumno("Frodo", "Bolson");
		Alumno c = new Alumno("Faustino", "IV");
		Alumno d = new Alumno("Adam", "Shepard");
		Alumno e = new Alumno("Arya", "Stark");
		
		cola.addAlumnos(a);
		cola.addAlumnos(b);
		cola.addAlumnos(c);
		cola.addAlumnos(d);
		cola.addAlumnos(e);
		
		
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
	
	public static void genteEnCola(){
		//Mostrar gente en cola
		ColaAlumnos cola = new ColaAlumnos();
		Alumno a = new Alumno("Manolo", "Perez");
		Alumno b = new Alumno("Frodo", "Bolson");
		Alumno c = new Alumno("Faustino", "IV");
		Alumno d = new Alumno("Adam", "Shepard");
		Alumno e = new Alumno("Arya", "Stark");
		
		cola.addAlumnos(a);
		cola.addAlumnos(b);
		cola.addAlumnos(c);
		cola.addAlumnos(d);
		cola.addAlumnos(e);
		
		System.out.println(cola.sizeCola());
	}
	
	public static void salirCola(){
		//Eliminar gente de la cola y comprobar que las demas avanzan.
		ColaAlumnos cola = new ColaAlumnos();
		Alumno a = new Alumno("Manolo", "Perez");
		Alumno b = new Alumno("Frodo", "Bolson");
		Alumno c = new Alumno("Faustino", "IV");
		Alumno d = new Alumno("Adam", "Shepard");
		Alumno e = new Alumno("Arya", "Stark");
		
		cola.addAlumnos(a);
		cola.addAlumnos(b);
		cola.addAlumnos(c);
		cola.addAlumnos(d);
		cola.addAlumnos(e);
		
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
	
	public static void moverseCola(){
		//Mover personas entre posiciones.
		ColaAlumnos cola = new ColaAlumnos();
		Alumno a = new Alumno("Manolo", "Perez");
		Alumno b = new Alumno("Frodo", "Bolson");
		Alumno c = new Alumno("Faustino", "IV");
		Alumno d = new Alumno("Adam", "Shepard");
		Alumno e = new Alumno("Arya", "Stark");
		
		cola.addAlumnos(a);
		cola.addAlumnos(b);
		cola.addAlumnos(c);
		cola.addAlumnos(d);
		cola.addAlumnos(e);
		
		
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
	
		public static void colaInvertidaTest(){
			//Mostrar la cola empezando desde el final.
			ColaAlumnos cola = new ColaAlumnos();
			Alumno a = new Alumno("Manolo", "Perez");
			Alumno b = new Alumno("Frodo", "Bolson");
			Alumno c = new Alumno("Faustino", "IV");
			Alumno d = new Alumno("Adam", "Shepard");
			Alumno e = new Alumno("Arya", "Stark");
			
			cola.addAlumnos(a);
			cola.addAlumnos(b);
			cola.addAlumnos(c);
			cola.addAlumnos(d);
			cola.addAlumnos(e);
			
			cola.colaInvertida();
			
		}
		
		public static void elimiarTest1(){
	  //Quitar todos los elementos de la lista mostrandolo por pantalla, desde el inicio.
			ColaAlumnos cola = new ColaAlumnos();
			Alumno a = new Alumno("Manolo", "Perez");
			Alumno b = new Alumno("Frodo", "Bolson");
			Alumno c = new Alumno("Faustino", "IV");
			Alumno d = new Alumno("Adam", "Shepard");
			Alumno e = new Alumno("Arya", "Stark");
			
			cola.addAlumnos(a);
			cola.addAlumnos(b);
			cola.addAlumnos(c);
			cola.addAlumnos(d);
			cola.addAlumnos(e);
			
			System.out.println("Tamaño de la cola: " + cola.sizeCola());
			cola.eliminarInicio();
			System.out.println("-----------");
			System.out.println("Tamaño de la cola actual: " + cola.sizeColaClear());
		}
		
		public static void eliminarTest2(){
		//Quitar todos los elementos de la lista mostrandolo por pantalla, desde el final.
			ColaAlumnos cola = new ColaAlumnos();
			Alumno a = new Alumno("Manolo", "Perez");
			Alumno b = new Alumno("Frodo", "Bolson");
			Alumno c = new Alumno("Faustino", "IV");
			Alumno d = new Alumno("Adam", "Shepard");
			Alumno e = new Alumno("Arya", "Stark");
			
			cola.addAlumnos(a);
			cola.addAlumnos(b);
			cola.addAlumnos(c);
			cola.addAlumnos(d);
			cola.addAlumnos(e);
			
			System.out.println("Tamaño de la cola: " + cola.sizeCola());
			cola.eliminarFinal();
			System.out.println("-----------");
			System.out.println("Tamaño de la cola actual: " + cola.sizeColaClear());
			
		}
	
}
