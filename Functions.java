import java.util.*;

public class Functions {
    public static void power(int n){ 
        int a=0; int b=1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=1; i<=n; i++){
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
        }
            System.out.println();
        }

    }   
     
            
    private int solve(int n1,int n2,int n3,HashSet<Integer> hset){


        for(int i = 1;i <= n1;i++){
            for(int j = 1;j <= n2;j++) {
                for(int k = 0;k <= n3;k++){
                    
                }
            }
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        int n = sc.nextInt();
        power(  n);
}
}
