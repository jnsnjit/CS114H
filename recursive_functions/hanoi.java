package recursive_functions;

public class hanoi {
    // towers of hanoi problem
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);

        tower(num,'A','C','B');
    }
    // move top n-1 disk to temp tower
    // move nth disk to dest tower
    // move top n-1 disk to dest tower 
    public static int tower(int n, char src, char dst, char temp){
        if(n>0){
            tower(n-1,src,temp,dst);
            System.out.println("Move disk " + n + " from " + src + " to " + dst);
            tower(n-1,temp,dst,src);
        }
        return 0;
    }
}
