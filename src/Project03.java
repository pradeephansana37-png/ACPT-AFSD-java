


import java.util.Scanner;

public class Project03 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter boy's name :");
        String boyName = scan.next();

        System.out.print("Enter girl's name :");
        String girlName = scan.next();



        char firstLetter= boyName.charAt(0);
        int f_letter=firstLetter;
        System.out.println("The boy lucky num is : " +(f_letter));


        char lastLetter= girlName.charAt(girlName.length()-1);
        int l_letter=lastLetter;
        System.out.println("The girl lucky number is : " +(l_letter));


        System.out.println( "The lucky number is : " + ((f_letter+l_letter)/2));








    }
}
