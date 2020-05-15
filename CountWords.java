import java.util.StringTokenizer;

public class CountWords {
	public static void main(String...args) {
		String s="Java is great";
		StringTokenizer st= new StringTokenizer(s,", /n/t");
		System.out.println(st.countTokens());
	}
}
