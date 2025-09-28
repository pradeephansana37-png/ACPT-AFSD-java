
import java.util.Scanner;


public class Test {
    public static void main(String [] arg){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name :");
        String name = scan.next();

        System.out.print("Enter age :");
        int age = scan.nextInt();

        if (age>18) {
            System.out.println("You are eligible");

        }else {
            System.out.println("You are not eligible");
        }

    }
}
