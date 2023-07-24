import java.util.Random;
public class dataPoints {
    public static void main(String[] args) {
        int[] dataPoints;
        int sum = 0;

        dataPoints = new int[100];
        Random Randomizer = new Random();
        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = Randomizer.nextInt(0,100)+1;
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        System.out.println("\nThe sum of all the numbers is "+ sum);
    }
}