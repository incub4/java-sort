import Sort.BubbleSort;
import Sort.CocktailSort;
import Sort.DoubleSelectionSort;
import Sort.SelectionSort;

public class MySnake {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort(); // Экз-р класса с методами сортировки
        int [] arrey = {4, 9,-3, 8, 1, 10,-50, 5, 120, -120}; // То что будем сортировать
        int [] arrB = arrey.clone();
        int [] arrC = arrey.clone();
        int [] arrD = arrey.clone();

//        ss.selectionSort(arrey); // Сортировка
//        ss.arrPrint(arrey); // Вывод в консоль отсортированного массива

//        BubbleSort bs = new BubbleSort();
//        bs.bublesort(arrB);
//        ss.arrPrint(arrB);

//        CocktailSort cs = new CocktailSort();
//        cs.cocktailsort(arrC);
//        ss.arrPrint(arrC);

        DoubleSelectionSort dss = new DoubleSelectionSort();
        dss.doubleselectionsort(arrD);
        ss.arrPrint(arrD);
        System.out.println("hello world");
    }

}
