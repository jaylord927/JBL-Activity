
import java.util.Scanner;

public class activitypng2 {

    public static void main(String[] args) {
        Scanner instance1 = new Scanner(System.in);
        Scanner instance2 = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int number1 = instance1.nextInt();
        Number(number1);

        System.out.print("\nEnter a number: ");
        int number2 = instance2.nextInt();
        Number(number2);

        System.out.print("\nEnter a number: ");
        int number3 = instance1.nextInt();
        Number(number3);

        instance1.close();
        instance2.close();
    }

    public static void Number(int num) {
        if (num == 0) {
            System.out.println("Inputted number Zero");
        } else if (num % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
}
