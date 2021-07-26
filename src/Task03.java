import java.util.Scanner;

/**
 * Считай с консоли имена трех любимых стримерш и выведи на экран Мои любимые стримерши: <имя1, имя2, имя3>
 */

public class Task03 {
    public static void main(String[] args) {  // важная штука
        Scanner scanner = new Scanner(System.in);  // сканер
        String one = scanner.nextLine();
        String two = scanner.nextLine();  // три переменных
        String three = scanner.nextLine();
        System.out.println(one);
        System.out.println(two);  // выводим на экран стримерш
        System.out.println(three);
    }
}
