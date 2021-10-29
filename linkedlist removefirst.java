public class Main
{

  class Node
  {
    int data;
    Node next;
    public Node (int data)
    {
      this.data = data;
      this.next = null;
    }
  }
  public Node head = null;
  public Node tail = null;

  public void insertend (int data)
  {
    Node newNode = new Node (data);

    if (head == null)
      {
	head = newNode;
	tail = newNode;
      }
    else
      {
	tail.next = newNode;
	tail = newNode;
      }
  }
  public void display ()
  {
    Node current = head;
    if (head == null)
      {
	System.out.println ("list is empty");
	return;
      }
    System.out.println ("elements");
    while (current != null)
      {
	System.out.print (current.data + " ");
	current = current.next;

      }
    System.out.println ();
  }
  
  public int index=0;
  
  public void removefirst(){
     Node curr=head;
     Node second=curr.next; //Node is datatype
     head.next=null;
     head=second;
  }




  public static void main (String[]args)
  {
    Main obj = new Main ();
    obj.insertend (2);
    // obj.display ();

    obj.insertend (4);
    // obj.display ();
      obj.insertend(5);
    //     obj.display();
           obj.insertend(6);
       obj.display();
       
       obj.removefirst();
       obj.display();
       

  }
}
