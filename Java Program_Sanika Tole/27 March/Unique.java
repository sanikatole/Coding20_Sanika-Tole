import java.util.*;
class Unique
{
    public static void main(String args[])
    {
        int arr[] = {5,6,2,6,4,2,3,8,3};
        Set<Integer>Set = new HashSet<>();
        for(int i=0;i<arr.length-1;i++)
        {
           Set.add(arr[i]);
        }
        System.out.print(Set);
    }
}