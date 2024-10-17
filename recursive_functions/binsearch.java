package recursive_functions;
public class binsearch {
    public static void main(String[] args) {
        int n = 5;
        Integer[] array = {12,13,52,80,100};
        Integer a = 80;
        
        System.out.println(bsearch(array, a));
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        else if (n < 0){
            return 0;
        }
        return n*fact(n-1);
    }
    public static <T extends Comparable<? super T>> int bsearch(T[] arr, T key){
        return bsearch(arr,key,0,arr.length-1);
    }
    private static <T extends Comparable<? super T>> int bsearch(T[] arr, T key, int l, int r){
        int cmp;
        if(l<=r){
            int m = (l+r)/2;
            if ((cmp = key.compareTo(arr[m])) == 0){
                return m;
            }
            else if (cmp <0){
                return bsearch(arr, key, l, m-1);
            }
            else{
                return bsearch(arr, key, m+1, r);
            }
        }
        return -1;
    }
}