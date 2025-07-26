package testapp1;

import java.util.Scanner;

public class Testapp1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float tm;
        float tp;

        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        System.out.print("Enter marks in science: ");
        float science = scan.nextFloat();

        System.out.print("Enter marks in history: ");
        float history = scan.nextFloat();

        System.out.print("Enter marks in math: ");
        float math = scan.nextFloat();

        System.out.print("Enter marks in soc: ");
        float soc = scan.nextFloat();

        System.out.print("Enter marks in arts: ");
        float arts = scan.nextFloat();

        tm = science + history + math + soc + arts;
        System.out.print("\nTotal Marks: " + tm);

        tp = (tm / 500.0f) * 100;
        System.out.printf("\nTotal Percentage: %.2f", tp);

        if (tp <= 100.00 && tp >= 91.00) {
            System.out.print("\nRemark: Excellent");
        } else if (tp <= 90.99 && tp >= 86) {
            System.out.print("\nRemark: Very Good");
        } else if (tp <= 85.99 && tp >= 81) {
            System.out.print("\nRemark: Good");
        } else if (tp <= 80.99 && tp >= 76) {
            System.out.print("\nRemark: Fair");
        } else if (tp <= 75.99 && tp >= 71) {
            System.out.print("\nRemark: Poor");
        } else {
            System.out.print("\nRemarks: Failed");
        }

        if (tp > 70) {
            System.out.println("\n\nCongrats " + name + ", you Passed.");
        } else {
            System.out.println("\n\nYou failed. Be better next time.");
        }
    }
}
