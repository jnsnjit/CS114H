package recursive_functions;

public class seqsearch {
    public static void main(String[] args){
        Integer[] ints = {1,2,3,4,5,6};

        System.out.println(ssearch(ints, 5));
    }
    public static <T extends Comparable<? super T>> int ssearch(T[] arr, T key){
        return ssearch(arr, key,0);
    }
    public static <T extends Comparable<? super T>> int ssearch(T[] arr, T key, int index){
        if (index < arr.length){
            if (key.compareTo(arr[index]) == 0){
                return index;
            }else{
                return ssearch(arr, key,index+1);
            }
        }
        return index;
    }
}
