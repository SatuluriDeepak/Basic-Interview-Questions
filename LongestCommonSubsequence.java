import java.util.Arrays;
import java.util.LinkedHashSet;

public class LongestCommonSubsequence {
	public static void main(String...args) {
		String X = "AGGTAB"; 
        String Y = "GXTXAYB"; 
        String []s1=X.split("");
        String []s2 = Y.split("");
        
        LinkedHashSet <String> set = new LinkedHashSet<String>();
        set.addAll(Arrays.asList(s2));
        set.retainAll(Arrays.asList(s1));
        System.out.println(set);
       }

}
