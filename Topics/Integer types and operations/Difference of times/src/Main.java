import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int numbers = 6;
        final int sec = 60;
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfIntNumbers = new int[numbers];
        for (int i = 0; i < arrayOfIntNumbers.length; i++) {
            arrayOfIntNumbers[i] = scanner.nextInt();
        }
        int fistTimeStamp = arrayOfIntNumbers[0] * sec * sec + arrayOfIntNumbers[1] * sec + arrayOfIntNumbers[2];
        int secondTimeStamp = (arrayOfIntNumbers[3]) * sec * sec + arrayOfIntNumbers[4] * sec + arrayOfIntNumbers[5];
        System.out.println(secondTimeStamp - fistTimeStamp);
    }
}