
import java.util.Scanner;

public class Project20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] holderName = new String[13];
        int[] accountNumber = new int[13];
        double[] ammount = new double[13];


        for (int i = 0; i < 2; i++) {
            System.out.print("Enter holder " + (i + 1) + " name : ");
            holderName[i] = scan.next();

            System.out.print("Enter holder " + (i + 1) + " account no :  ");
            accountNumber[i] = scan.nextInt();

            System.out.print("Enter holder " + (i + 1) + " ammount :  ");
            ammount[i] = scan.nextDouble();
        }


//            System.out.print("Choose Diposite or Withdraw ? ");
//            String choosen=scan.next();


//            double newDepo=0;
//            double newWith=0;
//
//                if (choosen.equals("diposit")){
//                    System.out.print("Enter deposit amount : ");
//                    newDepo= scan.nextDouble();
//
//                    ammount[i]= ammount[i]+ newDepo;
//                    System.out.println("Your now  account balance is : " + ammount[i]);
//                    System.out.println("Your account no. is : " + accountNumber[i]);
//
//
//                }else{
//                    System.out.print("Enter withdraw amount : ");
//                    newWith= scan.nextDouble();
//
//                    ammount[i]= ammount[i]- newWith;
//                    System.out.println("Your now  account balance is : " +ammount[i]);
//                    System.out.println("Your account no. is : " + accountNumber[i]);
//                }


        double newDepo = 0;
        double newWith = 0;

        while (true) {

            System.out.print("Choose Diposite or Withdraw ? ");
            String choosen = scan.next();


            if (choosen.equals("diposit")) {
                System.out.print("Re enter your account no. : ");
                int reAccount = scan.nextInt();

                for (int i = 0; i < 2; i++) {
                    if (accountNumber[i] == reAccount) {
                        System.out.print((i + 1) + " Enter deposit amount : ");
                        newDepo = scan.nextDouble();

                        ammount[i] = ammount[i] + newDepo;
                        System.out.println("Your now  account balance is : " + ammount[i]);

                    } else {
                        System.out.println("invalid..");
                    }

                }
            } else {

                System.out.print("Re enter your account no. : ");
                int reAccount = scan.nextInt();

                for (int i = 0; i < 2; i++) {
                    if (accountNumber[i] == reAccount) {

                        System.out.print((i + 1) + " Enter withdraw amount : ");
                        newWith = scan.nextDouble();

                        ammount[i] = ammount[i] - newWith;
                        System.out.println("Your now  account balance is : " + ammount[i]);

                    }else{
                        System.out.println("invalid.");
                    }


                }


            }
        }
    }
}


























