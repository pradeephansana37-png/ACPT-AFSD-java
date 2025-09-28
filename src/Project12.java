import java.util.Scanner;

public class Project12 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        double totalTax=0.0;

        for(int i=0; i<12; i++){
            System.out.print("Enter employee " +(i+1)+" salary : ");
            double salary= scan.nextDouble();

            if(salary>130000){
                double tax =(salary*14)/100;
                totalTax+=tax;

            }

        }
        System.out.println("Total tax is : " + totalTax);

    }
}




/// ///////////////////////////
//12 employees
// salary greater than 130000 tax.
//total tax.






