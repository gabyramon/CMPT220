import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    private HashMap<String, String> stateCapitals;
    private int score;
    private int totalQuestions;
    private String gameMode;

  
    public QuizGame(String mode) {
        this.gameMode = mode;
        this.stateCapitals = new HashMap<>();
        this.stateCapitals.put("Alaska", "Juneau");
        this.stateCapitals.put("New York", "Albany");
        this.stateCapitals.put("Maine", "Augusta");
        this.stateCapitals.put("California", "Sacramento");
        this.stateCapitals.put("Arizona", "Phoenix");
        this.stateCapitals.put("Connecticut", "Hartford");
        this.stateCapitals.put("Kentucky", "Frankfort");
        this.stateCapitals.put("Massachusetts", "Boston");
        this.stateCapitals.put("Oregon", "Salem");
        this.stateCapitals.put("Montana", "Helena");

        this.score = 0;
        this.totalQuestions = 0;
    }

    //Final Score Method
    public void displayFinalScore(int score, int totalQuestions){
        System.out.println("Thanks for playing!"); 
        System.out.println("FINAL SCORE: " + score + "/" + totalQuestions);
        System.exit(0);
    }

    //Classic Mode Method
    public void classicMode(){
        List<String> states = new ArrayList<>(stateCapitals.keySet());
        Collections.shuffle(states);
       
        Scanner sc = new Scanner(System.in);
        for(String state : states){
            System.out.println("What is the capital of "+ state + "?");
            String answer = sc.nextLine().trim();
            totalQuestions++;
                if(stateCapitals.get(state).equalsIgnoreCase(answer)){
                score++;
                System.out.println("Correct!");
                }else{
                System.out.println("Wrong :(");
                }
        }
        displayFinalScore(score, totalQuestions);
        }


        //Timed Mode Method
        public void timedMode(){
            List<String> states = new ArrayList<>(stateCapitals.keySet());
            Collections.shuffle(states);

            Scanner sc = new Scanner(System.in);

            long startTime = System.currentTimeMillis();
            long endTime = startTime + 30000;   // 30 seconds

            for(String state : states){
                if(System.currentTimeMillis() > endTime){
                    System.out.println("Time's up!");
                    break;
                    }
                System.out.println("What is the capital of "+ state + "?");
                String answer2 = sc.nextLine().trim();
                totalQuestions++;
                if(stateCapitals.get(state).equalsIgnoreCase(answer2)){
                    score ++;
                    System.out.println("Correct!");
                }else{
                    System.out.println("Wrong :(");
                    }
                }
            displayFinalScore(score, totalQuestions);

    }
}
