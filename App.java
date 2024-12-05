import java.io.*;
import java.util.*;

// Main
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("GUESS THE STATE CAPITAL QUIIZ GAME");
        System.out.println("Please enter your name to start game: ");
        String name = sc.nextLine();

        //Write user name to file
        File nameFile = new File("name.txt");
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("name.txt", false));
            writer.write(name);
            writer.close();
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

        //Read user name from file to display welcome messsage
        String playerName = "";
        try{
            Scanner input = new Scanner(nameFile);
            while(input.hasNext()){
                playerName = input.nextLine(); 
                System.out.println("Welcome " + playerName + "!");
            } 
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

        //Game starts
        System.out.println("Select your game mode: Classic Mode (1) or Timed Mode (2)");
        
        while(sc.hasNext()){
            String modeChoice = sc.nextLine();
            QuizGame game = null;

            if(modeChoice.equals("1")){
                System.out.println("Welcome to Classic Mode");
                System.out.println("You will be given a series of questions to answer. Ready to begin? (y/n)");
                
                String beginClassic = sc.nextLine();
                    if(beginClassic.equals("y")){
                        game = new QuizGame("Classic");
                        game.classicMode();
                    }else if(beginClassic.equals("n")){
                        System.out.println("Select your game mode: Classic Mode (1) or Timed Mode (2)");
                    }
                    else{
                        System.out.println("Please enter y or n");
                    }
            }else if(modeChoice.equals("2")){
                System.out.println("Welcome to Timed Mode");
                System.out.println("You will have 30 seconds to answer as many questions as you can. Ready to begin? (y/n)");
                String beginTimed = sc.nextLine();
                    if(beginTimed.equals("y")){
                        game = new QuizGame("Timed");
                        game.timedMode();   
                    }else if(beginTimed.equals("n")){
                        System.out.println("Select your game mode: Classic Mode (1) or Timed Mode (2)");
                    }else{
                        System.out.println("Please enter y or n");
                    }
            }else {
                System.out.println("Please enter 1 or 2.");   
                }
            
            }
            
        }
    }


      
   




    




