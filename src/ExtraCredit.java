import java.util.Random;
import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        int[] dataPoints;
        Random Randomizer = new Random();
        Scanner in = new Scanner(System.in);

        dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = Randomizer.nextInt(0, 100) + 1;
        }
        System.out.println("\nThe min of the data points is " + min(dataPoints));
        System.out.println("\nThe max of the data points is " + max(dataPoints));
        System.out.println("\nThe occurance of the number 17 in the data points is "
                + occuranceScan(dataPoints, 17));
        System.out.println("\nThe sum of the data points is " + sum(dataPoints));
        System.out.println("\nData points has the number 17 in it " +
                contains(dataPoints,17)); 
    }  // END OF MAIN
    public static int min(int values[]){
        int min = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }
    public static int max(int values[]){
        int max = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }
    public static int occuranceScan(int values[], int target){
        int counter = 0;

        for(int i = 0; i < values.length; i++){
            if(values[i] == target){
                counter += 1;
            }
        }
        return counter;
    }
    public static int sum(int values[]){
        int sum = 0;

        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }
    public static boolean contains(int values[], int target){
        boolean contains = false;

        for(int i = 0; i < values.length; i++){
            if(values[i] == target){
                contains = true;
                break;
            }
        }
        return contains;
    }
}
