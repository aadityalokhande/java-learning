import java.util.Scanner;

public class UserInfo{
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name.");
        String name = input.nextLine();
         
        System.out.println("Enter your Age.");
        int age = input.nextInt();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" year old.");

    }
}
