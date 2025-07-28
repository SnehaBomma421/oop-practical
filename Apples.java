package lab1;
import java.util.Scanner;
public class Apples {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter apples in Jerry's bag: ");
	        int jerryBag = sc.nextInt();
	        System.out.print("Enter apples in Tom's bag: ");
	        int tomBag = sc.nextInt();
	        System.out.println("Jerry's bag: " + jerryBag);
	        System.out.println("Tom's bag: " + tomBag);
	        int temp = jerryBag;
	        jerryBag = tomBag;
	        tomBag = temp;
	        System.out.println("Jerry's bag: " + jerryBag);
	        System.out.println("Tom's bag: " + tomBag);
	    }
	}



