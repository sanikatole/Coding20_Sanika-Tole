import java.util.*;
class Evenoddcount
{
    public static void main(String args[])
    {
    int a[] = {4,5,6,2};
    Scanner sc = new Scanner(System.in);
    int evencount=0, oddcount=0;
    System.out.println("Original array: " + Arrays.toString(a));
    for(int i=0;i<a.length;i++)
    {
        if(a[i]%2==0)
        {
            evencount ++;
        }
        else
        {
           oddcount ++;
        }
    }
    System.out.println("Number of even elements: " + evencount);
    System.out.println("Number of odd elements: " + oddcount);
    
}
}