class Data{
     String r;
     int n;
     String name;
    Data(){
        r="rohan";
        
    }
    Data(String name,int n)
    {
        
        this.name=name;
        this.n=n;
        
    }
}




public class Main
{
	public static void main(String[] args) {
		Data obj=new Data();//same Data can be used in many form depend on argument passing
		Data obj1=new Data("devanshi",23);
		System.out.println(obj.r);
		System.out.println(obj1.name+" "+obj1.n);//access through object the there is no need to write publc in front of declaration variables
		
	}
}

