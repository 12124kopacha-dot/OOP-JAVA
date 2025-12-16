import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task 1 ");
        for (double x = -2; x <= 3.0; x += 0.2)
        {
            double sqrt = 3 * x * x + 8 * x;

            if (sqrt < 0)
            {
                System.out.println("x = " + x + "   помилка (підкореневий вираз < 0)");
            }
            else
            {
                double y = Math.sqrt(sqrt);
                System.out.println("x = " + x + "   y = " + y);
            }
        }

        System.out.println("__________________________________________");

        for (double x = 5; x <= 7.0; x += 0.15)
        {
            double y;

            if (x < 6)
            {
                y = x * Math.sqrt(x * x + 4);
            }
            else
            {
                y = Math.pow(Math.sin(x + 1), 3);
            }

            System.out.println("x = " + x + "   y = " + y);
        }

        System.out.println("\nTask 2");
        int counter = 0;
        int rows = 10;
        int cols = 10;
        int[][] M = new int[rows][cols];
        Random rand = new Random();

        // Вивід матриці
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                M[i][j] = rand.nextInt(9);  // [-60; 119]
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        // Побічна діагональ
        System.out.println("\nПобічна діагональ:");
        for (int i = 0; i < rows; i++)
        {
            System.out.print(M[i][cols - i - 1] + "\t");
        }
        System.out.println();

        // Підрахунок від'ємних на головній діагоналі
        for (int i = 0; i < rows; i++)
        {
            if (M[i][i] < 0)
                counter++;
        }

        System.out.println("\nКількість відʼємних елементів на головній діагоналі: " + counter);
    }
}
