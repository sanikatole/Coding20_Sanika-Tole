import java.util.*;
class Order
{
    public static void printOrder(int arr[], int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int j=n-1;j>=n/2;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,3,2,1,7,8,9,6};
        int n = arr.length;
        printOrder(arr,n);
    }
}