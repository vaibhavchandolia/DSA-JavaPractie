import java.util.*;

public class replaceChar {

    public static void replaceCharacter(String str, char ch1, char ch2){
        String res = "";
        for (int i=0; i<str.length(); i++){
//            if(str.charAt(i) == ch1 || str.charAt(i) == ch2){
                if(str.charAt(i) == ch1) {
                    res = res + ch2;
                }
                else if(str.charAt(i) == ch2) {
                    res = res + ch1;
                }
                else res = res + str.charAt(i);
//            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        replaceCharacter(str, ch1, ch2);
    }
}
