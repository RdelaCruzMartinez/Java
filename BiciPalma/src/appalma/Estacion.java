package appalma;

import appalma.Bicicleta;
import appalma.TarjetaUsuario;
import java.util.Random;
import java.time.LocalTime;
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
		
		int anclajesLibres = 0;
		
		for (int i = 0; i < this.numeroAnclajes; i++){
			if (anclajes[i] == null){
				anclajesLibres++;
			}
		}
		return anclajesLibres;
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
	    this.medidorTiempo(bici);
	}
	
	void medidorTiempo(Bicicleta bici){
		LocalTime entrega = LocalTime.now();
		//LocalTime entrega = LocalTime.of(19, 25); Test para comprobar el exceso de tiempo.
		LocalTime retirada = bici.getTiempo();
		int horaInicial = retirada.getHour();
		int minutosInicial = retirada.getMinute();
		if (horaInicial !=0 && minutosInicial != 0){
			long duracion = MINUTES.between(retirada,entrega);
			if (duracion > 30){
				System.out.println("Se ha sobrepasado el tiempo permitido, se le aplicara un recargo");
			}
		}
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
	LocalTime retirada = LocalTime.now();
	int horas = retirada.getHour();
	int minutos = retirada.getMinute();
	bici.setTiempo(horas, minutos);
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