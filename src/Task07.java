import java.util.Scanner;

/**
 * Напиши программу, в которой считывается четыре числа, а выводится их сумма
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = one + two + three + four;
        System.out.println(five);
    }
}
