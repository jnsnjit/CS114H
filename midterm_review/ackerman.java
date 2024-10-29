public class ackerman {
    public static void main(String[] args){
        System.out.println(ack(1,2));
        System.out.println(ack(3,4));
        System.out.println(ack(3,3));
        //System.out.println(ack(5,6));
    }
    public static int ack(int m, int n){
        if(m==0){
            return n+1;
        }
        if(m>0 && n==0){
            return ack(m-1,1);
        }
        if(m>0 && n >0){
            return ack(m-1,ack(m,n-1));
        }else{
            //if user submits bad values (-negative)
            return -1;
        }
    }
}
