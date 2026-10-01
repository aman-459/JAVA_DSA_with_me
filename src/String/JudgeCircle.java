package String;

import java.util.Arrays;

public class JudgeCircle {
    public static void main(String[] args) {
        String st = "UD";
        System.out.println(judgeCircle(st));
    }

    public static boolean judgeCircle(String moves) {
        String[] ch = moves.split("");
        int u = 0, d = 0, l = 0, r = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i].equals("U")) u++;
            else if(ch[i].equals("D")) d++;
            else if(ch[i].equals("L")) l++;
            else if(ch[i].equals("R")) r++;
        }
        return (((u - d) == 0) && ((l - r) == 0));
    }
}
