import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) {
        double[] caseValues = {0.01, 1, 5, 10, 25, 50, 75, 100, 
                            200, 300, 400, 500, 750, 1000, 5000,
                            10000, 25000, 50000, 75000, 100000, 200000, 
                            300000, 400000, 500000, 750000, 1000000};
        ArrayList<Double> cases = new ArrayList<>();
        for(double value : caseValues){
            cases.add(value);
        }
        Collections.shuffle(cases);

        Scanner scanner = new Scanner(System.in);


        // Select the first case
        System.out.println("Welcome to Deal or No Deal!");
        System.out.println("Choose your case (1-26): ");
        int selectedCaseIndex = scanner.nextInt() - 1;
        double selectedCaseValue = cases.get(selectedCaseIndex);

        cases.set(selectedCaseIndex, -1.0);


        //Game loop
        int round = 1;
        while(true){
            int remainingCases = 0;
            for(double value : cases){
                if(value != -1.0){
                    remainingCases++;
                }
            }
            if(remainingCases == 1){
                break;
            }

            System.out.println("Round " + round);
            System.out.println("Select a case to open (1-26): ");
            int caseToOpen = scanner.nextInt() -1;

            if(cases.get(caseToOpen) != -1.0){
                System.out.println("You opened case " + (caseToOpen + 1) + " with value: $" + cases.get(caseToOpen));
                cases.set(caseToOpen, -1.0);
            } else {
                System.out.println("Case already opened. Choose another case.");
                continue;
            }

            //Bank Offer
            if(round % 3 ==0){   //checks if round is a multiple of 3
                double sum = 0;
                int count = 0;
                for(double value : cases){
                    if(value != -1.0){
                        sum += value;   // sum = sum+value
                        count ++;

                    }
                    
                }
                double offer = sum/count;
                System.out.println("Banker's offer: $" + offer);
                System.out.println("Deal or No Deal? (1 for Deal, 2 for No Deal)");
                int decision = scanner.nextInt();
                if(decision == 1){
                    System.out.println("You accepted the deal! You win $" + offer);
                    return;
                }
            }
            round++;
        }

        //Last case scenario
        System.out.println("Only one case left. Do you want to keep your case or switch with the remaining case? (1 for switch, 2 for keep)");
        int lastCaseDecision = scanner.nextInt();

        if(lastCaseDecision == 1){
            double remainingCaseValue = 0;
            for(double value : cases){
                if(value != -1.0){
                    remainingCaseValue = value;
                    break;
                }

            }
            System.out.println("You switched your case. You won $" + remainingCaseValue + " (Original case: $" + selectedCaseValue +")");  
        } else {
            System.out.println("You kept your original case. You won $" + selectedCaseValue);
        }



    }
}
