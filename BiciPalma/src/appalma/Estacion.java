package appalma;

import appalma.Bicicleta;
import appalma.TarjetaUsuario;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.temporal.ChronoUnit;

public class Estacion {
	final Integer id;
	final String direccion;
	Integer numeroAnclajes;
	Bicicleta[] anclajes;

	public Estacion(Integer id, String direccion,Integer numeroAnclajes){
		this.id 			= id;
		this.direccion		= direccion;
		this.numeroAnclajes	= numeroAnclajes;
		this.inicializadoAnclajes();
	}
	
	public Integer getNumeroAnclajes() {
		return numeroAnclajes;
	}

	public Bicicleta[] getAnclajes() {
		return anclajes;
	}


	public void setAnclajes(Bicicleta[] anclajes) {
		this.anclajes = anclajes;
	}

	public Integer getId() {
		return id;
	}

	public String getDireccion() {
		return direccion;
	}

	//Logica
	void inicializadoAnclajes(){
		int total = this.getNumeroAnclajes();
		this.anclajes = new Bicicleta[total];
	}
	
	void consultarEstacion(){
		System.out.println("Estacion num: " + this.getId());
		System.out.println("Direccion: " + this.getDireccion());
		System.out.println("Numero de Anclajes: " + this.getNumeroAnclajes());
	}
	
	Integer anclajesLibres(){
		int contador = 0;
		int posicion = 0;
		for (Bicicleta anclaje: this.anclajes){
			if (anclajes[posicion] == null){
				contador += 1;
				posicion += 1;
			}
			else {
				posicion +=1;
			}
		}
		return contador;
	}
	
	void anclarBicicleta(Bicicleta bici){
		int posicion = 0;
		for(Bicicleta anclaje: this.anclajes){
			if (anclajes[posicion] ==  null){
				anclajes[posicion] = bici;
				break;
			}
		    posicion += 1;
		}
	    this.consultarAnclajes();
	}
	
	void consultarAnclajes(){
		int posicion = 0;
		for (Bicicleta anclaje: this.anclajes){
			if (anclajes[posicion] == null){
				System.out.println("Posicion " + (posicion +1)  + " libre");
			}
			else System.out.println("Bicicleta num" + anclajes[posicion].getId());
		posicion += 1;
		}
	}
	
	Boolean leerTargetaUsuario(TarjetaUsuario tarjeta){
		return tarjeta.getActivada();
	}
	
	void retirarBicicleta(TarjetaUsuario tarjeta){
		Boolean activada = tarjeta.getActivada();
		int lugar = this.generarAnclaje();
		int anclaje;
		Bicicleta bici = new Bicicleta();
		if (activada == true){
		   for (Bicicleta posicion: this.anclajes){
			   if (anclajes[lugar] == null){
				   lugar = this.generarAnclaje();
			   }
			   else{
				   bici 	= anclajes[lugar];
				   anclajes[lugar] = null;
				   break;
			   } 
		   }
	}
	this.mostrarBicicleta(bici,lugar);
	//this.contador
	}
	
	void mostrarBicicleta(Bicicleta bici, int lugar){
		lugar += 1;
		if (lugar == (this.getNumeroAnclajes() + 1)){
			lugar -= 1;
		}
		    System.out.println("Coga la Bicicleta " + bici.getId()+ " en el Anclaje " + lugar);  
	}
		
	Integer generarAnclaje(){
		Random random  = new Random();
		Integer numero = random.nextInt(this.getNumeroAnclajes());
		return numero;
	}
	
	//void contador(TarjetaUsuario tarjeta)
	}
