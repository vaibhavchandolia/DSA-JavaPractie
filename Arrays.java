import java.util.*;

public class Arrays {
    /* public static void sorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            //int temp=arr[i+1];
            if(arr[i]>=arr[i+1]){
                System.out.println("Not sorted!");
                return;
            }
           }
           System.out.println("Sorted");
    } */

    public static int missing(int arr[]){
        /* [1,4,7,9,3,2,5,0,6] */
        int n=0;
        for(int i=arr.length; i>0; i--){
            for(int j=0; j<arr.length; i++){

                if(arr[j]<1 && arr[j]==i){
                    i=n;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       //int x = 5;
       int arr[][]=new int[rows][cols];

       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            arr[i][j]=sc.nextInt();
        }
       } */
       //int x = sc.nextInt();
       //System.out.println(arr[0][1]);
       
       /* for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            int temp;
            temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
        //System.out.println();
       } */
       /* for(int j=0; j<rows; j++){
        for(int i=0; i<cols; i++){
            System.out.print(arr[i][j]+" ");e
        }
        System.out.println();
       } */
       /* Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int arr[][] = new int [n][m];
       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            arr[i][j]=sc.nextInt();
        }
       }
    
       int count=0;
       for(int i=0; i<n; i++){
        
        for(int j=0; j<m; j++){
            if(arr[i][j]==0){
                count++;
            }
        }
       }
       if(count>(n*m)/2){
        System.out.println("It is a sparse matrix");
       }
       else System.out.println("It is not a sparse matrix"); */
    
       //System.out.println(count);
       /* int i=0;
       for(;;i++){
        System.out.println(i);
       }

    }

    public static void sort(int[] arr) {
    } */
       
       int arr[] = {1,2,3,4,5,6,0,8,9};
       System.out.println(missing(arr));
       
}
}
    
