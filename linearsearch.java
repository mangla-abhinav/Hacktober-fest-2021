class Linearsearch{
    public static int linear(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    } 
}
public class Main
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int key=7;
		Linearsearch obj=new Linearsearch();
		int c=obj.linear(a,key);
		if(c!=-1){
		   System.out.println("element is placed at position : "+c);
		}
		else{
		    System.out.println("element not found");
		}
	}
}
