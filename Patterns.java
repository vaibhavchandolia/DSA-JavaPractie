import java.util.*;

public class Patterns {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int n = 4;
    //int m = 5;
    // inverted half pyramid
    /* for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
        System.out.print(i+ " ");
        }
        System.out.println();
    } */
    // FLoyd's triangle
    /* int n=5;
    int num=1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    } */
    
    //half pyramid only 01
    /* for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else {System.out.print("0");}
        }
        System.out.println();
    } */
    //Solid Rohmbus
    /* for(int i=1; i<=n; i++){
        for(int j=1; j<=(n*2)-1; j++){
            if((i+j)<=n*2 && (i+j)>=n+1){
                System.out.print("*");
            }
            else System.out.print(" ");
        }
        System.out.println();

    } */
    //Inverted half pyramid
    /* for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    } */
    //Butterfly Pattern
    /* for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){
        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        for(int j=2*(n-i); j>=1; j--){
        System.out.print(" ");
        }
        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        System.out.println();
    } */
    //Solid Rohmbus #2
   /*  for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    } */
    //Palindrmic Pyramid
    /* for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=i; j>=1; j--){
            System.out.print(j);
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    } */
    // Diamond
    /* for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        int num = 2*i-1;
        for(int j=1; j<=num; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){
        for(int j=n-i; j>=1; j--){
            System.out.print(" ");
        }
        int num = 2*i-1;
        for(int j=num; j>=1; j--){
            System.out.print("*");
        }
        System.out.println();
    } */
    // Hollow Butterfly
    /* for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){
        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        for(int j=2*(n-i); j>=1; j--){
        System.out.print(" ");
        }
        for(int j=i; j>=1; j--){
            System.out.print("*");
        }
        System.out.println();
    } */
    // Z from *
    for(int i=1; i<=n; i++){
          for(int j=1; j<=n; j++){
                if(i == 1 || i==n){
                    System.out.print("*");
                }
                
                else{
                   if( j == (n+1-i) )
                      System.out.print("* ");
                   else
                      System.out.print(" ");
                }
          }
          System.out.println("");
    }
}
}