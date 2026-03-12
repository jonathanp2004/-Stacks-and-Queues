
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

    LinkedList<Integer> numList = new LinkedList<>();
    LinkedList<String> stringList = new LinkedList<>();
    int currentNum = 0;
    String currentString = "";

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (Character.isDigit(c)){
            currentNum = currentNum * 10 + (c -'0');
        } else if (c == '[') {
             numList.add(0,currentNum);
             stringList.add(0,currentString);

             currentNum = 0;
             currentString = "";

        } else if (Character.isLetter(c)) {

            currentString = currentString + c;
            
        } else if (c == ']') {
            int n = numList.remove(0);
           String m = stringList.remove(0);
           String newString = "";

            for (int j = 0; j < n; j++) {
                newString += currentString;

            }
            currentString = m + newString;

        }
    }
    return currentString;
}






public static void main(String[] args){
    Main main = new Main();

    String s = "{{[[(()<>)]]}}";
    String v = "{[(])}";
    String forDecode = "22[abc]3[cd]ef";

    String result = main.isBalanced(s);
    String result1 = main.isBalanced(v) ;
    String result2 = main.decodeString(forDecode);


    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
}

}
