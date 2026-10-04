package homewrk;
import java.util.*;
public class Hw1 {

	@SuppressWarnings("removal")
	public void Digits(int num){
    ArrayList<Integer> digitList = new ArrayList<Integer>();
    if (num == 0){
    	digitList.add(new Integer(0));
   }
    while (num > 0){
    	digitList.add(0, new Integer(num % 10));
        num /= 10;
    }

   }
}
