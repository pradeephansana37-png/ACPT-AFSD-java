
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter monthly salary : ");
        double salary= scan.nextDouble();

        System.out.print("Enter profit of land :");
        double land= scan.nextDouble();

        System.out.print("Enter kudu profit :");
        double kudu= scan.nextDouble();

        if(salary>=115000){
            salary = salary-(salary/100*14);


        }

        if (kudu>0){
            kudu = kudu / 2;

        }

        System.out.println("Your final income is : "+ (salary+kudu+land));

    }
}
