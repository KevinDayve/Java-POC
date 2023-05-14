package DSA;

import java.util.ArrayList;

public class LexSort {
    public static void main(String[] args) {

    }
    //Function to return the lexicographically sorted power-set of the string.
     static ArrayList<String> powerSet(String s) {
        ArrayList list = new ArrayList<>();
        int i = 0;
        String curr = "";
        helper(s, list, curr, i);
        return list;
    }
    static void helper(String s, ArrayList<String> list, String curr, int i) {
        if (i == s.length()) {
            list.add(curr);
            return;
        }
        helper(s, list, curr, i+1);
        helper(s, list, curr+s.charAt(i), i+1);
    }
}
