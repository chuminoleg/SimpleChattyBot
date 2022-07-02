import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationInDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int hotelOneNightCost = scanner.nextInt();
        int sum = 2 * oneWayFlightCost + durationInDays * totalFoodCostPerDay
                + hotelOneNightCost * (durationInDays - 1);
        System.out.println(sum);
    }
}