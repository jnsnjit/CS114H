package recursive_functions;
public class fiboseq {
    public static void main(String[] args){
        for(int i =0;i<10;i++){
            System.out.println(fibo(i));
        }
    }
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
