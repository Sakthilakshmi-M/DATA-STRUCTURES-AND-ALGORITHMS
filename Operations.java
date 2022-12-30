import java.util.*;
public class Operations {
    static Scanner sc = new Scanner(System.in);
    static int n=0;
    public static void main(String[] args)
    {
        System.out.println("Enter capacity of the array: ");
        int capacity = sc.nextInt();
        System.out.println("Enter the number of array elements: ");
        n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[capacity];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Press 1 for Insertion");
        System.out.println("Press 2 for Deletion");
        System.out.println("Press 3 to display the array elements");
        System.out.println("Press 4 to exit");
        while(true)
        {
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                insertion(arr,capacity);
                break;
            case 2:
                deletion(arr,capacity);
                break;
            case 3:
                display(arr);   
                break;
            case 4:
                System.exit(0); 
        }
    }

    }
    static void insertion(int arr[],int capacity)
    {
        if(capacity<=n)
            System.out.println("Array is full");
        else
        {
            System.out.println("Enter the element to be inserted: ");
            int element = sc.nextInt();
            System.out.println("Enter the position to be inserted: ");
            int position = sc.nextInt();
            for(int i=n-1;i>=position;i--)
                arr[i+1]=arr[i];
            arr[position] = element;
            n=n+1;
        }
    }
    static void deletion(int arr[],int capacity)
    {
        if(n<1)
            System.out.println("Array is empty");
        else
        {
            System.out.println("Enter the element to be deleted: ");
            int element = sc.nextInt();
            int position = search(arr,element);
            if(position==-1)
                System.out.println("Element is not present in the array");
            else
            for(int i=position;i<n;i++)
                if(i==capacity-1)
                    break;
                else
                    arr[i]=arr[i+1];
            n=n-1;
        }
    }
    static void display(int arr[])
    {
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
    static int search(int arr[],int key)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==key)
                return i;
        return -1;
    }

}
