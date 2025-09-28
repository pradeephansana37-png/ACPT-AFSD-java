import java.util.Scanner;

public class Project14 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        String email1 = "admin@gmail.com";
        int password1 = 12345;


        System.out.print("Enter your email : ");
        String email2 = scan.next();

        System.out.print("Enter your password : ");
        int password2= scan.nextInt();

        if (email2.equals(email1) && password1==password2){
            System.out.print("How many peoples do you meet?");
            int metPeople=scan.nextInt();


            String dSim="dialog";
            String mSim="mobitel";
            String aSim="Airtel";

            int dialogCount=0;
            int mobitelCount=0;
            int airtelCount=0;

            for(int i=0; i<metPeople; i++){
                System.out.print("People no: "+(i+1)+ " - How many sim cards do you use? ");
                int sim= scan.nextInt();

                for(int j=0; j<sim; j++){
                    System.out.print("what is the sim card" + (j+1)+ " name? ");
                    String simName = scan.next();

                    if(simName.equals(dSim)){
                        dialogCount+=1;
                    }else if(simName.equals(mSim)){
                        mobitelCount+=1;
                    }else{
                        airtelCount+=1;
                    }

                }
            }

            if(dialogCount>=mobitelCount && dialogCount>=airtelCount){
                System.out.println("The most popular sim is: "+ dSim);
            } else if (mobitelCount>=dialogCount &&mobitelCount>=airtelCount) {
                System.out.println("The most popular sim is: "+ mSim);
            } else if (airtelCount>=dialogCount && airtelCount>=mobitelCount)
                System.out.println("The most popular sim is: "+ aSim);
            }


        else {
            System.out.println("Try again");
        }



        /// //////////////////////////////////
        //while loop

        //  int val=45;
        // while(val>20){
        //System.out.println("hello");
        //}

        //if(true){
        //break;
        //}















    }
}
