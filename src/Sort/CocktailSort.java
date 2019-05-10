package Sort;

public class CocktailSort {
    public void cocktailsort(int [] arrey){

        for (int k=arrey.length-1, l=0; k>l; k--,l++) { //  (-> <-)
            for (int i = l; i < k; i++) {
                if (arrey[i] > arrey[i+1]) {
                    BubbleSort bs = new BubbleSort();
                    bs.swap(arrey, i, i + 1);
                }
            }
            for (int c=k; c>l; c--){
                if (arrey[c] < arrey[c-1]) {
                    BubbleSort bs = new BubbleSort();
                    bs.swap(arrey, c, c-1);
                }
            }

        }
    }
}
