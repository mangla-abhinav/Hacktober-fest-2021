package New1;
interface Area
{
	final float pi=3.14f;
	public void calculateArea(int side);
	public void calculateArea(int length, int bre);
}
class Square implements Area
{
	public void calculateArea(int a)
	{
		int area;
		area=a*a;
		System.out.println(area);
	}
	public void calculateArea(int l,int b) {}
}
class Rectangle implements Area
{
	public  void calculateArea(int a,int b)
	{
		int area;
		area=a*b;
		System.out.println(area);
	}
	
	public void calculateArea(int side) {}
}
class Circle implements Area
{
	public void calculateArea(int radius)
	{
		float area;
		area=pi*radius*radius;
		System.out.println(area);
	}
	public void calculateArea(int l, int b) {}
}
public class interface1 {
	public static void main(String[] arg)
	{
		Square Obj = new Square();
		Obj.calculateArea(5);
		Rectangle Obj1=new Rectangle();
		Obj1.calculateArea(3,4);
		Circle Obj2=new Circle();
		Obj2.calculateArea(3);
	}

}
