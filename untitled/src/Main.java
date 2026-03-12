
import java.util.LinkedList;


public class Main {


public String isBalanced(String s){
    LinkedList<Character> list = new LinkedList<>();

    for (int i = 0; i < s.length() ; i++) {
        char c = s.charAt(i);
        if(c == '(' || c == '{' || c== '[' || c == '<' || c == '¿'){
            list.add(c);
        } else if(c == ')' || c == '}' || c== ']' || c == '>' || c == '?'){
            if(list.isEmpty()){
                return "NO";
            } else if( list.peek() == '(' && c == ')' || list.peek() == '{' && c == '}'
                    ||list.peek() == '[' && c == ']'|| list.peek() == '<' && c == '>'|| list.peek() == '¿' && c == '?'){
                list.remove();
            }else{
                return "NO";
            }

        }

    }
    if(list.isEmpty()){
        return "YES";
    }else{
        return "NO";
    }
}


public static void main(String[] args){
    Main main = new Main();

    String =

}

}
