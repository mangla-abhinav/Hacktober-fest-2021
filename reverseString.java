import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="abcd";
		
		Stack<Character> stk=new Stack<Character>();
		for(int i=0;i<str.length();i++){
		    stk.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++){
		    System.out.print(stk.pop()+" ");
		}
	}
}

