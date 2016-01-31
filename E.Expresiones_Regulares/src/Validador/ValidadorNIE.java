package Validador;
import java.util.regex.*;

public class ValidadorNIE {
	private String nie;

	public ValidadorNIE(){
		
	}
	public ValidadorNIE(String nie){
		this.nie = nie;
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	//LOGICA
	public Boolean comprobadorNIE(String nie){
	
		String regex		= "\\b(?<LetraInicial>[XYZ]{1})(?<Digitos>\\d{7})(?<LetraFinal>[A-Z&&[^IÑOU]]{1})\\b";
		
		Pattern patron		= Pattern.compile(regex);
		
		Matcher m			= patron.matcher(nie);
		
		if (m.find()){
			return true;
		}
		else{
			return false;
		}
	}
}
