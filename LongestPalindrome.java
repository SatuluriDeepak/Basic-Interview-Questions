import java.util.ArrayList;

public class LongestPalindrome {
	public static void main(String...args) {
		String s="absmadamha";
		String f="";
		
		char []arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<j;k++) {
					f=f+s.charAt(k);
				}
				System.out.println(f);
			}
		}
		
	}

	static void Res(String f) {/*
		StringBuilder sb= new StringBuilder(f);
		String s1=sb.reverse().toString();
		if(f.equals(s1)) {
			System.out.println(f);
		}*/
		System.out.println(f);

		
	}

}
