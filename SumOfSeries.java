/********************************************************************************
*This program will add the sum of the series 1/k using recursion.               *
*                                                                               *
* @Author: Connor_Drummond                                                      *
* @Version: September 29, 2019                                                  *
********************************************************************************/


/********************************************************************************
*					Imports					*
********************************************************************************/
import java.util.Scanner;

/********************************************************************************
*					Classes					*
********************************************************************************/

public class SumOfSeries {
    public static double sum (int k) {
        if (k== 0) {
            return 0;
        }
        else if (k == 1) {
            return 1;
        }
	else {
        double pos = (k % 2) == 0 ? 1 : -1;
        return (1 / (pos * k)) + sum(k-1);
	}
    }

/********************************************************************************
*					Main					*
********************************************************************************/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of summations desired:");
        String numberFetch = scanner.nextLine();
        int k = Integer.parseInt(numberFetch);

        System.out.print("Sum is " + sum(k));
    }
}
