//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the capital of New York? ");
        String capital = sc.nextLine();

         if (capital.equals("Albany")){
            System.out.println("You are correct! 1 point.");
         }else {
            System.out.println("Wrong, try again. 0 points");
         }

         System.out.println("What is the capital of Maine? ");
         String Mcapital = sc.nextLine();

         if (Mcapital.equals("Augusta")){
            System.out.println("You are correct! 2 points.");
         }else {
            System.out.println("Wrong, try again");
         }

         System.out.println("What is the capital of Kansas? ");
         String Kcapital = sc.nextLine();

         if (Kcapital.equals("Topeka")){
            System.out.println("You are correct! 3 points.");
         }else {
            System.out.println("Wrong, try again");
         }

         System.out.println("Thank you for playing! ");



    }
}


