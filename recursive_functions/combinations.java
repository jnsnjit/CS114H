package recursive_functions;

public class combinations {
    public static void main(String[] args){
        int num = 4;
        int pick = 2;

        System.out.println(13.0 * choose(num,pick) / choose(52,2));
    }
    // be careful with larger numbers 💀
    // ah as ad ac
    // start with two random start cards
    // nCk = 4C2 = ?
    // equation      =     n! / (n-k)!
    // without replacement
    // __ __
    // as ah OR as ad OR as ac ...

    public static int choose(int n, int k){
        if(n==k || k==0){
            return 1;
        }
        if(n<k){
            return 0;
        }
        return choose(n-1,k-1) + choose(n-1,k);
        }
}
