public class Practice6 {
    public static void main(String[] args) {
        int i = 300;                 // 300 выходит за пределы диапазона byte (-128..127)
        byte b = (byte) i;           // сужающее преобразование
        System.out.println("int 300 в byte: " + b); // вывод: 44 (300 % 256 = 44, учитывая знак)
        double d = 123.987;
        int i2 = (int) d;            // отбрасывается дробная часть
        System.out.println("double 123.987 в int: " + i2); // вывод: 123
        long l = 40000L;             // 40000 > 32767
        short s = (short) l;         // переполнение
        System.out.println("long 40000 в short: " + s); // вывод: 40000 - 65536 = -25536
    }
}