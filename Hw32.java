package homewrk;
import java.util.*;
public class Hw32 {
	public static ArrayList<String> findUniqueElements(ArrayList<String> list) {
	    ArrayList<String> result = new ArrayList<>(list);

	    for (int i = 0; i < result.size(); i++) {
	        for (int j = i + 1; j < result.size(); j++) {
	            if (result.get(i).equals(result.get(j))) {
	                result.remove(j);
	                j--;
	            }
	        }
	    }

	    return result;
	}

}
