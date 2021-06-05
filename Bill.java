import java.util.Scanner;

public class Bill {

  public static void main(String[] args) {

    /*
     * This reads the input provided by user using keyboard-
     */
    Scanner scan = new Scanner(System.in);
    System.out.print("------------------[Print Receipt]------------\n");
    System.out.print("-  Enter the quantity: ");

    // This method reads the number provided using keyboard
    float numberofquantity = scan.nextFloat();

    System.out.print("-  Enter the unit price: ");
    float unitprice = scan.nextFloat();

    System.out.print("-  Enter tax rate: ");
    float taxrate = scan.nextFloat();

    // Closing Scanner after the use
    scan.close();

    // Calculating sub total
    float subtotal = numberofquantity * unitprice;

    // Displaying the multiplication result
    System.out.printf("-  Subtotals: %s%.2f\n", "$", subtotal);

    // calcuating tax amount
    float taxamount = subtotal / 100 * taxrate;
    System.out.printf("-  Tax: %s%.2f at %.2f%s\n", "$", taxamount, taxrate, "%");

    float totalamount = taxamount + subtotal;
    System.out.printf("-  Total: %s%.2f\n", "$", totalamount);

    System.out.print("---------------------------------------------\n");
  }
}
