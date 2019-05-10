package Sort;

public class DoubleSelectionSort {
    public  void doubleselectionsort(int [] arrey){
        BubbleSort bs = new BubbleSort();

        for (int firstEl=0, lastEl=arrey.length; firstEl!=lastEl; firstEl++, lastEl--) {
            int minEl=firstEl;
            int maxEl=firstEl;
            for (int i = firstEl; i < lastEl; i++) {
                if (arrey[i] > arrey[maxEl])
                    maxEl = i;
                if (arrey[i] < arrey[minEl])
                    minEl = i;
            }
            bs.swap(arrey, maxEl, lastEl-1);
            if ((lastEl-1)==minEl) {
                minEl = maxEl;
                maxEl = lastEl-1;
            }else maxEl=lastEl-1;

            bs.swap(arrey, minEl, firstEl);
        }
    }
}
