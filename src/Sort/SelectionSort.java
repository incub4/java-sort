package Sort;


// Класс содержащий методы Сортировки выбором и печати массиа в консоль.

public class SelectionSort { // Класс с методом который должен сортировать
    public static void selectionSort(int [] arrey){
        for (int k=arrey.length-1; k>=0; k--) {
            int max=0; // Индекс максимального элемента в неотсортированном массиве
            for (int i = 0; i < k; i++) { // Поиск максимального элемента в неотсортированном массиве
                if (arrey[max] < arrey[i + 1])
                    max = i + 1;
            }
            // Меняем местами максимальный элемент в неотсортированном массиве с последним его эл-м
            BubbleSort.swap(arrey, max, k);
        }
    }

    public static void arrPrint(int [] arrey){
        for (int i=0; i<arrey.length; i++)
        {
            System.out.print(arrey[i]+" ");
        }

    }

}
