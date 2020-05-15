import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String...args) {
		String s="Deepaak";
		
		LinkedHashSet<Character> al= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			al.add(s.charAt(i));
		}
		for(Character c:al) {
			System.out.print(c);
		}
		
	}

}

