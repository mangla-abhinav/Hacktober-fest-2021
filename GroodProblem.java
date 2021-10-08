
// Memory=29412 and Time= 0.29 sec


import java.util.*;
import java.io.*;
import java.util.stream.*;

class GroodProblem{
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(reader.readLine());
		while(t>0){
			int n=Integer.parseInt(reader.readLine());
			
		List<Integer> listOfElements=new ArrayList<>();
		Collections.addAll(listOfElements,(Arrays.stream(Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray()).boxed().toArray(Integer[]::new)));
		while(listOfElements.size()>1){
				int minimum = Collections.min(listOfElements);
				if(listOfElements.indexOf(minimum)!=listOfElements.lastIndexOf(minimum))
					listOfElements.set(listOfElements.indexOf(minimum), minimum+1);
				listOfElements.remove(listOfElements.lastIndexOf(minimum));
			}
			System.out.println(listOfElements.get(0));
			t--;
		}
	}
}