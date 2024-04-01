import java.util.*;
class Duplicate
{
    public static void main(String args[])
    {
        int a[] = {5,6,7,3,5,6,7,9};
        Set<Integer>Set1 = new HashSet<>();
        Set<Integer>Set2 = new HashSet<>();
        for(int i=0;i<=a.length-1;i++)
        {
            if(Set1.add(a[i]))
            {
                Set2.add(a[i]);
            }
        }
        System.out.print(Set2);
    }
}