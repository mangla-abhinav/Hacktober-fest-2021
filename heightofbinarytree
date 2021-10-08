class Node{
     int data;
     Node left;
     Node right;
    public Node(int data){
        
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BTS{
    private Node root;
    
    public BTS(){
        root=null;
    }
    
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root==null)
            return -1;
        if(root.left==null && root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    
    
    public void insert(int value){
        
        Node newnode=new Node(value);
        Node ptr;
        if(root==null){
            root=newnode;
        }
        else{
            ptr=root;
            while(ptr!=null){
                if(value>ptr.data){
                    if(ptr.right==null){
                        ptr.right=newnode;
                        break;
                    }
                    else{
                        ptr=ptr.right;
                    }
                }
                else if(value<ptr.data){
                    if(ptr.left==null){
                        ptr.left=newnode;
                        break;
                    }
                    else{
                        ptr=ptr.left;
                    }
                }
                else{
                    System.out.println("duplicate not allowed");
                    break;}
            }
        }
            
    }
    
}
public class Main{
public static void main(String[] args){
    BTS obj=new BTS();
    obj.insert(12);
    obj.insert(8);
    obj.insert(9);
    obj.insert(6);
    obj.insert(3);
    obj.insert(14);
    obj.insert(13);
    System.out.println("height of tree is :"+obj.height());
}


}
