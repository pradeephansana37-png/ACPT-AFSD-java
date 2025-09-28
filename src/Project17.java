import java.util.Scanner;

public class Project17 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String[] subjects = new String[9];
        int[]marks=new int[9];


        for(int i=0; i<9; i++){
            System.out.print("Enter subject "+ (i+1) +" name : ");
            subjects[i]= scan.next();

            System.out.print("Enter subject "+ (i+1) +" mark : ");
            marks[i]= scan.nextInt();

        }


        int maxMark= marks[0];
        int maxMarkIndex=0;

        for(int i=0; i<9; i++){
            if(marks[i]> maxMark){
                maxMark=marks[i];
                maxMarkIndex=i;
            }

        }
        System.out.println("max marked subject is : " + subjects[maxMarkIndex]);



        int totalMark=0;
        for(int j=0; j<9; j++){
            totalMark+=marks[j];
        }
        double avgMark= (double) totalMark;
        System.out.print("The average marks : " + avgMark/9);


    }
}
