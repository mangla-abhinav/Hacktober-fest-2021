import java.io.*;
import java.util.*;
class Largest_string{
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		String largest=new String();
		String temp=new String();
		int i=0;
		while(i<str.length()){
			if(temp.contains(String.valueOf(str.charAt(i)))){
				if(temp.length()>largest.length()) largest=temp;
				temp=temp.concat(String.valueOf(str.charAt(i)));
				int begin=temp.indexOf(str.charAt(i))+1;
				int end=temp.length();
				System.out.println("Begin= "+begin+" End= "+end);
				temp = temp.substring(begin,end);
				
			}
				else	temp=temp.concat(String.valueOf(str.charAt(i)));
			System.out.println("temp= "+temp);
			i++;
			
		}
		System.out.println((largest.length()>=temp.length())? largest.length() : temp.length());
	}
}