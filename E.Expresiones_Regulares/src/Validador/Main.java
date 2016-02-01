package Validador;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Descomentar el caso test que se desee comprobar.
		//testDNICorrectos();
		//testDNIIncorrectos();
		//testNIECorrectos();
		//testNIEIncorrectos();
		//testDniCif();
	}
	
	public static void testDNICorrectos(){
		ValidadorDNI validar = new ValidadorDNI();
		String[] casosTest = {
		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		int casos = 10;
		for (int contador = 0; contador < casos; contador++){
			if (validar.comprobadorDNI(casosTest[contador]) == true){
				System.out.println("Test con DNI =>  " + casosTest[contador] + " OK");
			}
			else{
				System.out.println("Test con DNI =>  " + casosTest[contador] + " FAIL");
			}
		}
	}

	
	public static void testDNIIncorrectos(){
		ValidadorDNI validar 		= new ValidadorDNI();
		Random letras				= new Random();
		Random dniNum				= new Random();
		
		String[] casosTest;
		casosTest = new String[10];
		
		int numero;
		String DNI;
		
		String letrasNoPermitidas = "IÑOU";
		
		for (int contador = 0; contador < 10; contador++){
			char letra = letrasNoPermitidas.charAt(letras.nextInt(4));
			numero = dniNum.nextInt(100000000 - 10000000 + 1) + 10000000;
			DNI = Integer.toString(numero) + letra;
			casosTest[contador] = DNI;
		}
		
		int casos = 10;
		for (int contador = 0; contador < casos; contador++){
			if (validar.comprobadorDNI(casosTest[contador]) == true){
				System.out.println("Test con DNI =>  " + casosTest[contador] + " OK");
			}
			else{
				System.out.println("Test con DNI =>  " + casosTest[contador] + " FAIL");
			}
		}

		
	}
	public static void testNIECorrectos(){
		ValidadorNIE validar 		= new ValidadorNIE();
		Random letraInicial			= new Random();
		Random letraFinal			= new Random();
		Random dniNum				= new Random();
		
		String[] casosTest;
		casosTest = new String[10];
		
		int numero;
		String NIE;
		
		String letrasIniciales	= "XYZ";
		String letrasFinales	= "TRWAGMYFPDXBNJZSQVHLCKE";
		
		for (int contador = 0; contador < 10; contador++){
			char letraA = letrasIniciales.charAt(letraInicial.nextInt(3));
			char letraB = letrasFinales.charAt(letraFinal.nextInt(23));
			numero = dniNum.nextInt(10000000 - 1000000 + 1)+ 1000000;
			NIE = letraA + Integer.toString(numero) + letraB;
			casosTest[contador] = NIE;
		}
		
		int casos = 10;
		for (int contador = 0; contador < casos; contador++){
			if (validar.comprobadorNIE(casosTest[contador]) == true){
				System.out.println("Test con NIE =>  " + casosTest[contador] + " OK");
			}
			else{
				System.out.println("Test con NIE =>  " + casosTest[contador] + " FAIL");
			}
		}

		
	}
	public static void testNIEIncorrectos(){
		
		ValidadorNIE validar 		= new ValidadorNIE();
		Random letraInicial			= new Random();
		Random letraFinal			= new Random();
		Random dniNum				= new Random();
		
		String[] casosTest;
		casosTest = new String[10];
		
		int numero;
		String NIE;
		
		String letrasIniciales	= "KWS";
		String letrasFinales	= "IÑOU";
		
		for (int contador = 0; contador < 10; contador++){
			char letraA = letrasIniciales.charAt(letraInicial.nextInt(3));
			char letraB = letrasFinales.charAt(letraFinal.nextInt(4));
			numero = dniNum.nextInt(10000000 - 1000000 + 1)+ 1000000;
			NIE = letraA + Integer.toString(numero) + letraB;
			casosTest[contador] = NIE;
		}
		
		int casos = 10;
		for (int contador = 0; contador < casos; contador++){
			if (validar.comprobadorNIE(casosTest[contador]) == true){
				System.out.println("Test con NIE =>  " + casosTest[contador] + " OK");
			}
			else{
				System.out.println("Test con NIE =>  " + casosTest[contador] + " FAIL");
			}
		}

	}
	
	public static void testDniCif(){
		DniCif dniValido 	= new DniCif("78484464T");
		DniCif dniInvalido 	= new DniCif("784844Ñ");
		System.out.println(dniValido.getPatronDniValido());
		System.out.println(dniInvalido.getPatronDniValido());
	}
}

