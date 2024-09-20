/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: "); //Asking the user to input a string
        String input = sc.nextLine(); //Saving the user input into the variable input
        

        for(int i = 0; i < input.length(); i++){ 
        //Used a for loop bc we know when the loop will stop (length of inputed string), starts at first letter of input (index 0)
            String word = "";  //Within the loop, created a varible word with an empty string 
            word = word + input.charAt(i);  // to the empty string, the loop added the ith letter of input
            System.out.println(word);  // printed word with the ith letter
            // This loop is repeated for the next letter of the inputed string
            //So each loop prints out one letter, and continues to print out each letter on a new line each time
        }

    }  
}
