import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int firstterm = 0, secondterm = 1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(firstterm + ",");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
        
    }
}