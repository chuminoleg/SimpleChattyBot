import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int sum;
        if (x % 2 == 0) {
            sum = x / 2;
        } else {
            sum = x / 2 + 1;
        }

        if (y % 2 == 0) {
            sum = sum + y / 2;
        } else {
            sum = sum + y / 2 + 1;
        }

        if (z % 2 == 0) {
            sum = sum + z / 2;
        } else {
            sum = sum + z / 2 + 1;
        }

        System.out.println(sum);
    }
}
