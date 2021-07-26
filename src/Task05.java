import java.util.Scanner;

/**
 * Напиши программу, в которой считывается два числа, а выводится их разность
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int two = scanner.nextInt();
        int one = scanner.nextInt();
        int three = two - one;
        System.out.println(three);
    }
}
