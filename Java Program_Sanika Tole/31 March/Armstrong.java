import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
    public static void main(String args[])
    {
        int c=0, s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int t1 = n;
        while(t1!=0)
        {
            c++;
            t1 = t1/10;
        }
        int t2 = n;
        while(t2!=0)
        {
            int d = t2%10;
            s = s+(int)Math.pow(d,c);
            t2 = t2/10;
        }
        if(n==s)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("Not Armstrong");
        }
    }
}