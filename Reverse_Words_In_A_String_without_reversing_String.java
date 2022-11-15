import java.util.Stack;

public class Reverse_Words_In_A_String_without_reversing_String {
    public static String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        String out = "";

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)!=' ') {
                st.push(s.charAt(i));
            } else {
                while (st.isEmpty()==false) {
                    out = out + st.pop();
                }
                out = out + " ";
            }
        }
        while (st.isEmpty()==false) {
            out = out + st.pop();
        }
        return out;
    }

    public static void main(String args[]) {
        String s = "the sky is blue";
        String p = reverseWords(s);
        System.out.println(p);
    }
}
