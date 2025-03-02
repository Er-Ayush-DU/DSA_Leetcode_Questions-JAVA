package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balanced_bracket {
    public static Boolean isBalance(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size()==0) return false;
                if (st.peek() == '(') st.pop();

            }
        }
        if(st.size()>0) return false;
        else return true;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        for(int i=1; i<=100; i++){
        System.out.print("Type the Brackets: ");
        
        String str = sc.nextLine();
        System.out.println(isBalance(str));
    }
}
}