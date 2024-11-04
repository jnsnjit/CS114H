package Projects;
/*
 *
 *  List.java
 *
 */
import java.util.Iterator;
import java.util.Random;

public class ListTester{
    public static void main(String[] args){
        Random rand = new Random(1);
        List<Integer> list = new SortedList<Integer>();
        int n, num;
    
        System.out.println("insert");
        //long start = System.currentTimeMillis();
        for (int i = 0; i < (num = args.length == 1 ? Integer.parseInt(args[0]) : 11); ++i) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j : list) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
        //long stop = System.currentTimeMillis();
        //System.out.println(stop - start);
        System.out.println("search");
        for (int i = 0; i < num / 2; ++i) {
            n = rand.nextInt(num);
            System.out.println(n + ": " + list.search(n));
        }
        System.out.println("retrieve");
        for (int i = -1; i < num+1; ++i) {
            System.out.println(i + ": " + list.retrieve(i));
        }
        // rand = new Random(1);
        System.out.println("remove");
        //start = System.currentTimeMillis();
        for (int i = 0; i < num; ++i) {
            n = rand.nextInt(num);
            list.remove(n);
            System.out.print(n + ": ");
            for (Integer j : list) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
        //stop = System.currentTimeMillis();
        //System.out.println(stop - start);
        System.out.println("insert");
        //start = System.currentTimeMillis();
        for (int i = 0; i < (num = args.length == 1 ? Integer.parseInt(args[0]) : 11); ++i) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j : list) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
        //stop = System.currentTimeMillis();
        //System.out.println(stop - start);
        System.out.println(list);
    }
}