package Colecciones;

import java.util.Scanner;
import java.util.TreeSet;

/*
Dado  el String String = "dabale arroz a la zorra el abad" muestra en pantalla
los caracteres por los que está  formado, eliminando de la salida los caracteres
repetidos. ¿Cuál de las clases ArrayList, Pila, Cola o Conjunto has de utilizar?
Ojo al tipo de los objetos de la colección que definas.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un String: ");
		String respuesta = reader.nextLine();
		Integer tamano = respuesta.length();
		TreeSet<Character> conjunto = new TreeSet<Character>();
		
	
		int contador = 0;
		for (int i = 0; i < tamano; i++){
			if((conjunto.add(respuesta.charAt(i))) == true){
				contador++;
			}
		}
		
		
		respuesta = "";
		
		for(int i = 0; i < contador; i++){
			respuesta = respuesta + conjunto.pollFirst();
		}
		System.out.println(respuesta);
	}

}
