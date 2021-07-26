import java.util.Scanner;

/**
 * Напиши программу, в которой считывается с консоли количество часов, а программа выводит на экран количество секунд в этих часах
 */

public class Task04 {
    public static void main(String[] args) {   // обязательно
        Scanner scanner = new Scanner(System.in);   // машина для считывания
        int hour = scanner.nextInt();   // создаём переменную часы
        int sec = hour * 60 * 60;
        System.out.println(sec);
    }
}
