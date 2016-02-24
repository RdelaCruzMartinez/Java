package _1;

public class Main {

	public static void main(String[] args) {
		//testTiendas();
		//testVentaMenor();
		testVentaMayor();
	}
	
	public static void testTiendas(){
		PrimerEjercicio tiendas = new PrimerEjercicio();
		tiendas.setValorTienda(1, 152.90);
		tiendas.setValorTienda(3, 55.70);
		tiendas.valoresVentas();
	}
	
	public static void testVentaMenor(){
		PrimerEjercicio tiendas = new PrimerEjercicio();
		tiendas.setValorTienda(1, 152.90);
		tiendas.setValorTienda(3, 55.70);
		tiendas.setValorTienda(2, 551.20);
		tiendas.setValorTienda(5, 600.10);
		tiendas.setValorTienda(4, 13.90);
		//tiendas.valoresVentas();
		tiendas.ventaMenor();
	}
	
	public static void testVentaMayor(){
		PrimerEjercicio tiendas = new PrimerEjercicio();
		tiendas.setValorTienda(1, 152.90);
		tiendas.setValorTienda(3, 55.70);
		tiendas.setValorTienda(2, 551.20);
		tiendas.setValorTienda(5, 600.10);
		tiendas.setValorTienda(4, 13.90);
		//tiendas.valoresVentas();
		tiendas.ventaMayor();
	}

}
