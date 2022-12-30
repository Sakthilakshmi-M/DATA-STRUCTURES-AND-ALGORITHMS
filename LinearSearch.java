import java.util.*;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of array elements ");
        int n = scan.nextInt();
        System.out.println("Enter the number of array elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("Enter the element to be searched: ");
        int key = scan.nextInt();
        int res = linearSearch(arr,n,key);
        if(res==-1)
            System.out.println("Element not found");
        else
            System.out.printf("Element is found at index %d",res);
        scan.close();
    }
    static int linearSearch(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==key)
            return i;
        return-1;
    }
}