package appalma;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.LocalTime;

public class Bicicleta {
    private String id;
    Boolean numValido = false;
    LocalTime tiempo;
    
    public Bicicleta(){
    	tiempo = LocalTime.of(0, 0);
    }
	 
	public Bicicleta(String id){
		this.id = id;
		tiempo = LocalTime.of(0, 0);
		comprobadorId();
	}
	
	public LocalTime getTiempo() {
		return tiempo;
	}

	public void setTiempo(int horas, int minutos) {
		this.tiempo = LocalTime.of(horas, minutos);
	}

	Boolean comprobadorId(){
		String id			= this.getId();
		String regex 		= "\\b(\\d{3})\\b";
		Pattern patron		= Pattern.compile(regex);
		Matcher m			= patron.matcher(id);
		Boolean valido		= m.find();
		if (valido == true){
			this.setNumValido(valido);
		}
		
		return valido;
	}

	public String getId() {
		return id;
	}

	
	private void setNumValido(Boolean valido){
		this.numValido = valido;
	}
}
