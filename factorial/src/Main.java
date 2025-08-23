import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = input.nextInt();
        int i = 1;
        int result = 1;
        while(i <= num)
        {
            result *= i;
            i++;
        }
        System.out.printf("the factorial of %d = %d\n", num, result);
        input.close();
    }
}