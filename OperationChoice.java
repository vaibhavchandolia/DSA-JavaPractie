import java.util.Scanner;

public class OperationChoice {

    public static int opChoice(int a, int b, int c){
        int res = 0;
        if(c==1) res=a+b;
        else if(c==2) res=a-b;
        else if(c==3) res=a*b;
        else if(c==4) res=a/b;

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(opChoice(a, b, c));
    }
}
