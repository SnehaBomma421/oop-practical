package lab2;
import java.util.Scanner;
public class Strmethods {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        System.out.println("Character at index 0: " + str.charAt(0));
	        System.out.println("Length of the string: " + str.length());
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        if (str.length() >= 5) {
	            System.out.println("Substring: " + str.substring(1, 4));
	        } else {
	            System.out.println("String too short for substring.");
	        }
	        System.out.println("Does the string contain 'a'? " + str.contains("a"));
	        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
	    }
	}

