import java.util.Stack;

public class Reverse_Words_In_A_String_without_reversing_String {
    public static String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder out = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)!=' ') {
                st.push(s.charAt(i));
            } else {
                while (!st.isEmpty()) {
                    out.append(st.pop());
                }
                out.append(" ");
            }
        }
        while (!st.isEmpty()) {
            out.append(st.pop());
        }
        return out.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String p = reverseWords(s);
        System.out.println(p);
    }
}
