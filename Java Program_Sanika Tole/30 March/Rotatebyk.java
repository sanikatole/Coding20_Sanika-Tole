// 13. Program to rotate array elements by Kth position left

class RotateLeftK
{
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 4;
        int[] temp;
        temp =  new int[n];
        for(int i=0; i< k; i++)
            temp[i] = arr[i];

        int x = k;
        for(int i=0; x < n; i++){
            arr[i] = arr[x++];
        }
         x = 0;
        for(int i=n-k; i<n; i++)
            arr[i] = temp[x++];

        for (int i = 0; i < 7; i++)
            System.out.print(arr[i] + " ");
    }
}