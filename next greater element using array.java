public class Main
{
	public static void main(String[] args) {
		int arr[]={11,10,13,21,3};
		
		for(int i=0;i<arr.length;i++){
		    int c=arr[i];
		    int d=0;
		    for(int j=i+1;j<arr.length;j++){
		        if(c<arr[j]){
		            System.out.println(c+"-"+arr[j]);
		            d=1;
		            break;
		        }
		        
		    }
		    if(d==0){
		        System.out.println(c+"-"+d);
		    }
		    
		}
}
}
