import java.util.Scanner;

public class Project11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email = "admin@gmail.com";
        int password = 12345;


        System.out.print("Enter your email : ");
        String email2 = scan.next();


        boolean isLoginsuccess=false;

        for (int i=0; i<5; i++){
            System.out.print("Enter your password : ");
            int password2 = scan.nextInt();

                if(email.equals(email2) && password2 == password){
                System.out.println("You are in..");
                isLoginsuccess=true;
                break;
                }
                if (i==4){
                System.out.println("System locked.");
                break;
                }

            System.out.println("Try again..");

        }

        if (isLoginsuccess){
            //logical part
        }











    }

}

