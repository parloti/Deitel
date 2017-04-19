package deitel.cap07;

class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width | 0;
		this.height = height | 0;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String toString() {
		return "( Width: " + this.width + ", Height: " + this.height + " )";
	}
	
	public int getArea() {
		return this.height * this.width;
	}
	
	public boolean equals(Rectangle rect) {
		if (this.height == rect.height && this.width == rect.width) {
			return true;
		} else {
			return false;
		}
	}
}