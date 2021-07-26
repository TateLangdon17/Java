import java.util.Scanner;

/**
 * Считай с консоли строку и выведи на экран
 */

public class Task02 {
    public static void main(String[] args) {  // важная вещь
        Scanner scanner = new Scanner(System.in);  // считывающее устройство
        String song = scanner.nextLine();  // создаётся переменная
        System.out.println(song);  // выводится на экран
    }
}
