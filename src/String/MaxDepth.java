package String;

public class MaxDepth {
    public static void main(String[] args) {
    String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c == '('){
                count++;
                if(max<count)
                    max=count;
            }else if(c ==')'){
                count--;
            }
        }


        return max;
    }
}
