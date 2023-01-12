import java.util.Scanner;
public class ReverseArray {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    reverse(arr,n);  
   }

   static void reverse(int arr[],int n)
   {
    int end = n-1;
    for(int i=0;i<end;i++)
    {
        int temp = arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        end--;
    }
    for(int i=0;i<n;i++)
        System.out.println(arr[i]);

   }
}
