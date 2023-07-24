import java.util.Random;
import java.util.Scanner;
public class LinearScan {
    public static void main(String[] args) {
        int[] dataPoints;
        int low = 0;
        int high = 0;
        boolean found = false; // see if Scanner found to output not found message
        Random Randomizer = new Random();
        Scanner in = new Scanner(System.in);


        int userGuess = SafeInput.getRangedInt(in, "Enter a guess", 1,100);

        dataPoints = new int[100];
        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = Randomizer.nextInt(0,100)+1;
            System.out.print(dataPoints[i] + " | ");
        }
        for(int i = 0; i < dataPoints.length; i++) {
            if (userGuess == dataPoints[i]) {
                System.out.println("\nYour guess of " + userGuess +" was found at location " + i );
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("\nYour Guess of " + userGuess + " was not found.");
        }
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] < low){
                low = dataPoints[i];
            }
            if(dataPoints[i] > high){
                high = dataPoints[i];
            }
        }
        System.out.println("\nThe low in the list was " + low + " the high was " + high);
        System.out.println("\nThe average of the list is " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        double avg = 0.0;
        double sum = 0.0;

        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        avg = sum / values.length;
        return avg;
    }
}
