package String;

public class Interpret {
    public static void main(String[] args) {
        String st = "G()()()()(al)";
        System.out.println(interpret(st));

    }

    public static String interpret(String cmd) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cmd.length(); i++) {
            if(cmd.charAt(i) == '(' && cmd.charAt(i+1) == ')') {
                sb.append('o');
                i++;
            } else if (cmd.charAt(i) == '(' && cmd.charAt(i+1) == 'a' && cmd.charAt(i+2) == 'l' && cmd.charAt(i+3) == ')') {
                sb.append('a').append('l');
                i += 3;
            } else {
                sb.append(cmd.charAt(i));
            }

        }
        return sb.toString();
    }
}
