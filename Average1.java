public class Average1 {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 5;
        int number3 = 8;
        int number4 = 6;

        // Calculating average and casting float to a integer value
        float average = (float) (number1 + number2 + number3 + number4) / 4;

        // Displaying the average result

        System.out.printf("The average of integers %d,%d,%d,%d is: %4.2f\n", number1, number2, number3, number4,
                average);
    }
}
