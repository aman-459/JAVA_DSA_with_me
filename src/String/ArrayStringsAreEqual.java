package String;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join(" ", word1);
        String str2 = String.join(" ", word2);
        String st1 = str1.replace(" ", "");
        String st2 = str2.replace(" ", "");
        if(st1.length() != st2.length()) return false;
        int i = 0;
        while(i < st1.length()) {
            if(st1.charAt(i) != st2.charAt(i)) return false;
            else i++;
        }
        return true;

    }
}
