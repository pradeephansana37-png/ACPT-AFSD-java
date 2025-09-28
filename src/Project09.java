import java.util.Scanner;

public class Project09 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String email = "admin@gmail.com";
        int password = 12345;


        System.out.print("Enter your email : ");
        String email2 = scan.next();

        System.out.print("Enter your password : ");
        int password2 = scan.nextInt();

        if(email.equals(email2) && password==password2){

            System.out.print("Enter your name : ");
            String name = scan.next();

            System.out.print("Enter your age : ");
            int age= scan.nextInt();

            System.out.print("Enter Your lagnaya : ");
            String lagna=scan.next();

            if(age>=18){

                char firstLetter=name.charAt(0);
                int f_letter=firstLetter;


                String result;
                if (f_letter%2==1) {
                    result = "වාසනාවන්තයි..";
                }else{
                    result = "අවාසනාවන්තයි..";
                }





                switch (lagna) {
                       case "මේෂ":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය යහපත් ඇසුර සහ යහපත් ආර්ථිකයක් වේ.");
                           break;

                       case "වෘෂභ":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය අන් අයගේ සිත් දිනා ගනී වේ.");
                           break;

                       case "මිථුන":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම් වේ.");
                           break;

                       case "කටක":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි. වේ.");
                           break;

                       case "සිංහ":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය වස්තුව සහ සැප සම්පත් ලඟා වේ වේ.");
                           break;

                       case "කන්යා":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම වේ.");
                           break;


                       case "තුලා":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය. වේ.");
                           break;


                       case "වෘශ්චික":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය වාහය අපේක්ෂකයින් ශුභයි වේ.");
                           break;

                       case "ධනු":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය වේ.");
                           break;

                       case "මකර":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය අධ්යාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට වේ.");
                           break;

                       case "කුම්භ":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය පවුලේ සමගිය සහ සතුට වේ.");
                           break;


                       case "මීන":
                           System.out.println(name + result + "ඕබේ ලග්න පලාපලය ඔබේ දක්ෂතා ක්රියාවෙන්ම ඔප්පු කර පෙන්වීමට වේ.");
                           break;

                    default:
                        System.out.println("invalid");

                }

            }else{
                System.out.println("Your age is not enough");
            }




        }else{
            System.out.println("Login Failed");
        }


    }
}
