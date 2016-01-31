package Validador;
import java.util.regex.*;

public class ValidadorDNI {
	private String dni;
	
	public ValidadorDNI(){
		
	}
	public ValidadorDNI(String dni){
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	//LOGICA
	public boolean comprobadorDNI(String dni){
		String regex	= "\\b(?<ParteNumerica>\\d{8})(?<Letra>[A-Z&&[^IÑOU]]{1})\\b";
		
		Pattern patron	= Pattern.compile(regex);
		
		Matcher m		= patron.matcher(dni);
		
		if (m.find()){
			return true;
		}
		else{
			return false;
		}
	}
}
