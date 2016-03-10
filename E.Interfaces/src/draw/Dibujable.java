package draw;

import figuras.FiguraGeometrica;

public interface Dibujable {
	 void draw();
	 
	 default void applyTheme(){
		 throw new UnsupportedOperationException("Tema no aplicable para esta figura");
	 }

}
