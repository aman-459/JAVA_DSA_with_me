package String;

public class NumOfStrings {
    public static void main(String[] args) {
        String st = "aaaaabbbbb";
        String[] patterns = {"a","b","c"};
        System.out.println(st.contains("m"));
        System.out.println(numOfStrings(patterns, st));
    }
    public static int numOfStrings(String[] ptrn, String word) {
        int count = 0;
        for(int i = 0; i < ptrn.length; i++) {
            if(word.contains(ptrn[i])) count++;
        }
        return count;
    }
}
