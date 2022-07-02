import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int sumLimit = 20;
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println((number1 + number2) == sumLimit || (number2 + number3) == sumLimit
                || (number1 + number3) == sumLimit);
    }
}