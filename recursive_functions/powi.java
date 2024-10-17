package recursive_functions;

public class powi {
    public static void main(String[] args){
        long tick, tock;
        tick = System.nanoTime();
        powii(1,10);
        tock = System.nanoTime();
        System.out.println(tock-tick);

        tick = System.nanoTime();
        powr(1,10);
        tock = System.nanoTime();
        System.out.println(tock-tick);
    }
    public static int powii(int x,int n){
        int prod = 1;
        while(n-->0){
            prod*=x;
        }
        return prod;
    }
    // x^7 = x * x^6
    public static int powr(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * powr(x,n-1);
    }

    //notes, if the time complexity of a solution is the same for both
    // the iterative and recursive solution, go for the iterative solution
    // will be more efficent.
    //lets make this more efficent
    public static int powerec(int x, int n){
        if(n==0){
            return 1;
        } else if (n % 2 == 0 ){
            return powerec(x*x,n/2);
        } else {
            return x *powerec(x*x,n/2);
        }
    }
}
