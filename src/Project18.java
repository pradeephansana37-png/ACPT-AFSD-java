import java.util.Scanner;

public class Project18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] runScore = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter player " + (i + 1) + " Score :");
            runScore[i] = scan.nextInt();
        }



        double avgScore;
        int totalScore = 0;
        for (int i = 0; i < 11; i++) {
            totalScore += runScore[i];
        }
        System.out.println("The average score is : " + totalScore / 11);





        int highScore = runScore[0];
        for (int i = 0; i < 11; i++) {
            if (runScore[i] > highScore) {
                highScore = runScore[i];

            }

        }

        System.out.println("Higest score is : " + highScore);
    }
}






