import java.util.Scanner;

public class SeatArrangment {
	public static void main(String...args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter : ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int s=sc.nextInt();
			
			if(s%12==0)
				System.out.println(s-11+" "+"WS");
			else if(s%12==1) 
				System.out.println(s+11+" "+"WS");
			else if(s%6==0) 
				System.out.println(s+1+" "+"WS");
			else if(s%6==1)
				System.out.println(s-1+" "+"WS");
			
			
			else if(s%12==11)
				System.out.println(s-9+" "+"MS");
			else if(s%12==2)
				System.out.println(s+9+" "+"MS");
			else if(s%6==5)
				System.out.println(s+3+" "+"MS");
			else if(s%6==2)
				System.out.println(s-3+" "+"MS");
			
			else if(s%12==10)
				System.out.println(s-7+" "+"AS");
			else if(s%12==3)
				System.out.println(s+7+" "+"AS");
			else if(s%6==3)
				System.out.println(s-5+" "+"AS");
			else if(s%6==4)
				System.out.println(s+5+" "+"AS");
			
		}
		
		
		
	}

}
