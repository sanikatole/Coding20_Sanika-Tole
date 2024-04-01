import java.util.*;
class pallindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        StringBuilder r = new StringBuilder(String.valueOf(n)).reverse();
        int rev = Integer.parseInt(r.toString());
        if(n==rev)
        {
            System.out.print("Number is pallindrome");
        }
        else
        {
            System.out.print("Number is not pallindrome");
        }

    }
}