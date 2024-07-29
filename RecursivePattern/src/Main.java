import java.util.Scanner;

public class Main{
    public static void printDecrease(int number) {
        if (number <= 0) {
            System.out.print(number + " ");
            printIncrease(number + 5);
        } else {
            System.out.print(number + " ");
            printDecrease(number - 5);
        }
    }
    public static void printIncrease(int number) {
        if (number > 0) {
            System.out.print(number + " ");
            printIncrease(number - 5);
        } else {
            System.out.print(number + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int number = scanner.nextInt();

        printDecrease(number);
    }
}