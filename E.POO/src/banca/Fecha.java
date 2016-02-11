package banca;

//CLASE SIN FINALIZAR
public class Fecha {

	private Integer dia = 01;
	private Integer mes	= 01;
	private Integer a�o	= 1900;
	
	public Fecha(){
		
	}
	
	public Fecha(Integer dia, Integer mes, Integer a�o){
		this.dia	= dia;
		this.mes	= mes;
		this.a�o	= a�o;
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

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}
	
	//Logica
	
	public void setFecha(Integer dia, Integer mes, Integer a�o){
		this.setDia(dia);
		this.setMes(mes);
		this.setA�o(a�o);
	}
}
