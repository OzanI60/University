
// 1)
public class Rectangle implements Geometric {
	
	private int width;
	private int height;
	
	public Rectangle (int w, int h) {
		width = w;
		height = h;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	// 1)
	public double area() {
		return this.getWidth() * this.getHeight();
	}
}
