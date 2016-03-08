package appalma;

import java.util.Random;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testEstacion();
		//testBici();
		//testTarjetaUsuario();
		//testRandom();
		testTiempo();

	}
	public static void testEstacion(){
		Estacion estacion = new Estacion(1, "Manacor", 6);
		TarjetaUsuario tarjeta = new TarjetaUsuario("52228");
		tarjeta.setActivada(true);
		Bicicleta bici1 = new Bicicleta("666");
		Bicicleta bici2 = new Bicicleta("667");
		Bicicleta bici3 = new Bicicleta("668");
		Bicicleta bici4 = new Bicicleta("669");
		//estacion.consultarEstacion();
		//System.out.println(estacion.anclajesLibres());
		//estacion.consultarAnclajes();
		estacion.anclarBicicleta(bici1);
		estacion.anclarBicicleta(bici2);
		estacion.anclarBicicleta(bici3);
		estacion.anclarBicicleta(bici4);
		//System.out.println(estacion.anclajesLibres());
		int num = estacion.generarAnclaje();
		System.out.println(num);
		estacion.consultarAnclajes();
		estacion.retirarBicicleta(tarjeta);
		System.out.println("-----------------------------------------------");
		estacion.consultarAnclajes();
		
		
	}
	
	public static void testBici(){
		Bicicleta bici = new Bicicleta("525");
		System.out.println(bici.comprobadorId());
		
	}
	
	public static void testTarjetaUsuario(){
		TarjetaUsuario tarjeta = new TarjetaUsuario("123456789");
		System.out.println(tarjeta.comprobadorId());
	}
	
	public static void testRandom(){
		Random random = new Random();
		Integer numero = random.nextInt(6);
		System.out.println(numero);
	}
	
	public static void testTiempo(){
		Estacion estacion = new Estacion(1, "Manacor", 6);
		TarjetaUsuario tarjeta = new TarjetaUsuario("52228");
		tarjeta.setActivada(true);
		Bicicleta b335 = new Bicicleta("335");
		Bicicleta b336 = new Bicicleta("336");
		Bicicleta bici3 = new Bicicleta("500");
		//estacion.consultarEstacion();
		//estacion.consultarAnclajes();
		estacion.anclarBicicleta(b335);
		estacion.anclarBicicleta(b336);
		//estacion.consultarAnclajes();
		estacion.retirarBicicleta(tarjeta);
		estacion.anclarBicicleta(b335);
	}
	
}