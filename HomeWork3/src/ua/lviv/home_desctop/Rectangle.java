package ua.lviv.home_desctop;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {
		this.width=2.26;
		this.height=4.49;
	}
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double area() {
		return width*height;
	}
	public double perim() {
		return width*2+height*2;
	}
}
