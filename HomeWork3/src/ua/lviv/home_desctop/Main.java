package ua.lviv.home_desctop;

public class Main {

	public static void main(String[] args) {
		//Task1
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(12.36,18.9);
		
		System.out.println("����� ������������ r1= "+r1.area());
		System.out.println("����� ������������ r2= "+r2.area());
		System.out.println("�������� ������������ r1= "+r1.perim());
		System.out.println("�������� ������������ r2= "+r2.perim());
	
		//Task2
	
		Circle c=new Circle(14.7,9.15);
		System.out.println("����� ���� = "+c.area());
		System.out.println("������� ���� = "+c.lenght());
	
	
	}

}
