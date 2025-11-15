
public static void main(String[] args) {
    // Практика 1
    // Integer
    System.out.println(Integer.decode("0x1A"));
    System.out.println(Integer.decode("012"));

    // Long
    System.out.println(Long.decode("0xFF"));
    System.out.println(Long.decode("-0x10"));

    // Short
    System.out.println(Short.decode("0x7F"));
    System.out.println(Short.decode("017"));

    // Byte
    System.out.println(Byte.decode("0x10"));
    System.out.println(Byte.decode("07"));


    // Практика 2
    // 1. Boolean.valueOf(boolean)
    Boolean b1 = Boolean.valueOf(true);
    Boolean b2 = Boolean.valueOf(false);

    // 2. Boolean.valueOf(String)
    Boolean b3 = Boolean.valueOf("true");
    Boolean b4 = Boolean.valueOf("TrUe");
    Boolean b5 = Boolean.valueOf("false");
    Boolean b6 = Boolean.valueOf(null);

    // 3. Автобоксинг(неявный вызов valueOf)
    Boolean b7 = true;
    Boolean b8 = false;

    // Вывод для проверки
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);
    System.out.println(b6);
    System.out.println(b7);
    System.out.println(b8);

    // Практика 3
    Integer a = null;
    // int b = a;  // будет NullPointerException

    // Безопасный способ — проверить на null
    int b = (a != null) ? a : 0;

    // Или так
    try {
        int c = a;  // NullPointerException
    } catch (NullPointerException e) {
        System.out.println("NullPointerException при распаковке null");
    }

    // Практика 4
    // значение 128 вне кэша [-128;127]
    int i1 = 128;
    Integer a1 = i1;  // автобоксинг | Integer.valueOf(128)
    Integer b9 = i1;  // автобоксинг | Integer.valueOf(128)

    // При сравнении Integer == int происходит unboxing:
    // a1 == i1 | a1.intValue() == i1 | 128 == 128 | true
    System.out.println("a1 == i1 " + (a1 == i1));

    // Аналогично: b9 == i1 | true
    System.out.println("b9 == i1 " + (b9 == i1));

    // a1 == b9 — сравнение ссылок. Объекты созданы отдельно (128 вне кэша)
    // поэтому a1 и b9 ссылаются на разные объекты | false
    System.out.println("a1 == b9 " + (a1 == b9));

    // equals() сравнивает значения, а не ссылки | true
    System.out.println("a1.equals(i1) -> " + a1.equals(i1));
    System.out.println("b9.equals(i1) -> " + b9.equals(i1));
    System.out.println("a1.equals(b9) -> " + a1.equals(b9));


    // значение 127 внутри кэша [-128..127]
    int i2 = 127;
    Integer a2 = i2;  // автобоксинг | Integer.valueOf(127) | из кэша
    Integer b10 = i2;  // автобоксинг | Integer.valueOf(127) | тот же объект из кэша

    // Сравнение с примитивом - анбоксинг | true
    System.out.println("a2 == i2 " + (a2 == i2));
    System.out.println("b10 == i2 " + (b10 == i2));

    // a2 == b10 — ссылки на один и тот же объект из кэша | true
    System.out.println("a2 == b10 " + (a2 == b10));

    // equals() — по значению | true
    System.out.println("a2.equals(i2) -> " + a2.equals(i2));
    System.out.println("b10.equals(i2) -> " + b10.equals(i2));
    System.out.println("a2.equals(b10) -> " + a2.equals(b10));


    // Зачем нужен IntegerCache?
    // Класс IntegerCache реализует кэширование часто используемых значений Integer
    // в диапазоне от -128 до 127 (по умолчанию)
    // Это позволяет:
    // — экономить память (не создавать новые объекты для одних и тех же значений),
    // — ускорять сравнение через == внутри кэша (хотя так делать не рекомендуется),
    // — обеспечивать согласованность (например, Boolean.TRUE всегда один и тот же объект).
    // Кэш инициализируется один раз при первом использовании Integer.valueOf().
}
