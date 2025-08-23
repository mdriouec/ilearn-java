import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int x = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random number of range 1 to 100 :");
        int num = input.nextInt();
        if(x == num)
        {
            System.out.println("The number is equal to the number you entered.");
        }else if(x < num)
        {
            System.out.println("The number is less than the number you entered.");
        }else if(x > num)
        {
            System.out.println("The number is greater than the number you entered.");
        }
        input.close();
    }
}