
public class MathOperation {
    public static void main(String[] args) {
        // decleration
        float firstfloatingpoint = 10.32f;
        float secondfloatingpoint = 5.3f;

        // Calculating sum difference and product
        float sum = firstfloatingpoint + secondfloatingpoint;
        float diff = firstfloatingpoint - secondfloatingpoint;
        float product = firstfloatingpoint * secondfloatingpoint;

        // Displaying the result
        System.out.printf("The number are %.2f,%.2f\n", firstfloatingpoint, secondfloatingpoint);
        System.out.printf("Their sum is %.2f\n", sum);
        System.out.printf("Their difference is %.2f\n", diff);
        System.out.printf("Their product is %.2f\n", product);
    }
}
