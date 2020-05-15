import java.util.Scanner;

public class RemoveCharacter {
	public static void main(String...args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Enter removing Character");
		String rep=sc.nextLine();
		String n=s.replace(rep,"");
		String first=s.replaceFirst(rep,"");
		//System.out.println(n);
		System.out.println(first);
		//System.out.println(n.length());
		
	}

}
