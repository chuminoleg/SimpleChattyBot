import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toUpperCase();
        System.out.println(line.startsWith("J"));
    }
}