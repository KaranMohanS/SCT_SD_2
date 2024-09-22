import java.util.Random;
import java.util.Scanner;

class randomNumber {

    public static void main(String[] args) {

        Random r = new Random();

        int random = r.nextInt(10);

        System.out.println("guss the number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == random) {
            System.err.println("conguratulation your winner " + random);
        } else
            System.out.println("Sorry " + random);
        scanner.close();

    }
}