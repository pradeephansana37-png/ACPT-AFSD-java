import java.util.Scanner;

public class Project16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scan.nextInt();


        while (number>0){

            System.out.println("The digit number is :" + number%10);
            number=number/10;


        }

    }
}


/// ////////////////////
//do-while loop

//int num2=12;

//do{
  //  System.out.println("hi..");
    //    }while(num2>5);
