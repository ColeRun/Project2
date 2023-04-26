package edu.guilford;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    //make a scanner
    static Scanner scan = new Scanner(System.in);
    public static void main( String[] args )
    {

       //get user input for numerator and denominator
        System.out.println("Enter numerator");
        int n = scan.nextInt();
        System.out.println("Enter denominator");
        int d = scan.nextInt();
        //create a rational object with the user input
        Rational r = new Rational(n, d);
        //ask what they expect the added value to be with another rational object
        Rational r2 = new Rational();
        System.out.println(" The two fractions are " + r + " and " + r2);
        System.out.println("What do you expect the added value to be?");
        //get user input for the expected value as a String
        String expected = scan.next();
        

        System.out.println("Testing addition of rational numbers");
        System.out.println(" Your answer is " + expected);
        //add the two rational objects
        r.add(r2);
        //print the result
        System.out.println(" The programs result is " + r);

        
    }
}
