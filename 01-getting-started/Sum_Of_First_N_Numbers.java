import java.util.Scanner;

class Sum_Of_First_N_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Find out the sum of the first N natural numbers!");
        System.out.print("Enter the Nth number: ");
        int checkNum = input.nextInt();

        System.out.println((checkNum * (checkNum + 1)) / 2);
    }
}