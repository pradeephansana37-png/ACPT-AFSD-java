
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first employee's Salary :");
        double salary1= scan.nextDouble();

        System.out.print("Enter the second employee's salary :");
        double salary2= scan.nextDouble();

        System.out.print("Enter the third employee's salary :");
        double salary3= scan.nextDouble();

        System.out.print("Enter the fourth employee's salary :");
        double salary4= scan.nextDouble();

        System.out.println("Average is : "+(salary1+salary2+salary3+salary4)/4);

    }


}
