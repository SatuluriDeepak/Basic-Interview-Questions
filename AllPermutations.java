import java.util.HashSet;
import java.util.Iterator;

public class AllPermutations {
	static HashSet<String> arr= new HashSet<String>();
	public static void main(String...args) {
	String s="abb";
	perm(s,"");
	
	Iterator i= arr.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		}
	}
	
	static void perm(String s,String ans) {
		if(s.length()==0) {
			arr.add(ans);}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			String r=s.substring(0,i)+
					s.substring(i+1);
			perm(r,ans+c);
		}	
	}
}
