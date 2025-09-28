import java.util.Scanner;

public class Project10 {
    public static void main(String[] args){

        Scanner scann=new Scanner(System.in);

        System.out.print("Enter the first employee salary : ");
        double salary1 = scann.nextDouble();

        System.out.print("Enter the second employee salary : ");
        double salary2 = scann.nextDouble();

        System.out.print("Enter the third employee salary : ");
        double salary3 = scann.nextDouble();

        System.out.print("Enter the fourth employee salary : ");
        double salary4 = scann.nextDouble();

        System.out.print("Enter the fifth employee salary : ");
        double salary5 = scann.nextDouble();

        System.out.println("Average is: "+ (salary1+salary2+salary3+salary4+salary5)/5);




        /// //////////////////////////////////

        //loops----> for loop, while loop, do-while loop, each loop
        double totalSalary =0.0;

        //for loop
        for (int i=0; i<5; i++){
            System.out.print("Enter employee salary: ");
            totalSalary +=scann.nextDouble();

            if(totalSalary>=100000){  //example
                break;
            }
        }
        System.out.println("average is: " + totalSalary/5);




    }
}
