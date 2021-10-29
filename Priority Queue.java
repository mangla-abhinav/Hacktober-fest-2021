import java.util.*;
class PriorityQueue {
    
    private int items[]=new int[5];
    private int count;
    int i;
    public void add(int item){
        if(count==items.length){
            throw new IllegalStateException();
        }
        
        for(i=count-1;i>=0;i--){
            if(items[i]>item){
                items[i+1]=items[i];
            }
            else{
                break;
            }
        }
        System.out.println("i: "+ i);
        items[i+1]=item;
        System.out.print(Arrays.toString(items)+" ");
        count++;
    }
    // public void display(){
    //     for(int i=0;i<items.length;i++){
    //         System.out.print(items[i]+" ");
    //     }
    // }
    
}



public class Main
{
  public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add(5);
		queue.add(3);
		//queue.add(7);
		queue.add(1);
		queue.add(2);
       // queue.display();


	}
}
