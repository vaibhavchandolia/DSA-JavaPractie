import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        String original = sc.next();
        String result="";
        for(int i=0; i<original.length(); i++){
            if(original.charAt(i)=='e'){
                result+="i";
            }
            else result+=original.charAt(i);
        }
        

        System.out.println(result); */
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        int a=0;

        for(int i=0; i<=email.length(); i++){
            
            if(email.charAt(i)=='@'){
                a=i-1;
                System.out.println(a);
                //System.out.println(email.substring(0, email.charAt(a)));
            }
            //System.out.println();
        }
    }
    
}
