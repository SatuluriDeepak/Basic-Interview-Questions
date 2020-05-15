import java.util.Scanner;

public class Zoos {
	public static void main(String...args) {
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		char[] count= new char[256];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='z' || s.charAt(i)=='o' ) {
				count[s.charAt(i)]++; 
			}
		}
		int x=count['z'];
		int y=count['o'];
		//System.out.println(x);
		//System.out.println(y);
		if(2*(x)==y) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
