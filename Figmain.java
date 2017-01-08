import java.util.*;

abstract class Figure
{
	protected double r,l,b,h,area,perimeter;

	public abstract void findArea();
	public abstract void findPerimeter();
}

class Circle extends Figure
{
	public void read(double x)
	{
		r=x;
	}

	public void findArea()
	{
		
		area=3.14*r*r;
		System.out.println("Area of Circle = "+area);
	}
	
	public void findPerimeter()
	{
		perimeter=2*3.14*r;
		System.out.println("Perimeter of Circle = "+perimeter);
	}
}

class Rectangle extends Figure
{
	public void read(double x,double y)
	{
		l=x;	
		b=y;
	}

	public void findArea()
	{
		
		area=l*b;
		System.out.println("Area of Reactangle = "+area);
	}
	
	public void findPerimeter()
	{
		perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}
}


class Triangle extends Figure
{
	public void read(double x,double y,double z)
	{
		l=x;	
		b=y;
		h=z;
	}

	public void findArea()
	{
		
		area=((0.5)*b*h);
		System.out.println("Area of Triangle = "+area);
	}
	
	public void findPerimeter()
	{
		perimeter=l+b+h;
		System.out.println("Perimeter of Triangle = "+perimeter);
	}
}


class Figmain
{
	public static void main(String args[])
	{
		double e,f,g;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		e=sc.nextDouble();
		Circle c=new Circle();
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		
		c.read(e);
		c.findArea();
		c.findPerimeter();

		System.out.println("Enter length and breadth of rectangle");
		e=sc.nextDouble();
		f=sc.nextDouble();
		r.read(e,f);
		r.findArea();
		r.findPerimeter();

		System.out.println("Enter length , breadth and height of Triangle");
		e=sc.nextDouble();
		f=sc.nextDouble();
		g=sc.nextDouble();
		t.read(e,f,g);
		t.findArea();
		t.findPerimeter();
			

	}
}
