
// 19.Find the index of two array elements whose sum is equal to the given value

import java.util.*;
class Add
{
public static void main(String[] args)
{
int[] a = {51, 16, 33, 2, 14, 21};
int[] b = {33, 9, 56, 21, 39, 21};
int[] c = new int[a.length];
if(a.length==b.length)
{
 for (int i = 0 ,j=0,k=0; i < a.length; i++,j++,k++)
{
  c[k] = a[i] + b[j];
}
System.out.println("Resultant array is:");
System.out.println(Arrays.toString(c));
}
else
{
System.out.println("Length of both array should be same");
}
}
}