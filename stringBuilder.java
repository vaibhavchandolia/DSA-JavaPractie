import java.util.*;

public class stringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        StringBuilder sb = new StringBuilder(sc.nextLine());
        //System.out.println(sb);
        //String result="";
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }
            //else result+=sb.charAt(i);
        }
        System.out.println(sb);

    }        
}