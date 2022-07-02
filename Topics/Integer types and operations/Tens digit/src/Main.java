import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOf2digits = number % 100;
        System.out.println(numberOf2digits / 10);
    }
}