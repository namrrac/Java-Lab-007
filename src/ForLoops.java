/**
 * @author Jason Carr
 * @author Trevor Hartman
 * @date 3/6/2023
 * @since ver 1.0
 *
 * In the ForLoops class, create a method named forSum
 * that calculates the sum 1+2+3+...+n where n is given as user input:
 *
 * Example output will look like below:
 * Number? 8
 * The sum is 36
 * In the ForLoops class, create a method named rangeSum t
 * that sums a range/interval of numbers, and prints the range.
 * Your program should not care if the smaller or larger numbers are entered first:
 *
 * Example output will look like below:
 * Number? 8
 * Number? 3
 * The sum is: 33
 * The sum in the above example is the result of: 3 + 4 + 5 + 6 + 7 + 8
 * In the ForLoops class, implement a method named factorial
 * that calculates the factorial of a number read in from System.in:
 *
 * e.g. 9 Factorial means: 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
 * Example output will look like below:
 * Number: 9
 * Factorial: 362880
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int sum = 0;
        System.out.print("Enter the number to calculate the sum: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("The sum is: %s %n", sum);

    }

    public static void rangeSum() {
        int sum = 0;
        System.out.println("Lets find the sum of a range!");
        System.out.print("Enter the first number of the range: ");
        int a = s.nextInt(); //assigning scanner input s tp first variable
        System.out.print("Enter the 2nd number: ");
        int b = s.nextInt();//get variable # 2
        int min = Math.min(a, b);//set the smallest variable (a b) to variable min
        int max = Math.max(a, b);//set the largest variable (a b) to variable max
        for (int i = min; i <= max; i++) { //loop that runs between the min and max
            sum += i;  //assign sum to total of i + sum
        }
        System.out.printf("The sum is: %s %n", sum); //print the sum
        System.out.print("The sum in the above example is the result of: "); //print prompt

        for (int i = min; i <= max; i++) { //same loop as above
            System.out.printf("%s ", i); //prints i
            if (i < max) { //new loop to only run till the number before the last to avoid a redundant +
                System.out.printf("+ ");
            }
        }
        System.out.println();

    }

    public static void factorial() {
        int num = 1;
        System.out.print("What number would you like to factorial: ");
        int fact = s.nextInt();
        System.out.printf("Number: %s%n", fact);
        for (int i = 1; i <= fact; i++) {
            num *= i;
        }
        System.out.printf("Factorial: %s", (num));
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
