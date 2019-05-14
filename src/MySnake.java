import Sort.BubbleSort;
import Sort.CocktailSort;
import Sort.DoubleSelectionSort;
import Sort.SelectionSort;

public class MySnake {
    public static void main(String[] args) {
        int [] arrey = {4, 9,-3, 8, 1, 10,-50, 5, 120, -120}; // То что будем сортировать
        int [] arrB = arrey.clone();
        int [] arrC = arrey.clone();
        int [] arrD = arrey.clone();

        System.out.println("SelectionSort:");
        SelectionSort.selectionSort(arrey); // Сортировка
        SelectionSort.arrPrint(arrey); // Вывод в консоль отсортированного массива

        System.out.println("\nBubbleSort:");
        BubbleSort.bublesort(arrB);
        SelectionSort.arrPrint(arrB);

        System.out.println("\nCocktailSort:");
        CocktailSort.cocktailsort(arrC);
        SelectionSort.arrPrint(arrC);

        System.out.println("\nDoubleSelectionSort:");
        DoubleSelectionSort.doubleselectionsort(arrD);
        SelectionSort.arrPrint(arrD);

    }

}
