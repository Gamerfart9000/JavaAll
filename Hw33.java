package homewrk;

public class Hw33 {

	public static void find(String s, int i, String result) {
		if (i == s.length()) {
			System.out.println(result);
			return;
		}

		char c = s.charAt(i);

		if (Character.isLetter(c)) {
			find(s, i + 1, result + Character.toLowerCase(c));
			find(s, i + 1, result + Character.toUpperCase(c));
		} else {
			find(s, i + 1, result + c);
		}
	}

	public static void main(String[] args) {
		String s = "a1b2";
		find(s, 0, "");
	}
}
