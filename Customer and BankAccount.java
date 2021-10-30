import java.util.Scanner;
class Customer
{
  public int ID;
  public String name;
  public char gender;
  public Customer(int ID,String name,char gender)
  {
    this.ID=ID;
      this.name=name;
    this.gender=gender;
  }
  public int getID()
  {
    return ID;
  }
  public String getName()
  {
    return name;
  }
  public char getGender()
  {
    return gender;
  }
  public String toString()
  {
    return name+"("+ID+")";
  }
}

class BankAccount
{
  public int ID;
  public Customer customer;
  public double balance;
  public BankAccount(int ID,Customer customer,double balance)
  {
this.ID=ID;
    this.customer=customer;
    this.balance=balance;
  }
  
  public int getID()
  {
    return ID;
  }
  public Customer getCustomer()
  {
    return customer;
  }
  public void setBalance(double balance)
  {
    this.balance=balance;
  }
  public double getBalance()
  {
    return balance;
  }
  
     public String toString()
  {
    return customer.getName()+"("+customer.getID()+") balance=INR "+balance+"0";
  }
  public void deposit(double amount)
  {
    balance=balance+amount;
    
  }
  public void withdraw(double amount)
  {
    if (balance>amount)
    {
      balance=balance-amount;
    }
    else System.out.println("Insufficient balance");
  }
 
}
class Main
{
  public static void main(String[] args)
  {
    String a1,a2;
    double d1;
    int n1,n2;
    Scanner s1=new Scanner(System.in);
    n1=Integer.parseInt(s1.nextLine());
    a1=s1.nextLine();
    a2=s1.nextLine();
    Customer c1 = new Customer(n1, a1, a2.charAt(0));
    System.out.println(c1.getID());
    System.out.println(c1.getName());
    System.out.println(c1.getGender());
    System.out.println(c1);  // Customer's toString()

    n1=Integer.parseInt(s1.nextLine());
    d1=Double.valueOf(s1.nextLine());
    BankAccount b1 = new BankAccount(n1, c1, d1);  // BankAccount's Constructor
    System.out.println(b1.getID());
    System.out.println(b1.getBalance());
    System.out.println(b1);
    d1=Double.valueOf(s1.nextLine());
    b1.setBalance(d1);
    System.out.println(b1.getBalance());
    d1=Double.valueOf(s1.nextLine());
    b1.deposit(d1);
    System.out.println(b1.getBalance());
    d1=Double.valueOf(s1.nextLine());
    b1.withdraw(d1);
    System.out.println(b1.getBalance());
    d1=Double.valueOf(s1.nextLine());
    b1.withdraw(d1);
    System.out.println(b1.getBalance());
  }
}
