/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/
import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in degree F: ");
        double tempInput = sc.nextInt();
        System.out.println("The temperature in degree C: ");
        System.out.println(tempConverter(tempInput));
    
    }
    public static double tempConverter(double fTemp){
        return((fTemp -32)*5/9) ;
    }

   
}
