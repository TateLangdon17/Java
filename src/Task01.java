import java.util.Scanner;

/**
 * Создай переменную строкового типа, считай в нее с консоли свое name и выведи на экран привет, меня зовут <имя>, где <имя> это то, что ты ввел м консоли.
 */

public class Task01 {
    public static void main(String[] args) {  // не забывать что всё делаем в классе
        Scanner scanner = new Scanner(System.in);  // для того чтобы считать строку
        String name = scanner.nextLine();  // создал переменную строкового типа
        System.out.println("Привет, меня зовут " + name);  // и собственно пытаемся это вывести на экран
    }
}
