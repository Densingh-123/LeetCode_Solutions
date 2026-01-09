import java.util.*;
class Main {
    public static void main(String[] args) {
        valid("(}");
        System.out.println();
        valid("()()()");
        System.out.println();
        valid("()(}}}");
        System.out.println();
        valid("{}[]");
        System.out.println();
        valid("[)]}");
    }
    public static void valid(String s){
        Stack<Character> st = new Stack<>();
       for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch == '['){
            st.push(ch);
        }else{
            if(st.isEmpty()){
                System.out.print("not a valid paraenthesis..");
                break;
            }
            char top = st.pop();
            if((ch==')' && top !='(') || 
            (ch=='}' && top!= '{') ||
            (ch==']' && top!='[')){
                System.out.print("not a valid paraenthesis..");
                break;
            }else{
                 System.out.print("it is an valid paraenthesis..");
                break;
            }
        }
       }
    }
}
