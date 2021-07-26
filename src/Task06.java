import java.util.Scanner;

/**
 * Напиши программу, в которой считывается три числа, а выводится их произведение
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = one + two + three;
        System.out.println(four);
    }
}
