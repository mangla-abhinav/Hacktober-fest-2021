import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
      int test=sc.nextInt();
      while(test-->0){
        int n=sc.nextInt(),nSq=n*n,flag=0;
        for(int i=1;nSq/i!=0;i*=10){
          if(nSq%i+nSq/i==n)
          {flag=1;
           break;
          }
        }
        System.out.println(flag);
      }
    }
}
