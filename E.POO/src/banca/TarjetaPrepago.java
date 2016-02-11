package banca;

import banca.Hora;
import dni.DniCif;

public class TarjetaPrepago {
private String telefono;
private Double saldo;
//Has a, tiene un DniCif
private DniCif dni;
//Has a, tiene un Hora
private Hora consumo;

public TarjetaPrepago(){
	
}

public TarjetaPrepago(String telefono, Double saldo,DniCif dni, Hora consumo){
	this.telefono	= telefono;
	this.saldo		= saldo;
	this.dni		= dni;
	this.consumo	= consumo;
}

//Getters y Setters
public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public Double getSaldo() {
	return saldo;
}

public void setSaldo(Double saldo) {
	this.saldo = saldo;
}

public DniCif getDni() {
	return dni;
}

public void setDni(DniCif dni) {
	this.dni = dni;
}

public Hora getConsumo() {
	return consumo;
}

public void setConsumo(Hora consumo) {
	this.consumo = consumo;
}

//Logica

void ingresarSaldo(Double cantidad){
	this.saldo += cantidad;
}

void enviarMensaje(Integer mensajes){
	this.saldo -= + 0.9 * mensajes;
}

void realizarLlamada(Integer segundos){
	this.saldo -= 0.15 + (0.01 * segundos);
	this.contadoConsumo(segundos);
}
void consultarTarjeta(){
	System.out.println("Num Tel: " + this.getTelefono());
	System.out.println("DNI: " + this.getDni());
	System.out.println("Saldo Actual: " + this.getSaldo());
}

void contadoConsumo(Integer segundosLlamada){
	Integer horas		= consumo.getHoras();
	Integer minutos		= consumo.getMinutos();
	Integer segundos	= consumo.getSegundos() + segundosLlamada;
	
	if (segundos >= 60){
		minutos += segundos /60;
		if (minutos >= 60){
			horas += minutos /60;
			if (horas < 0)
				horas = 0;
		}
	}
	if (minutos >= 60){
		horas += minutos /60;
		if (horas < 0)
			horas = 0;
	}
	
	this.consumo.setHora(horas, minutos, segundos);
}
}