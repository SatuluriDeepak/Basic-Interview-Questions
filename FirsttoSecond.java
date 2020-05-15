import java.util.ArrayList;
import java.util.Arrays;

public class FirsttoSecond {
	public static void main(String...args) {
		
		String s1="India is great";
		String s2="in";
		
		Remove(s1,s2);
		
	}

	static void Remove(String s1, String s2) {
		int [] c= new int[256];
		char[]str=s1.toCharArray();
		ArrayList<Character> al= new ArrayList<Character>();
		int inp=0,res=0;
		
		for(int i=0;i<s2.length();i++) {
			c[s2.charAt(i)]++;
		}
		
		while(inp!=str.length) {
			char temp=str[inp];
			if(c[temp]==0) {
				al.add(temp);
				res++;
			}
			inp++;
		}
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i));	
	}

}
