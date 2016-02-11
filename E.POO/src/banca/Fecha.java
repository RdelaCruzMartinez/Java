package banca;

//CLASE SIN FINALIZAR
public class Fecha {

	private Integer dia = 01;
	private Integer mes	= 01;
	private Integer año	= 1900;
	
	public Fecha(){
		
	}
	
	public Fecha(Integer dia, Integer mes, Integer año){
		this.dia	= dia;
		this.mes	= mes;
		this.año	= año;
	}

	
	//Getters y Setters
	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		if (dia > 0 && dia < 32){
			this.dia = dia;
		}
		
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}
	
	//Logica
	
	public void setFecha(Integer dia, Integer mes, Integer año){
		this.setDia(dia);
		this.setMes(mes);
		this.setAño(año);
	}
}
