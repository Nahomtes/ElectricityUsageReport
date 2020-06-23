import java.text.NumberFormat;
import java.util.Scanner;
public class ElectricityUsageReport {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Number: ");
        int customerNumber = scanner.nextInt();

        System.out.println("Enter Customer Name: ");
        String customerName = scanner.next();

        System.out.println("Enter electricity used this month: ");
        double electricityUsage = scanner.nextDouble();
        double over200HoursBill = 0.0;
	
	scanner.close();

        if (electricityUsage > 200) {
            double over200Hours = electricityUsage - 200;
            over200HoursBill = over200Hours * 8;
        }
        double electricityBill = (200 * 8) + over200HoursBill;

        System.out.printf("%s with (%d) customer number has used (%.2f) kilowatt. Total electricity bill is: "
                        + NumberFormat.getCurrencyInstance().format(electricityBill) ,
                        customerName, customerNumber, electricityUsage);

    }
}
