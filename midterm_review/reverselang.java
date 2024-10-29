public class reverselang {
    //just need to write method
    public static void main(String[] args){
        //language is defined as sigma = {0,1};
        System.out.println(islang("1001"));
        System.out.println(islang("101101"));
        System.out.println(islang("1101"));
        System.out.println(islang("0000"));
        System.out.println(islang("0110"));
        System.out.println(islang("1010"));
    }
    public static boolean islang(String zo){
        if(zo.length() <= 1){
            return true;
        }
        if(zo.charAt(0) == zo.charAt(zo.length()-1)){
            return islang(zo.substring(1, zo.length()-1));
        }
        return false;
    }
}
