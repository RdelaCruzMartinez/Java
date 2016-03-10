package draw;

import java.util.ArrayList;

import draw.Dibujable;

public class Drawables  {

public static void dibujarFigura(ArrayList<Dibujable> figuras) {
	
				
		for (Dibujable figura : figuras){
			figura.draw();
		}

	}
public static void aplicarTema(ArrayList<Dibujable> figuras) {
	

	for (Dibujable figura : figuras){
		try {
			figura.applyTheme();	
		}
		
		catch (UnsupportedOperationException e){
			System.out.println("Tema no aplicable para esta figura");
		}
		
	}
}


}
