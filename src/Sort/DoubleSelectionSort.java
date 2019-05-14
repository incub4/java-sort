package Sort;

public class DoubleSelectionSort {
    public static void doubleselectionsort(int [] arrey){
        for (int firstEl=0, lastEl=arrey.length; firstEl!=lastEl; firstEl++, lastEl--) {
            int minEl=firstEl;
            int maxEl=firstEl;
            for (int i = firstEl; i < lastEl; i++) {
                if (arrey[i] > arrey[maxEl])
                    maxEl = i;
                if (arrey[i] < arrey[minEl])
                    minEl = i;
            }
            BubbleSort.swap(arrey, maxEl, lastEl-1);
            if ((lastEl-1)==minEl) {
                minEl = maxEl;
                maxEl = lastEl-1;
            }else maxEl=lastEl-1;

            BubbleSort.swap(arrey, minEl, firstEl);
        }
    }
}
