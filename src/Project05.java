
import java.util.Scanner;

public class Project05 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter boy's age :");
        double boyAge = scan.nextDouble();

        System.out.print("Enter girl's age :");
        double girlAge = scan.nextDouble();

        if(boyAge>girlAge){

            System.out.print("Enter boy's name :");
            String boyName = scan.next();

            System.out.print("Enter girl's name :");
            String girlName = scan.next();


            char firstLetter1= boyName.charAt(0);
            int f_letter1=firstLetter1;

            char firstLetter2= girlName.charAt(0);
            int f_letter2=firstLetter2;

            if (firstLetter1>firstLetter2){
                System.out.println("Definitely Marry.");
            }else{
                System.out.println("Maybe.");
            }

        } else if (boyAge==girlAge) {
            System.out.println("Think again");

        }else if (boyAge<girlAge){
            System.out.println("Can't marry.");
        }


    }


}
