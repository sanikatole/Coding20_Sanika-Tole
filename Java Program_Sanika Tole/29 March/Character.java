import java.util.*;
class Character
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z]","");
        System.out.print("String with only alphabets: " + str);
    }
}