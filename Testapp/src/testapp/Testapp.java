package testapp;

import java.util.Scanner;

public class Testapp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tm;
        double tp;
       double tpp;
        
        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        System.out.print("Enter marks in science: ");
        int science = scan.nextInt();

        System.out.print("Enter marks in history: ");
        int history = scan.nextInt();

        System.out.print("Enter marks in math: ");
        int math = scan.nextInt();

        System.out.print("Enter marks in soc: ");
        int soc = scan.nextInt();

        System.out.print("Enter marks in arts: ");
        int arts = scan.nextInt();

        tm = science + history + math + soc + arts;
        System.out.print("Total Marks: " + tm);

        tp = tm / 5;
        System.out.print("\nTotal Percentage: " + tp);
                                   
        if (tpp <= 100 && tpp >= 91) {
            System.out.print("\nExcellent");
        } 
        
        else if (tp <= 90 && tp >= 86) {
            System.out.print("Very Good");
        } 
        else if (tp <= 81 && tp >= 85) {
            System.out.print("Good");
        } 
        else if (tp <= 80 && tp >= 76) {
            System.out.print("Fair");
        } 
        else if (tp <= 75 && tp >= 71) {
            System.out.print("Poor");
        } 
        else {
            System.out.print("Fail");
        }
                System.out.println("\nRemarks: " + tp);
        
        
        if(tp > 70){
            System.out.println("\nCongrats " + name + " you Passed. ");
        }
        else {
            System.out.println("\nCongrats be better next time. ");
        }
    }
