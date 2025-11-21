public class Main {

    public static void main(String[] args) {
        //часть 1
        System.out.println("часть 1");
        StringBuilder sb = new StringBuilder("Текст");
        StringBuffer sbf = new StringBuffer("Буфер");

        //append добавляет данные в конец
        sb.append(" Добавлено");
        System.out.println("append: " + sb);

        //insert вставляет данные в заданную позицию
        sb.insert(0, "Вставка ");
        System.out.println("insert: " + sb);

        //delete удаляет диапазон символов
        sb.delete(0, 2);
        System.out.println("delete: " + sb);

        //reverse разворачивает строку
        sb.reverse();
        System.out.println("reverse: " + sb);
        sb.reverse(); // возвращаем обратно

        //replace заменяет диапазон символов
        sb.replace(0, 5, "Замена");
        System.out.println("replace: " + sb);

        //capacity возвращает текущую емкость буфера
        System.out.println("размер StringBuilder: " + sb.capacity());

        //ensureCapacity увеличивает минимальную емкость
        sb.ensureCapacity(50);
        System.out.println("размер StringBuilder после ensureCapacity: " + sb.capacity());

        // Методы StringBuffer

        //append добавляет в конец
        sbf.append(" плюс");
        System.out.println("append StringBuffer: " + sbf);

        //insert вставляет по индексу
        sbf.insert(0, "Старт ");
        System.out.println("insert StringBuffer: " + sbf);

        //deleteCharAt удаляет символ по индексу
        sbf.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sbf);

        //часть 2
        System.out.println();
        System.out.println("часть 2");

        String str = "Строка";

        //String в StringBuilder
        StringBuilder sbFromStr = new StringBuilder(str);
        System.out.println("String в StringBuilder: " + sbFromStr);

        //String в StringBuffer
        StringBuffer sbfFromStr = new StringBuffer(str);
        System.out.println("String в StringBuffer: " + sbfFromStr);

        //StringBuilder в String
        String strFromSB = sbFromStr.toString();
        System.out.println("StringBuilder в String: " + strFromSB);

        //StringBuffer в String
        String strFromSBF = sbfFromStr.toString();
        System.out.println("StringBuffer в String: " + strFromSBF);

        //StringBuilder в StringBuffer
        StringBuffer sbfFromSB = new StringBuffer(sbFromStr.toString());
        System.out.println("StringBuilder в StringBuffer: " + sbfFromSB);

        //StringBuffer в StringBuilder
        StringBuilder sbFromSBF = new StringBuilder(sbfFromStr.toString());
        System.out.println("StringBuffer в StringBuilder: " + sbFromSBF);
    }
}
