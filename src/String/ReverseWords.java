package String;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++) {
            words[i] = swap(words[i]);
        }
        return String.join(" ", words);
    }

    public static String swap(String st) {
        char[] ch = st.toCharArray();
        int i = 0, j = ch.length-1;
        while(i <= j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

}
