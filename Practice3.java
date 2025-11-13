public class Practice3 {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }
        // Следующая строка вызывает ошибку компиляции:
        // int c = a + b;
        // Переменная b вне области видимости
    }
}
