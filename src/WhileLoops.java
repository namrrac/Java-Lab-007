/**
 * @author Jason Carr
 * @author Trevor Hartman
 * @date 3/6/2023
 * @since ver 1.0
 *
 * In the WhileLoops class, write a method named eoCount that
 * contains a while loop that reads in integers from System.in,
 * and counts the even and odd numbers separately.
 * In the WhileLoops class, write a method named mean that contains a
 * while loop that reads in integers from System.in and calculates
 * the mean of the numbers entered.
 */

import java.util.Scanner;
import java.io.IOException;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        String l;
        int i = 1;
        int limit = 1;
        int limit2 = (limit - 1);
        System.out.println("This will print out all the odd or even numbers to your limit.");
        System.out.print("What is the limit: ");
        limit = Integer.parseInt(s.nextLine());
        while (limit >= 1) {
            System.out.printf("%s ", limit);
            if (limit % 2 == 0) {
                limit = limit - 2;
            } else {
                limit = limit - 2;
            }
            }
        System.out.println();
        }


    public static void mean() {
        String i;
        double sum = 0.0;
        int count = 0;
        System.out.printf("This will calculate the average,%n" +
                "press ENTER with no input to end: ");
        while(s.hasNextLine() && !((i = s.nextLine()).equals(""))){
            try {
                sum += Integer.parseInt(i);
                count++;
            } catch (NumberFormatException nfe) {}
            System.out.printf("%.2f / %s = %.2f%n", sum , count , (sum/count));
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}

