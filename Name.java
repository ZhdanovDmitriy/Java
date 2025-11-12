import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println(String.format("Привет, %s!", name));
        console.close();
    }
}
