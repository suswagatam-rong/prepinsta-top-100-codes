
import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check if your number is a positive or negative number!");
        System.out.print("Enter a number: ");
        int checkNum = input.nextInt();

        if (checkNum < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}