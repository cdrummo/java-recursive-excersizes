/********************************************************************************
*This class will take a range, starting number and interval from the user, 	*
*and display the log value of numbers in the range over the interval.		*
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

public class Logs {

    public static double logs(double range, double start, double interval, double count){
        if(range == 0){
            System.out.print("Invalid Range!");
            return 0;
        }
        if(range / interval > 1000){
            System.out.print("Interval too small for range!");
            return 0;
        }
        System.out.println("Log10("+ count + ")  =  " + Math.log10(count));
        double cutoff = (start +range);
        count = count + interval;
        if (count >= cutoff){
            System.out.println("Log10("+ count + ")  =  " + Math.log10(count));
            return Math.log10(count);
        }
        else{
            return logs(range, start, interval, count);
        }

    }

/********************************************************************************
*					Main					*
********************************************************************************/

    public static void main(String[] args) {
        double start;
        double range;
        double interval;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired range:");
        String user = scanner.nextLine();
        range = Double.parseDouble(user);
        System.out.println("Enter desired starting point:");
        user = scanner.nextLine();
        start = Double.parseDouble(user);
        System.out.println("Enter desired interval of logs:");
        user = scanner.nextLine();
        interval = Double.parseDouble(user);
        logs(range, start, interval, start);
    }
}
