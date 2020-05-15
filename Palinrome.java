import java.util.Scanner;

public class Palinrome {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		String S=sc.nextLine();
		StringBuilder sb= new StringBuilder(S);
		if(S.equals(sb.reverse().toString())){
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
	}

}
