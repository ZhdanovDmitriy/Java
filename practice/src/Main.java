import java.util.*;
public class Main {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>();
        Wrapper<Integer> integerWrapper = new Wrapper<>();

        //проверяем оба объекта с помощью instanceof
        //проверка идёт только по базовому типу Wrapper, без учёта <T>
        if (stringWrapper instanceof Wrapper) {
            System.out.println("stringWrapper — экземпляр Wrapper");
        }

        if (integerWrapper instanceof Wrapper) {
            System.out.println("integerWrapper — экземпляр Wrapper");
        }
        //Тоже пройдет, но реальной проверки на принадлежность к Wrapper<Integer> не происходит
        if (integerWrapper instanceof Wrapper<Integer>) {
            System.out.println("integerWrapper — экземпляр Wrapper");
        }


        //попытка проверить конкретный параметр типа приведёт к ошибке компиляции

        //начиная с Java 16+ допускается такой синтаксис в связке с pattern matching,
        //но даже тогда JVM проверяет только принадлежность к Wrapper, а не к Wrapper<Integer>
        //В w кладется (Wrapper) integerWrapper
        if (integerWrapper instanceof Wrapper w) {
            System.out.println("Получен объект Wrapper (без доступа к T, но можно кастовать вручную с осторожностью)");
        }

        //Вывод: оба объекта, несмотря на разные параметры типа, в runtime имеют один и тот же класс — Wrapper
        //Это следствие стирания типов (type erasure)

        /*
         = = == = = = = = Вторая часть практики = = = = == = = =
         */
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Number> nums = new ArrayList<>();
        List<Object> objs = new ArrayList<>();

        // <? extends T> — читать как T, но не писать
        print(ints);   //все ок, Integer extends Number
        print(nums);   //все ок, Number extends Number
        // print(objs); — не скомпилируется т.к. Object не подтип Number

        // <? super T> — писать T, но читать только как Object
        add(10, nums); //все ок, Number — супертип Integer
        add(20, objs); //все ок, Object — супертип Integer
        // add(30, ints); — уже List<Integer>, тоже ок, но не нужно <? super> в этом случае

        // copy — пример типичного PECS: from производит (extends), to потребляет (super)
        copy(ints, nums);  // 1, 2, 3 → nums
    }

    // Только чтение - extends
    static void print(List<? extends Number> list) {
        for (Number n : list) System.out.println(n);
    }

    // Только запись - super
    static void add(Integer value, List<? super Integer> list) {
        list.add(value);
    }

    static <T> void copy(List<? extends T> src, List<? super T> dst) {
        for (T item : src) dst.add(item);
    }
}
