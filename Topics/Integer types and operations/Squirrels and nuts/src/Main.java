import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrelNumber = scanner.nextInt();
        int nutsNumber = scanner.nextInt();
        System.out.println(nutsNumber % squirrelNumber);
    }
}