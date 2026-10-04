package homewrk;
import java.util.*;

class Main {

    static List<List<String>> result = new ArrayList<>();

    static void solve(String s, int start, List<String> list) {

        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < s.length(); i++) {

            String str = s.substring(start, i + 1);

            if (isPalindrome(str)) {
                list.add(str);
                solve(s, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "aab";

        solve(s, 0, new ArrayList<>());

        System.out.println(result);
    }
}


