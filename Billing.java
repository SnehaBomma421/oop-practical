package lab1;
import java.util.Scanner;
public class Billing {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the base amount of the bill: ");
	        double baseAmount = sc.nextDouble();
	        System.out.print("Enter GST amount: ");
	        double gst = sc.nextDouble();

	        System.out.print("Enter maintenance charges: ");
	        double maintenance = sc.nextDouble();

	        double total = baseAmount + gst + maintenance;

	        double discountRate = (total > 1000) ? 0.10 : 0.05;
	        double discount = total * discountRate;
	        double finalBill = total - discount;

	        System.out.println("\n--- Bill Details ---");
	        System.out.println("Base Amount: " + baseAmount);
	        System.out.println("GST: " + gst);
	        System.out.println("Maintenance: " + maintenance);
	        System.out.println("Total (Before Discount): " + total);
	        System.out.println("Discount (" + (discountRate * 100) + "%): " + discount);
	        System.out.println("Final Bill: " + finalBill);
	    }
	}



