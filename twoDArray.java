import java.util.*;

public class twoDArray {
   
    public static void main(String[] args) {
       // find a given no in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //int x = 5;
        int arr[][]=new int[n][m];

       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            arr[i][j]=sc.nextInt();
        }
       }
       int rowStart=0;
       int rowEnd=n-1;
       int colStart=0;
       int colEnd=m-1;

       while(rowStart<=rowEnd && colStart<=colEnd){
        for(int i=colStart; i<=colEnd; i++){
            System.out.print(arr[rowStart][i]);
        }
        rowStart++;
        for(int j=rowStart; j<=rowEnd; j++){
            System.out.print(arr[j][colEnd]);
        }
        colEnd--;
        for(int i=colEnd; i>=colStart; i++){
            System.out.print(arr[rowEnd][i]);
        }
        rowEnd--;
        for(int j=rowEnd; j>=rowStart; j++){
            System.out.print(arr[j][colStart]);
        }
        colStart++;
        System.out.println();
       }
       
    
       
       


    }
}