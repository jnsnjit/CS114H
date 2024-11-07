package Projects;
import java.util.Arrays;
import java.util.Random;

    public class SearchTester{
    public static void main(String[] args) {
        int num = args.length == 1 ? Integer.parseInt(args[0]) : 10000000;
        Integer[] array = new Integer[num];
        Random rand;
        long start, stop;
        rand = new Random(1);
        for (int i = 0; i < array.length; ++i) {
            array[i] = rand.nextInt(num);
            //System.out.print(array[i]);
        }
        start = System.currentTimeMillis();
        Sorts.heapSort(array);
        stop = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i+1]) {
                System.out.println("heap fail");
                System.out.println(array[i] + ", " + array[i+1]);
                System.exit(0);
            }
        }
        System.out.println("heap pass: " + (stop - start));
        for(int i : array){
            System.out.print(i + " ");
            if(i > 100){
                break;
            }
        }
    }
}
