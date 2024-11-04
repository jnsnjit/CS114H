package Projects;

public class Sorts {
    public static <T extends Comparable<? super T>> void heapSort(T[] array) {
        //step 1, build maxheap
        int node = array.length;
        for (int i = node / 2 - 1; i >= 0; i--) {
            heapSort(array, node, i);
            //System.out.print(array[i]);
        }
        for (int i = node - 1; i > 0; i--) {
            // Move current root to end
            T temp = array[0]; 
            array[0] = array[i];
            array[i] = temp;

            // Call heapSort on the reduced heap, last node is no longer included
            heapSort(array, i,0);
        }
    }
    public static <T extends Comparable<? super T>> void heapSort(T[] array, int n, int index){
        //take index and set as largest
        int big = index;
        //find left and right of largest
        int l = 2*index + 1;
        int r = 2*index + 2;
        //check if children are bigger then big
        if(l < n && array[l].compareTo(array[big]) > 0){
            big = l;
        }
        if(r < n && array[r].compareTo(array[big]) > 0){
            big = r;
        }
        //check if big is root or not
        if (big != index) {
            //if not, fix it
            T temp = array[index];
            array[index] = array[big];
            array[big] = temp;
            //fix broken subtree
            heapSort(array, n, big);
        }
    }
}
