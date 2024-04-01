import java.util.*;
class Commonelements
{
    public static void main(String args[])
    {
        int arr1[] = {4,5,6,7,8};
        int arr2[] = {3,7,8,9,2};
        List<Integer>commonElements = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    commonElements.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.print("Common Elements are: " + commonElements);
    }
}