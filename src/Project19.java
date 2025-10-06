import java.util.Scanner;

public class Project19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double[] salary = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter employee " + (i + 1) + " salary :");
            salary[i] = scan.nextDouble();

        }



        double[] newSalary = new double[8];
        for(int i=0; i<8; i++) {
            if (salary[i]>130000){
                newSalary[i]= (salary[i]+(salary[i]*12)/100);

            }else{
                newSalary[i]=salary[i];
            }

        }


        double incrementSalary=0;
        for(int i=0; i<8; i++) {
            incrementSalary=newSalary[i]-salary[i];
        }


        System.out.println("The increment salary is "+incrementSalary);










    }
}









/////  ////////////////////////////
//int[ ar] = new int[7];
//System.out/println(ar);
//
//int[] ar2 ar;
//
/////  //////////////////////////
//
//int[][] studentMarks = new int [20][4];
//studentMarks[0][2]=56;



//////////////////////////////
//for (int i=0; i<20; i++){
//    for (int j=0;j<4;j++){
//        studentMarks[i][j]=45;
//        }
//    }