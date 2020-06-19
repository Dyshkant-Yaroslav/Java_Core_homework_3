package ua.lviv.home_desctop;

public class Circle {

	private double rad;
	private double dim;
	private  final double Pi = 3.14159265;
	
	public Circle(double rad, double dim) {
		this.rad= rad;
		this.dim=dim;
	}
	public double area() {
		return rad*rad*Pi;
	}
	public double lenght() {
		return dim*Pi;
	}
}
