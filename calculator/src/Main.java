import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        System.out.print("Enter the digit of your operation :");
        String operation = input.next();
        switch(operation)
        {
            case "+" : System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
                break;
            case "-" : System.out.printf("%d - %d = %d\n",num1, num2, num1 - num2);
                break;
            case "x" : System.out.printf("%d * %d = %d\n",num1, num2, num1 * num2);
                break;
            case "/" :
                if(num2 <= 0)
                {
                    System.out.printf("Cannot divide by zero\n");
                }
                else
                {
                    System.out.printf("%d / %d = %d\n",num1, num2, num1 / num2);
                }
                break;
            default: System.out.println("Error404!");
        }
        input.close();
    }
}