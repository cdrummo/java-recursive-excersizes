/********************************************************************************
*This program will check if a string is a palindrome using recursion.		*
*										*
*@Author:Connor_Drummond							*
*@Version:September 29, 2019							*
********************************************************************************/

/********************************************************************************
*					Imports					*
********************************************************************************/
import java.util.Scanner;

/********************************************************************************
*					Classes					*
********************************************************************************/

public class Palindrome {
    
    public static boolean palindrome(String input) {
        String cleanerInput = input.toLowerCase().replaceAll("[^0-9a-z]", "");
        
	if (cleanerInput.length() == 0 || cleanerInput.length() == 1) {
            return true;
        }
	else if (cleanerInput.charAt(0) == cleanerInput.charAt(cleanerInput.length() - 1)) {
            return palindrome(cleanerInput.substring(1, cleanerInput.length() - 1));
        }
	else {
            return false;
	}
    }


/********************************************************************************
*					Main					*
********************************************************************************/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check if it is a palindrome:");
        String string = scanner.nextLine();
        
	if(palindrome(string) == true) {
            System.out.println(string + " is a palindrome");
        }
        else {
            System.out.println(string + " is not a palindrome");
        }
    }

}
