package Colecciones;
import java.util.Scanner;
import java.util.Stack;

/*
Escribe un programa que muestre al revés una cadena de caracteres dada.
¿Cuál de las clases ArrayList, Pila, Cola o Conjunto has de utilizar?
Ojo al tipo de los objetos de la colección que definas.
*/

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un String: ");
		String respuesta = reader.nextLine();
		Stack<Character> pila = new Stack<Character>();
		Integer tamano = respuesta.length();
		
		for (int i = 0; i < tamano; i++){
			pila.push(respuesta.charAt(i));
		}
		
		respuesta = "";
		
		for(int i = 0; i < tamano; i++){
			respuesta = respuesta + pila.pop();
		}
		
		System.out.println(respuesta);

	}

}


