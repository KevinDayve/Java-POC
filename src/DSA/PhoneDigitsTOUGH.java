package DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDigitsTOUGH {
    public static void main(String[] args) {

    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> res = new ArrayList<>();
        if (N == 0) {
            return res;
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        track(a, 0, map, new StringBuilder(), res);
        return res;
    }
    private static void track(int[] a, int i, HashMap<Integer, String> map, StringBuilder sb,
                              ArrayList<String> res) {
        if (sb.length() == a.length) {
            res.add(sb.toString());
            return;
        }
        String element = map.get(a[i]);

        for (int j = 0; j < element.length(); j++) {
            sb.append(element.charAt(j));
            track(a, i+1, map, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
