package String;

import java.lang.foreign.StructLayout;
import java.util.ArrayList;

public class SortSentence {
    public static void main(String[] args) {
        String st = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(st));
    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for(String word: words) {
            int idx = word.charAt(word.length()-1) - '0';
            ans[idx - 1] = word.substring(0, word.length()-1);
        }

        return String.join(" ", ans);
    }
}


