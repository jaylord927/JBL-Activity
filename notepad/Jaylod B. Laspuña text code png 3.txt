import java.util.Scanner;

public class activitypng3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
      
        System.out.print("\nEnter a number: ");
        int num1 = scan.nextInt();
        Number(num1);
      
        System.out.print("\nEnter a number: ");
        int num2 = scann.nextInt();
        Number(num2);
     
        System.out.print("\nEnter a number: ");
        int num3 = scan.nextInt();
        Number(num3);

        scan.close();
    }

    public static void Number(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }
    }
}
