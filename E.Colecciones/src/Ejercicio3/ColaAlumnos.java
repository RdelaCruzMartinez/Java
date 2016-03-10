package Ejercicio3;

import java.util.LinkedList;

public class ColaAlumnos {
	LinkedList<Alumno> cola;
	
	public ColaAlumnos(){
		LinkedList<Alumno> cola = new LinkedList<Alumno>();
		this.cola = cola;
		eliminarCero();
	}
	
	void eliminarCero(){
		Alumno posicion0 = new Alumno("Zero", "Position");
		cola.add(posicion0);
	}
	
	public void addAlumnos(Alumno alumno){
		cola.add(alumno);
	}
	
	public Integer posicionCola(Alumno alumno){
		return cola.indexOf(alumno);
	}
	
	public void mostrarCola(){
		int total = cola.size();
		for (int i = 1; i < total; i++){
			Alumno x = cola.get(i);
			x.getAlumno();
			System.out.println("--------");
		}
	}
	
	public int sizeCola(){
		//teniendo en cuenta la eliminacion de la posicion cero
		return cola.size() - 1;
	}
	
	public int sizeColaClear(){
		//sin eliminar la posicion cero
		return cola.size();
	}
	
	public void salirCola(Alumno alumno){
		int posicion = this.posicionCola(alumno);
		cola.remove(posicion);
	}
	
	public void moverCola(Alumno alumno, int posicion){
		cola.add(posicion, alumno);
	}
	
	public void colaInvertida(){
		int total = cola.size();
		
		while (total != 1){
			Alumno x = cola.get(total  -1);
			x.getAlumno();
			System.out.println("--------");
			total--;
		}
	}
	
	public void eliminarInicio(){
		int total = cola.size()-1;
		cola.remove(0);
		
		for (int i = 0; i < total; i++){
			Alumno x = cola.pollFirst();
			x.getAlumno();
			System.out.println("Eliminado de la cola...");
		}
		
	}
	
	public void eliminarFinal(){
		int total = cola.size()-1;
		cola.remove(0);
		
		for (int i = 0; i < total; i++){
			Alumno x = cola.pollLast();
			x.getAlumno();
			System.out.println("Eliminado de la cola...");
		}
		
	}

}
