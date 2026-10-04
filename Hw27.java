package homewrk;

public class Hw27 {
	static int countOccurrences(String P, String T) {
	    P = P.toLowerCase();
	    T = T.toLowerCase();

	    int count = 0;

	    for (int i = 0; i <= T.length() - P.length(); i++) {
	        if (T.substring(i, i + P.length()).equals(P)) {
	            count++;
	        }
	    }

	    return count;
	}

}
