import java.util.*;
class PeriorityQueue{
    
    ArrayList<Integer> data;
    
    public PeriorityQueue(){
        data=new ArrayList<>();
    }
    
    public void swap(int a,int b){
            int ath=data.get(a);
            int bth=data.get(b);
            data.set(a,bth);
            data.set(b,ath);
        }
        
    public void insert(int val){
        data.add(val); //add first
        unheapify(data.size()-1);//swap according to periority
    }
    public void unheapify(int i){
        if(i==0){//untill root 
            return;
        }
        int pi=(i-1)/2;
        if(data.get(i)<data.get(pi)){
            swap(i,pi);
            unheapify(pi);
        }
        
        
    }
    
    
    public int remove(){
        if(this.size()==0){
            System.out.println("Underflow");
            return -1;
        }
        swap(0,data.size()-1);//swap first and last
        int val=data.remove(data.size()-1);//remove last
        downheapify(0);//swap according to periority
        
        return val;//print
    }
    
    public void downheapify(int pi){
        int mini=pi;
        
        int li=2*pi+1;
        if(li<data.size() && data.get(li)<data.get(mini)){//check left index is persent or not && value compare
            mini=li;
        }
        
        int ri=2*pi+2;
        if(ri<data.size() && data.get(ri)<data.get(mini)){
            mini=ri;
        }
        if(mini!=pi){
            swap(pi,mini);
            downheapify(mini);
        }
        
        
    }
    
    
    public int size(){
        return data.size();
    }

}
//smaller the element greater the periority



public class Main
{
	public static void main(String[] args) {
		
		int[] arr={5,3,1,10,8};
		PeriorityQueue obj=new PeriorityQueue();
	for(int i=0;i<arr.length;i++){
		    obj.insert(arr[i]);
		}
		System.out.println(obj.remove());
	}
}



