

import java.util.Scanner;


public class Project02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first businessman's august month salary :");
        double salary1= scan.nextDouble();

        System.out.print("Enter the second businessman's august month salary :");
        double salary2= scan.nextDouble();

        System.out.print("Enter the third businessman's august month salary :");
        double salary3= scan.nextDouble();

        System.out.print("Enter the fourth businessman's august month salary :");
        double salary4= scan.nextDouble();

        System.out.println("First businessman's  average monthly income is : "+ (salary1/31));
        System.out.println("Second businessman's  average monthly income is : "+ (salary2/31));
        System.out.println("Third businessman's  average monthly income is : "+ (salary3/31));
        System.out.println("Fourth businessman's  average monthly income is : "+ (salary4/31));


        double tax1= (salary1*13)/100;
        System.out.println("First businessman tax is : " + (tax1));

        double tax2= (salary2*13)/100;
        System.out.println("Second businessman tax is : " + (tax2));

        double tax3= (salary3*13)/100;
        System.out.println("Third businessman tax is : " + (tax3));

        double tax4= (salary4*13)/100;
        System.out.println("Fourth businessman tax is : " + (tax4));


        System.out.println("Total tax value is : " + (tax1+tax2+tax3+tax4));

        System.out.println("feat example-03");
    }
}
