import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        /*
         * This reads the input provided by user using keyboard-
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First integer: ");
        // This method reads the number provided using keyboard
        int number1 = scan.nextInt();

        // checking if integer is positive or not
        while (number1 < 0) {
            System.out.print("Number must be positive integer. Enter First integer:  ");
            number1 = scan.nextInt();
        }

        System.out.print("Enter second integer: ");
        int number2 = scan.nextInt();

        while (number2 < 0) {
            System.out.print("Number must be positive integer. Enter second integer:  ");
            number2 = scan.nextInt();
        }

        System.out.print("Enter third integer: ");
        int number3 = scan.nextInt();

        while (number3 < 0) {
            System.out.print("Number must be positive integer. Enter third integer:  ");
            number3 = scan.nextInt();
        }

        System.out.print("Enter fourth integer: ");
        int number4 = scan.nextInt();

        while (number4 < 0) {
            System.out.print("Number must be positive integer. Enter fourth integer:  ");
            number4 = scan.nextInt();
        }

        // Closing Scanner after the use
        scan.close();

        // Calculating average and casting float to a integer value
        float average = (float) (number1 + number2 + number3 + number4) / 4;

        // Displaying the average result
        System.out.printf("The average is %.2f\n", average);
    }
}
