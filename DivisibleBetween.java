import java.util.Scanner;

public class DivisibleBetween {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : ");
		int l= sc.nextInt();
		int r=sc.nextInt();
		int k=sc.nextInt();
		int c=0;
		for(int i=l;i<=r;i++) {
			if(i%k==0)
				c++;
		}
		System.out.println(c);
	}


}
