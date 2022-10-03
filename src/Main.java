import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String trash = "";
        double gasTank = 0;
        double fuelEfficiency = 0;
        double gallonPrice = 0;
        double efficiency100 = 0;
        double priceTank = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("Enter how much gas is currently in your tank in gallons: ");

        if(in.hasNextDouble())
        {
            gasTank = in.nextDouble();
        }
        else
        {
            System.out.println("You said your car has: " + trash);
            System.out.println("Run the program again with a correct amount.");
            System.exit(0);
        }

        System.out.print("Enter your cars fuel efficiency in miles per gallon: ");

        if(in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
        }
        else
        {
            System.out.println("You said your car has: " + trash);
            System.out.println("Run the program again with a correct amount.");
            System.exit(0);
        }

        System.out.print("Enter how much gas costs per gallon: ");

        if(in.hasNextDouble())
        {
            gallonPrice = in.nextDouble();
        }
        else
        {
            System.out.println("You said your car has: " + trash);
            System.out.println("Run the program again with a correct amount.");
            System.exit(0);
        }

        efficiency100 = 100 / fuelEfficiency;
        priceTank = fuelEfficiency * gasTank;

        System.out.println("Per 100 miles the fuel efficiency will be " + efficiency100);
        System.out.println("With the amount of gas in your tank you will make it " + priceTank + "miles");

    }
}