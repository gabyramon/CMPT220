/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    System.out.println("Problem 2");
    System.out.println("Enter a number and I will tell you the fatorial: ");
    Integer numInput = sc.nextInt();
    System.out.println(factorial(numInput));

    System.out.println("Problem 3");
    System.out.println("Enter a number and I will tell you the sum of every other number: ");
    int sumNum = sc.nextInt();
    System.out.println(printSum(sumNum)); 

    System.out.println("Problem 5");
    System.out.println("Enter a string: ");
    String stringInput = sc.nextLine();
    System.out.println(Reverse(stringInput));
      
    }

    //reference method 1
    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }

    //reference method 2
    public static void printDog(){
        System.out.println("Dog");
    }

    //factorial method
    public static int factorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num ; i++){
            factorial = factorial*i;
        }
        return factorial;
    }

    //sum of every other num method 
    public static int printSum(int xyz){
        int sum = 0;
        for(int i = 1; i<=xyz; i+=2){
            sum = sum + i;
        }
        return sum;  
    }

    //reverse string method
    public static String Reverse(String word){
        String reverse = "";
        for(int i = 0;i < word.length(); i++){
            reverse = word.charAt(i) + reverse;
        }
        return reverse;
    }



}
