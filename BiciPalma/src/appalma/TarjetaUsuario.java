package appalma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TarjetaUsuario {
	private String id;
	private Boolean activada;
	private Boolean numValido;
	
	public TarjetaUsuario(String id){
		this.id 	= id;
	}

	public String getId() {
		return id;
	}

    Boolean getActivada() {
		return activada;
	}

	public void setActivada(Boolean activada) {
		this.activada = activada;
	}
	
	private void setNumValido(Boolean valido){
		this.numValido = valido;
	}
	
	Boolean comprobadorId(){
		String id			= this.getId();
		String regex 		= "\\b(\\d{9})\\b";
		Pattern patron		= Pattern.compile(regex);
		Matcher m			= patron.matcher(id);
		Boolean valido		= m.find();
		if (valido == true){
			this.setNumValido(valido);
		}
		
		return valido;
	}
	

}