import java.util.*;
public class TableAndSumOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
            sum += n*i;
        }
        System.out.println(sum);
    }
}
