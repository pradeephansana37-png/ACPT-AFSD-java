import java.util.Scanner;

public class Project07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = scan.next();

        System.out.print("Enter age : ");
        int age = scan.nextInt();

        System.out.print("Is married? : ");
        boolean status = scan.nextBoolean();

        if(age>=18){

            char firstLetter= name.charAt(0);
            int f_letter=firstLetter;

            if (f_letter>=70 && status){
                System.out.println("You are Eligible");
            }else{
                System.out.println("You are not Eligible");
            }


        }else {
            System.out.println("You are not Eligible. Your age is not enough");
        }
    }
}
