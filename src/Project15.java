import java.util.Scanner;

public class Project15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = scan.next();


        System.out.print("Enter age : ");
        int age = scan.nextInt();

        while (age>100){
            System.out.print("Re enter age : ");
            age= scan.nextInt();
        }

        System.out.print("Enter address : ");
        String adres = scan.next();

        System.out.print("Enter telephone no : ");
        String tele= scan.next();


    }
}
