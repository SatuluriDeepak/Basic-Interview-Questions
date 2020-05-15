import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PrintDuplicates {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String str="Java JavaScript";
		int count[] = new int[128]; 
		LinkedHashSet<Character>al= new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++; 
			if(count[str.charAt(i)]>1)
				al.add(str.charAt(i));
			}
		
		if(al.size()>0) {
			Iterator<Character> ite= al.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}
		}
	}
}