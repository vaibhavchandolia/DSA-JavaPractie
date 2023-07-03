import java.util.*;

public class PalindromeNumber {

    public static int palindrome(int a){
        int rem = 0;
        int div = a;
        while(div != 0){
            int r = div%10;
            rem = (rem * 10) + r;
            div = div/10;
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=n; i<=m; i++){
            if(i==palindrome(i)) System.out.println(i);
        }
    }
}
