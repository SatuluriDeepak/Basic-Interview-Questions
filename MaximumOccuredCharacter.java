	import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MaximumOccuredCharacter {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String str="Java JavaScript";
		int count[] = new int[128]; 
		int max=0;
		
		HashSet<Character>al= new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) 
			count[str.charAt(i)]++; 
		for(int j=0;j<str.length();j++) {
			if(max<count[str.charAt(j)]) {
				max=count[str.charAt(j)];
			}	
		}
		for(int j=0;j<str.length();j++) {
			if(max==count[str.charAt(j)]) {
				al.add(str.charAt(j));
			}	
		}
		
		if(al.size()>0) {
			Iterator<Character> ite= al.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next()+" - "+max);
			}
		}
	}
}