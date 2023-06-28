import java.util.*;

public class FizzBuzz {

    public static int calculate(int m, int n){
        int count = 0;

        for(int i = m; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                count += i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calculate(m, n));
    }
}
