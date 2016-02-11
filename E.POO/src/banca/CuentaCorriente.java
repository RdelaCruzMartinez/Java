package banca;

import dni.DniCif;

public class CuentaCorriente {
private String nombre;
private String apellido;
private String direccion;
private String telefono;
private DniCif dni;
private Double saldo;
private Boolean numerosRojos = false;

public CuentaCorriente(){
	
}

public CuentaCorriente(String nombre, String apellido, 
String direccion, String telefono,DniCif dni, Double saldo){
	
this.nombre		= nombre;
this.apellido	= apellido;
this.direccion	= direccion;
this.telefono	= telefono;
this.dni		= dni;
this.saldo		= saldo;
}

//Getters y Setters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public DniCif getDni() {
	return dni;
}

public void setDni(DniCif dni) {
	this.dni = dni;
}

public Double getSaldo() {
	return saldo;
}

public void setSaldo(Double saldo) {
	this.saldo = saldo;
}

public Boolean getNumerosRojos() {
	return numerosRojos;
}

public void setNumerosRojos() {
	if (this.saldo < 0){
		this.numerosRojos = true;
	}
	else this.numerosRojos = false;
}

//Logica

 void retirarDinero(Double cantidad){
	this.saldo -= cantidad;
	this.setNumerosRojos();
}

void ingresarDinero(Double cantidad){
	this.saldo += cantidad;
}

void consultarCuenta(){
	System.out.println("Nombre: " + this.getNombre());
	System.out.println("Apellido: " + this.getApellido());
	System.out.println("DNI: " + this.getDni());
	System.out.println("Direccion: " + this.getDireccion());
	System.out.println("Telefono: " + this.getTelefono());
	System.out.println("Saldo: " + this.getSaldo());
}

boolean saldoNegativo(){
	return this.numerosRojos;
}
}
