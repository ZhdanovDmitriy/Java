public class Main {
    public static void main(String[] args) {
        //бесконечный цикл while с true
        while (true) {
            System.out.println("while: бесконечность");
            break;//чтобы выйти из бесконечного цикла
        }

        //while с условием, которое всегда истинно
        int m = 0;
        while (m > 1) {
            m--;
            System.out.println("while: (1 == 1) - всегда true");
            break;//чтобы выйти из бесконечного цикла
        }

        //while с переменной, которая никогда не меняется
        boolean flag = true;
        while (flag) {
            System.out.println("while: флаг не меняется");
            break;//чтобы выйти из бесконечного цикла
        }

        //бесконечный do-while с true в условии
        do {
            System.out.println("do-while: выполняется хотя бы раз и бесконечно");
            break;//чтобы выйти из бесконечного цикла
        } while (true);

        //do-while с условием, которое всегда истинно
        int x = 5;
        do {
            System.out.println("do-while: x = " + x + ", но условие не зависит от x");
            break;//чтобы выйти из бесконечного цикла
        } while (x > 0);

        //do-while с неизменяемой переменной в условии
        final boolean keepGoing = true;
        do {
            System.out.println("do-while: final переменная = true");
            break;//чтобы выйти из бесконечного цикла
        } while (keepGoing);


        /*
            = = = = = = = = = = Вторая часть практики = = = = = = = == = =
         */

        System.out.println("Числа от 1 до 7:");
        System.out.println("пропускаем 2 и 4 (continue)");
        System.out.println("останавливаемся на 6 (break)");
        for (int i = 1; i <= 7; i++) {
            if (i == 2 || i == 4) {
                continue;
            }
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
        //итого 1,3,5
    }
}
