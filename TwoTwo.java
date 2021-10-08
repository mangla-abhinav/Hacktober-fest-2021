import java.util.*;
import java.io.*;
import java.math.*;

class rangeByrange{
    int isPowerOf2(String s){
		//System.out.println(s+"end");
		char[] str=s.toCharArray();
		//System.out.println(Arrays.toString(str));
		int length=s.length()-2;
		//System.out.println(length);
		char last=str[length-1];
		if(last=='0'||last=='1'||last=='3'||last=='5'||last=='7'||last=='9')
			return 0;
		while(length!=1||str[length-1]!='1'){
			
			if(((str[length-1]-'0')%2==1))
				return 0;
			int j=0;
			int num=0;
			//System.out.println("length is: "+length);
			for(int i=0;i<length;i++){
				if(i==0&&str[i]=='0')
					return 0;
		    num=num*10+(int)str[i]-(int)'0';
			if(num<2){
				if(i==0)
					continue;
			}
			str[j++]=(char)((int)(num/2)+(int)'0');
			//System.out.println(Arrays.toString(str));
			num=(num%2==0)? 0 : 1;
			}
			length=j;
			str[j]='\0';
			//System.out.println("Out of i loop:   "+Arrays.toString(str));
		}
		return 1;
		
		
	}
}


public class TwoTwo{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        while(n-- >0){
			int count=0;
            String num=reader.readLine();
            rangeByrange resulter=new rangeByrange();
            for(int i=1;i<=num.length();i++){
				for(int j=0;j+i<=num.length();j++){
					
					int temp=resulter.isPowerOf2(num.substring(j,j+i)+" "+"\0");
					
					if(temp!=0) count++;
					//if(temp==1)
					//	System.out.println(num.substring(j,j+i)+" "+"\0");
					//System.out.println("Return is: "+temp);
				}
			}
            //System.out.println(resulter.getresult());
            //System.out.println(resulter.letme());
			System.out.println("Count is: "+count);
        }
    }
}