
void main() {
    int a1[] = {1, 2, 3, 4, 5};
    int a2[] = {6, 7, 8, 9, 10};
    System.out.println("До a1 = a2:");
    System.out.println("a1[0] = " + a1[0]);
    System.out.println("a2[0] = " + a2[0]);
    a1 = a2;
    System.out.println("\nПосле a1 = a2:");
    System.out.println("a1[0] = " + a1[0]);
    System.out.println("a2[0] = " + a2[0]);

    a1[0] = 999;
    System.out.println("\nПосле a1[0] = 999:");
    System.out.println("a1[0] = " + a1[0]); // 999
    System.out.println("a2[0] = " + a2[0]); // 999 - изменилось!

    // Что произошло:
    // a1 больше не ссылается на {1,2,3,4,5}
    // теперь a1 и a2 ссылаются на один и тот же массив {6,7,8,9,10}
    // старый массив {1,2,3,4,5} стал недостижим - будет удалён сборщиком мусора

    /*
     = = == = = = = = = Вторая часть практики = == = = = = = = =
     */
    int[] arr1 = {3, 1, 4, 1, 5};
    int[] arr2 = {3, 1, 4, 1, 5};
    int[] arr3 = {1, 2, 3};

    //Arrays.toString() — превращает массив в строку для вывода
    System.out.println("toString: " + Arrays.toString(arr1));

    //Arrays.sort() — сортирует массив
    Arrays.sort(arr1);
    System.out.println("после sort: " + Arrays.toString(arr1));

    //Arrays.binarySearch() — ищет элемент в отсортированном массиве
    int index = Arrays.binarySearch(arr1, 4);
    System.out.println("binarySearch(4): " + index);
    // Важно: массив должен быть отсортирован, иначе результат непредсказуем

    //Arrays.equals() — сравнивает содержимое двух массивов
    boolean eq1 = Arrays.equals(arr1, arr2);
    boolean eq2 = Arrays.equals(arr1, new int[]{1, 1, 3, 4, 5});
    System.out.println("equals(arr1, arr2): " + eq1);
    System.out.println("equals(arr1, {1,1,3,4,5}): " + eq2);

    // метода "boolean compare()" в  java.util.Arrays нет — compare возвращает int.
    // Видимо, в задании опечатка: вероятно имеется в виду Arrays.compare(...), он возвращает int.
    //Arrays.compare() - Сравнивает лексикографически: как строки, но по элементам
    // Возвращает: <0 : arr1 < arr3, 0 : равны, >0 : arr1 > arr3
    int cmp = Arrays.compare(arr1, arr3);
    System.out.println("compare(arr1, arr3): " + cmp);
    // arr1 = [1,1,3,4,5], arr3 = [1,2,3] →
    // 1==1, затем 1 < 2 : arr1 "меньше" => результат отрицательный (-1)

}
