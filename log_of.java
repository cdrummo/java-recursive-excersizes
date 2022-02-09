/********************************************************************************
*This class will take the log of two numbers and compare			*
*it to a number, until the logs are within 0.001 accuracy;			*
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

public class log_of {

    static double x = 1.0;                              //lower search range
    static double logX = 0;                             //known lower log
    static double y = 1000;                             //upper search range
    static double logY = 3;                             //known upper log

    public static double log_of (double input, double x, double y) {
        double j = input;                               //desired value
        /*makes sure desired value is within parameters*/
        if (j < 1 || j > 1000){
            System.out.print("Invalid number");
            return 0;
        }
        double k = Math.sqrt(x * y);                    //calculates k
        double logK = (logX + logY) / 2;                //calculates log of k
        
	/*Sets y and its log to k if k is greater than desired value*/
        if (j < k) {
            y = k;
            logY = logK;
        }
        
	/*Sets x and its log to k if k is less than desired value*/
        if (j > k) {
            x = k;
            logX = logK;
        }
        
	/*if k is within 0.001 accuracy of desired value, it ends search*/
        if (Math.abs(j - k) <= 0.001) {
            System.out.println("k = " + k + "\t \t log(k) = " + logK);
            System.out.println("Log of " + j + " is approximately " +logK);
            return logK;
        }
        System.out.println("k = " + k + "\t \t log(k) = " + logK);
        return log_of(j, x, y);                         //recursion
    }

/********************************************************************************
*					Main					*
********************************************************************************/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1.0 - 1000:");
        String user = scanner.nextLine();
        double ans = Double.parseDouble(user);
        log_of(ans, x, y);
    }
}
