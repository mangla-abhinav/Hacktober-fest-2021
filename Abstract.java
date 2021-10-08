package New2;
//Abstract classes

abstract class Area{
	abstract void calculateArea(int l,int b); //unini
	void calculateArea(int s)
	{
		System.out.println(s*s);
	}
}

class Rectangle extends Area
{
	void calculateArea(int l, int b)
	{
		System.out.println(l*b);
	}
	void calculateArea(int l) {}
}
class Square extends Area
{
	void calculateArea(int l, int b) {}
}
class Abstract extends Square
{
	public static void main (String[] args)
	{
		Area obj = new Rectangle();
		obj.calculateArea(5, 5);
		Area obj1 = new Square();
		obj1.calculateArea(6);
	}
}

