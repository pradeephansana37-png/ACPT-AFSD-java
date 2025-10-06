import java.util.Scanner;

public class Project21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] depName = new String[5];
        double[][] empSalary = new double[5][12];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter department " + (i + 1) + " name : ");
            depName[i] = scan.next();

            for (int j = 0; j < 12; j++) {
                System.out.print("Enter" + depName[i] + "Employee " + (j + 1) + " salary : ");
                empSalary[i][j] = scan.nextDouble();
            }

        }


///  ///////////////////////////////////

        for (int i = 0; i < 5; i++) {

            double dTotal = 0.0;
            for (int j = 0; j < 12; j++) {
                dTotal += empSalary[i][j];  // dTotal = dTotal+empSalary[i][j]

            }
            System.out.println(depName[i] + " department Average Salary is : " + dTotal / 12);
        }




/// //////////////////////////////////////////


        double maxSalaryDep=0.0;
        int maxSalIndex=0;

        for(int i=0; i<12;i++){
            maxSalaryDep+=empSalary[0][i];
        }


        for (int i=0; i<5; i++){
            double dTotal2=0;

            for (int j=0; j<12; j++){
                dTotal2+=empSalary[i][j];
            }

            if (maxSalaryDep<dTotal2){
                maxSalIndex=i;
            }

        }

        System.out.println("The max Salary department is : " + depName[maxSalIndex]);

    }

}
