import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine().toLowerCase();
        System.out.println(townName.endsWith("burg"));
    }
}