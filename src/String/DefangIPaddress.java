package String;

public class DefangIPaddress {
    public static void main(String[] args) {
        String st = "1.1.1.1";
        System.out.println(defangIPaddr(st));
    }
    public static String defangIPaddr(String str) {
        StringBuilder st = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.') {
                st.append('[').append('.').append(']');
            } else {
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
}
