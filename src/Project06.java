
import java.util.Scanner;

public class Project06 {
    public static void main(String [] args){

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter age :");
            double age1 = scan.nextDouble();

            if(age1>=60){
                System.out.println("You are old.");
            }
            else if (age1>=25){
                System.out.println("You are adult.");
            }

            else if (age1>=12){
                System.out.println("You are Younger.");

            }

            else if(age1>0) {
                System.out.println("You are child.");

            }


    }


    }
