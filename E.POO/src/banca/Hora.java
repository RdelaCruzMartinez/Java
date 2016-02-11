package banca;

public class Hora {
Integer horas		= 0;
Integer minutos		= 0;
Integer segundos	= 0;

public Hora(){
	
}

public Hora(Integer horas, Integer minutos, Integer segundos){
	this.horas		= horas;
	this.minutos	= minutos;
	this.segundos	= segundos;
}


//Getters y Setters

public Integer getHoras() {
	return horas;
}

public void setHoras(Integer horas) {
	if (horas > 0 && horas < 25){
		this.horas = horas;
	}
	else this.horas = 0;
}

public Integer getMinutos() {
	return minutos;
}

public void setMinutos(Integer minutos) {
	if (minutos > 0 && minutos < 60){
		this.minutos = minutos;
	}
	else this.minutos = 0;
}

public Integer getSegundos() {
	return segundos;
}

public void setSegundos(Integer segundos) {
	if (segundos > 0 && segundos < 60){
		this.segundos = segundos;
	}
	else this.segundos = 0;
}

// Logica

void setHora(Integer horas, Integer minutos, Integer segundos){
	this.setHoras(horas);
	this.setMinutos(minutos);
	this.setSegundos(segundos);
}

String imprimirHora(){
	return String.format("%s:%s:%s", this.getHoras(),this.getMinutos(),this.getSegundos());

}


}
