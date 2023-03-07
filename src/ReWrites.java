/**
 * @author Jason Carr
 * @author Trevor Hartman
 * @date 3/6/2023
 * @since ver 1.0
 *
 * In a class named ReWrites, rewrite the while
 * loops in the sumRewrite method without the
 * break condition and the boolean true in the parenthesis.
 *
 * In a class named ReWrites, rewrite the while
 * loops in the avgRewrite method as a for loop instead of a while loop.
 */

import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        double sum = 0.0;
        System.out.println("Ths program will calculate the average of numbers entered");
        System.out.println("How many numbers do you want to average type 0 to exit?");
        int count = s.nextInt();
        //int count = Integer.parseInt(s.nextLine());
        if (count == 0) {
            System.out.println();
        }
        else {
        for (int i = 1; i <= count; i++) {
            System.out.printf("Please enter a number: ");
            sum += s.nextDouble();
            }
            System.out.printf("Average is: %.2f%n", (sum/count));
        }

        /**
        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {}
        }*/
    }

    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;

        while (x != 0) {
            try {
                if(x == 0) {
                    //break;
                }
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}