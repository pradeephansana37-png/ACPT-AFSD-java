import java.util.Scanner;

public class Project08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        String dbEmail = "admin@gmail.com";
        int dbPassword = 12345;


        System.out.print("Enter email : ");
        String dbEmail2 = scan.next();

        System.out.print("Enter your password : ");
        int dbPassword2 = scan.nextInt();

        if(dbEmail.equals(dbEmail2) && dbPassword==dbPassword2){
            System.out.println("Loggin Success");
        }else{
            System.out.println("Loggin Failed");
        }



    }
}
