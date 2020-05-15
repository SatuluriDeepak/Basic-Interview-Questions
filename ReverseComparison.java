
public class ReverseComparison {
	public static void main(String...args) {
		String s1="XYZ";
		String s2="ZYX";
		
		StringBuilder sb= new StringBuilder(s2);
		String B= sb.reverse().toString();
		
		int res=s1.compareTo(B);
        if(res==0)
        	System.out.println("true");
        else System.out.println("false");
        
		

	}

}
