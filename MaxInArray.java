import java.util.Scanner;

public class MaxInArray {
    public static void maxArray(int[] arr, int n){
        int max=arr[0];
        int idx=0;
        for(int i=0; i<n-1; i++){
            if(arr[i] < arr[i+1]) {
                max = arr[i+1];
                idx = i+1;
            };
        }
        System.out.print(max + " ");
        System.out.print(idx);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxArray(arr, n);
    }
}
