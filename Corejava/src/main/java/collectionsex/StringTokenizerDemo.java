package collectionsex;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "This is core java Applications";
		StringTokenizer st = new StringTokenizer(str," ");
		int wordCount = 0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			++wordCount;
		}
		System.out.println("Number of words = "+wordCount);

	}

}
