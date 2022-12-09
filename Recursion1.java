import java.util.Scanner;

public class Recursion1 {
    /* public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calcFactorial(n-1);
        int fact_N=n*fact_nm1;
        return fact_N;
    } */
    /* public static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    } */
    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //time complexity = log n
        if(n%2 == 0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else return calcPower(x, n/2)*calcPower(x, n/2)*x;
        // time complexity = n
        /* int powerNm1 = calcPower(x, n-1);
        int powerN = x * powerNm1;
        return powerN; */
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans); 
    }
}
