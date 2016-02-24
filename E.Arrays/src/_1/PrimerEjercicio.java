package _1;

/*
Escribe un programa que almacene en un Array de cinco elementos,
las ventas anuales de cada una de las cinco tiendas de una cadena de
supermercados (asígnaselos al Array al declararlo).
A continuación calcular cuál fue la tienda que menos vendió,
cuál fue la que más vendió y el importe total de ventas de las cinco tiendas.
*/

public class PrimerEjercicio{
	private double [] ventasAnuales;
	
	public PrimerEjercicio(){
		this.ventasAnuales = new double[5];
	}
	
	public PrimerEjercicio(double[] ventas){
		this.ventasAnuales = new double[5];
		this.ventasAnuales = ventas;
	}
	
	void  setValorTienda(int numTienda, double ventas){
		int tienda = numTienda -1;
		this.ventasAnuales[tienda] = ventas;
	}

	void valoresVentas(){
		int contador = 0;
		for (double tienda: this.ventasAnuales){
			System.out.println("Las ventas de la tienda num" + (contador + 1) + " son: " + this.ventasAnuales[contador]);
			contador++;
		}
	}
	
	void ventaMenor(){
		double venta = this.ventasAnuales[0];
		int tienda = 0;
		int contador = 0;
		for (double tiendas: this.ventasAnuales){
			if (this.ventasAnuales[contador] < venta){
				venta = this.ventasAnuales[contador];
				tienda = contador;
				contador++;
			}
			else {
				contador++;
			}
		}
		
		this.mostrarVentaMenor(tienda, venta);
	}
	
	void ventaMayor(){
		double venta = this.ventasAnuales[0];
		int tienda = 0;
		int contador = 0;
		for (double tiendas: this.ventasAnuales){
			if (this.ventasAnuales[contador] > venta){
				venta = this.ventasAnuales[contador];
				tienda = contador;
				contador++;
			}
			else {
				contador++;
			}
		}
		
		this.mostrarVentaMayor(tienda, venta);
	}
	
	void mostrarVentaMenor(int tienda, double venta){
		System.out.println("La tienda que tuvo menos ventas fue la número " + (tienda +1) + " el total de las ventas fueron:" + venta);
	}
	
	void mostrarVentaMayor(int tienda, double venta){
		System.out.println("La tienda que tuvo más ventas fue la número " + (tienda +1) + " el total de las ventas fueron:" + venta);
	}


}
