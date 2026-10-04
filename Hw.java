package homewrk;

public class Hw {
	 static void countSubstrings(String s, int k) {
	        for (int i = 0; i <= s.length() - k; i++) {
	            String sub = s.substring(i, i + k);
	            int count = 0;

	            for (int j = 0; j <= s.length() - k; j++) {
	                if (s.substring(j, j + k).equals(sub)) {
	                    count++;
	                }
	            }

	            System.out.println(sub + " " + count);
	        }
	    }

	    
	    }


