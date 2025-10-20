
import java.util.Arrays;

public class ArrayRowAverage {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35},
                {5, 5, 5, 5, 5},
                {100}
        };

        calculateAndPrintRowAverages(matrix);
    }

    public static void calculateAndPrintRowAverages(int[][] array) {
        if (array == null) {
            System.out.println("The array is null.");
            return;
        }

        System.out.println("Calculating averages for each row...");

        for (int i = 0; i < array.length; i++) {
            double sum = 0;

            if (array[i] == null || array[i].length == 0) {
                System.out.println("Row " + i + " is empty or null, cannot calculate average.");
                continue;
            }

            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            double average = sum / array[i].length;
            System.out.println("Average of row " + i + ": " + average);
        }
    }
}
