import java.util.Scanner;

public class Palindrome {
	public static void main(String...args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter : ");
		
		String s=sc.nextLine();

		
		StringBuilder s1=new StringBuilder(s);
		String op=s1.reverse().toString();
		
		
		if(s.equals(op)) {
			System.out.println("Yes! Palindrome");
			
		}
		else {
			System.out.println("Nope! Not a Palindrome");
			
		}
		
		
	}

}
