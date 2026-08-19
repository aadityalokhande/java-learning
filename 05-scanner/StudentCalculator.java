import java.util.Scanner;

public class StudentCalculator {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name.");
        String name = input.nextLine();

        System.out.println("Enter your first number.");
        int a = input.nextInt();

        System.out.println("Enter your second number.");
        int b = input.nextInt();
        
        System.out.println("Addition =" + (a + b));
        System.out.println("Subtraction =" + (a - b));
        System.out.println("Multiplication =" + (a * b));
        System.out.println("Division =" + (a / b));
        System.out.println("Remainder =" + (a % b));

    }
}
