
public class GeometricManager {
	
	Geometric [] shapes;
	
	public GeometricManager (Geometric [] shapes) {
		this.shapes = shapes;
	}
	
	//Beginn des zu bearbeitenden Bereiches
	
	// Aufgabe 3
	public double totalArea () {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum += shapes[i].area();
		}
		return sum;
		
	}
	
	// Aufgabe 4
	public int countCircles () {
		int ergebnis = 0;
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] instanceof Circle) {
				ergebnis++;
			}
		}
		return ergebnis;
		
	}
	
	// Aufgabe 5
	public void increase () {
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				increaseRadius((Circle)shapes[i]);
			}
			else increaseWidthHeight((Rectangle)shapes[i]);
		}
	}
	public void increaseRadius(Circle a) {
		a.setRadius(a.getRadius()+1);
	}
	public void increaseWidthHeight(Rectangle b) {
		b.setHeight(b.getHeight()+1);
		b.setWidth(b.getWidth()+1);
	}
}
