import java.util.Scanner;

public class Project13 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name= scan.next();

        System.out.print("Enter your age : ");
        int age= scan.nextInt();

        char firstLetter1= name.charAt(0);
        int f_letter1=firstLetter1;


        for (int i=0; i<10; i++){
            System.out.print("Enter girl " +(i+1)+ " name : ");
            String girlName= scan.next();

            System.out.print("Enter girl " +(i+1)+ " age : ");
            int girlAge= scan.nextInt();

            char firstLetter2= name.charAt(0);
            int f_letter2=firstLetter2;

            if(f_letter1>=f_letter2 && age>girlAge){
                System.out.println("Match");

                break;
            }
            else{
                System.out.println("Not Match");
            }

        }
        System.out.println("sorry");

    }
}
