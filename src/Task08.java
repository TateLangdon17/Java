import java.util.Scanner;

/**
 * Напиши прогу, которая считывает твое имя, фамилию и возраст, а выводит на экран Мне <количство лет> лет, меня зовут <имя> <фамилия>
 */

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.nextLine();
        String fam = scanner.nextLine();
        System.out.println(" мне " + age + " меня зовут " + name + fam);
    }
}
