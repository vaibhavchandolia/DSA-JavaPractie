import java.util.*;
import java.util.Arrays;
class Main
{
//  public static int ProductSmallestPair(int sum, int n, int[] arr){
//    if(n<2) return -1;
//    int num2=0;
//    Arrays.sort(arr);
//    int num1 = arr[0];
//    if(num1>sum) return 0;
//
//    for(int i=0; i<n-1; i++){
//      if(arr[i]!=num1){ num2=arr[i]; break;}
//    }
//
//    if(num1+num2 <= sum) return num1*num2;
//    else return 0;
//  }

  public static int productSmallestPair (int arr[], int n, int sum)
  {
    if (n <2)
      return -1;
    int ans, temp, check;
    for (int i = 0; i < n; i++)
    {
      for (int j = i + 1; j < n; j++)
      {
        if (arr[i] > arr[j])
        {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    check = arr[0] + arr[1];
    if (check <= sum)
      return arr[0] * arr[1];
    else
      return 0;
  }


    public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int sum = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){arr[i] = sc.nextInt();}
    System.out.println (productSmallestPair(arr, n, sum));
  }
}