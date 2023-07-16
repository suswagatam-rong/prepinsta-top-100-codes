import java.util.Scanner;

class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check if your number is odd or even!");
        System.out.print("Enter a number: ");
        int checkNum = input.nextInt();

        if (checkNum % 2 == 0) {
            System.out.println("It is an even number.");
        }
        else {
            System.out.println("It is an odd number.");
        }
    }
}