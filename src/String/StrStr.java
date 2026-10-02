package String;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr2(String haystack, String needle) {
        int idx = haystack.indexOf(needle);
        if(idx != -1) return idx;
        return -1;
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0; i <= n-m; i++) {
            if(haystack.substring(i, i+m).equals(needle)) return i;
        }
        return -1;
    }


}
