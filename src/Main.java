import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthMonth = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your birth month as a number (1-12): ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
        }

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("The number you have entered is invalid: " + birthMonth);
        }
    }
}