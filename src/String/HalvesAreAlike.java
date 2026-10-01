package String;

import java.util.Locale;

public class HalvesAreAlike {
    public static void main(String[] args) {
        //String st = "book";
        String st = "textbook";


        System.out.println(halvesAreAlike(st));
    }
    public static boolean halvesAreAlike(String st) {
        String s = st.toLowerCase();
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);
        int aCount = 0;
        int bCount = 0;
        for(int i = 0; i < n/2; i++) {
           if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') aCount++;
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u') bCount++;
        }
        if(aCount != bCount) return false;
        return true;
    }
}
