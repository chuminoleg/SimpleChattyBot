import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOf3Digits = number / 100;
        int numberOf2Digits = (number / 10) % 10;
        int numberOf1Digits = number % 10;
        if (numberOf1Digits == 0) {
            System.out.println("" + numberOf2Digits + numberOf3Digits);
        } else {
            System.out.println("" + numberOf1Digits + numberOf2Digits + numberOf3Digits);
        }
    }
}