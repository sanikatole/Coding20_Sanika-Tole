import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        StringBuilder r = new StringBuilder(String.valueOf(n)).reverse();
        int rev = Integer.parseInt(r.toString());
        System.out.print(rev);
    }
}