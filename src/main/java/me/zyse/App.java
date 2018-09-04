package me.zyse;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input in format #items price stateCode: ");

        int items = scanner.nextInt();
        double price = scanner.nextDouble();
        String state = scanner.next();

        System.out.println("Total Order Price: " + Calculator.calculateTotal(items, price, state));
    }
}
