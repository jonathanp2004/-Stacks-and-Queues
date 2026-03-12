
import java.util.LinkedList;


public class Main {


public String isBalanced(String s){
    LinkedList<Character> list = new LinkedList<>();

    for (int i = 0; i < s.length() ; i++) {
        char c = s.charAt(i);
        if(c == '(' || c == '{' || c== '[' || c == '<' || c == '¿'){
            list.add(0,c);
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

public String decodeString(String s){

    return null;
}






public static void main(String[] args){
    Main main = new Main();

    String s = "{{[[(()<>)]]}}";
    String v = "{[(])}";
    String h = "{[()]}";

    String result = main.isBalanced(s);
    String result1 = main.isBalanced(v) ;
    String result2 = main.isBalanced(h);


    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
}

}
