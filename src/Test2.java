import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int val10 = scan.nextInt();

        System.out.println("Enter number 2 : ");
        int val20 = scan.nextInt();

        System.out.println("Enter number 3 : ");
        int val30 = scan.nextInt();

        if(val10>val20 && val30==10){
            System.out.println("hello..");

        }else {
            System.out.println("hi..");
        }




        /// //////////////////////////
        int val=4;
        val+=3; //val=val+3;
        System.out.println(val);

        /// /////////////////////////

        int val2 = 23;
        ++val2;//val2+=1;-----> increment operators(pre and post)
        System.out.println(++val2);

        /// //////////////////////////

        int val3=25;
        System.out.println(++val3);


        /// //////////////////////////
        /// array
        //type safe---->same datatype
        //fixed length

        int age=5;//single
        System.out.println(age);

        int[] ages = new int[10];
        ages[3]=54;
        System.out.println(ages[0]);

        /// /////////////
        for (int i=0;i<10;i++){
            System.out.println("Enter value variable " + i);
            ages[i] = scan.nextInt();
        }

        /// //////////////////////////////
        for (int i=0; i<10; i++){
            System.out.println(ages[i]);
        }





    }
}



