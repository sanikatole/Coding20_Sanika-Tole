import java.util.*;
class Missing
{
    public static void main(String args[])
    {
        int numbers[] = {1,2,3,5,6,7};
        int total_num = 7;
        int num_sum = 0;
        int expected_num_sum = total_num * ((total_num+1)/2);
        for(int i: numbers)
        {
            num_sum+=i;
        }
        System.out.println("Missing number is: " + (expected_num_sum - num_sum));
    }
}