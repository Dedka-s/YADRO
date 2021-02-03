import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yadro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(checkString(str));
    }

    public static boolean checkString(String str) {
        List<Character> brackets = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(' || str.charAt(i)=='[' ||  str.charAt(i)=='{'){
                brackets.add(str.charAt(i));
            }

            if (str.charAt(i)==')'){
                if (brackets.get(brackets.size()-1)!='(') {
                    return false;
                }
                brackets.remove(brackets.size()-1);
            }

            if ( str.charAt(i)==']'){
                if (brackets.get(brackets.size()-1)!='[') {
                    return false;
                }
                brackets.remove(brackets.size()-1);
            }

            if (str.charAt(i)=='}'){
                if (brackets.get(brackets.size()-1)!='{') {
                    return false;
                }
                brackets.remove(brackets.size()-1);
            }

        }
        if (brackets.size() != 0) {
            return false;
        }
        return true;
    }
}
