package appalma;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bicicleta {
    private String id;
    Boolean numValido = false;
    
    public Bicicleta(){
    	
    }
	 
	public Bicicleta(String id){
		this.id = id;
		comprobadorId();
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
