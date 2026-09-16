package Arrays1;

import java.util.Arrays;


public class PangramSentence {
    public static void main(String[] args) {
        //String st = "thequickbrownfoxjumpsoverthelazydog";
        String st = " /";
        char ch[] = st.toLowerCase().toCharArray();
        for(int i = 'a'; i <= 'z'; i++) {
            int c = 0;
            for(int j = 0; j < ch.length; j++) {
                if(i == ch[j]+0) c++;
            }
            if(c == 0) {
                System.out.println("Not");
                return;
            }
        }
        System.out.print("This is Pangram ");

        int[] arr = {'a', 'b', 'c', 'd', 'y', 'z'};
        //System.out.println(Arrays.toString((ch)));

    }
}
