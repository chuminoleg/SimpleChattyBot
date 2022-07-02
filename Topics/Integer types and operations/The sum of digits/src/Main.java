import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOf3Digits = number / 100;
        int numberOf2Digits = (number / 10) % 10;
        int numberOf1Digits = number % 10;
        System.out.println(numberOf3Digits + numberOf2Digits + numberOf1Digits);
    }
}