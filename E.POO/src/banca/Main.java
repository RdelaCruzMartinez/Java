package banca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCuentaCorriente();
		testTarjetaPrepago();

	}
	public static void testCuentaCorriente(){
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.setNombre("Manolin");
		cuenta.setApellido("Perez");
		cuenta.setDireccion("Mordor nº 13");
		cuenta.setTelefono("971-89-88-70");
		cuenta.setSaldo(125.50);
		cuenta.ingresarDinero(105.0);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getNumerosRojos());
		cuenta.retirarDinero(500.0);
		System.out.println(cuenta.getNumerosRojos());
	}
	
	public static void testHora(){
		Hora horaCorrecta	= new Hora();
		Hora horaIncorrecta	= new Hora();
	}
	
	public static void testTarjetaPrepago(){
		TarjetaPrepago tarjeta = new TarjetaPrepago();
		tarjeta.setTelefono("666-24-21-97");
		tarjeta.setSaldo(100.10);
		tarjeta.consultarTarjeta();
	}
}
