package Sort;

public class BubbleSort {
    void swap(int [] arrey, int a, int b){
        int c = arrey[a];
        arrey[a] = arrey[b];
        arrey[b] = c;
    }

    public void bublesort(int [] arrey){
        for (int k=arrey.length-1; k>0; k--) {
            for (int i = 0; i < k; i++) {
                if (arrey[i] > arrey[i+1]) {
                    swap(arrey, i, i + 1);
                }
            }
        }
    }
}
