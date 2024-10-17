package recursive_functions;

public class palidrome {
    public static void main(String[] args){
        String test = "aaaabbbb";
        if(pal(test)){
            System.out.println(test + " is a palidrome");
        }else{
            System.out.println(test + " is not a palidrome");
        }
        if(anbn(test)){
            System.out.println(test + " is an A^n + B^n string");
        }else{
            System.out.println(test + " is not an A^n + B^n string");
        }
    }
    public static boolean pal(String s){
        if(s.length() > 1){
            if(s.charAt(0)==s.charAt(s.length()-1)){
                return pal(s.substring(1,s.length()-1));
            }
            return false;
        }
        return true;
    }
    public static boolean anbn(String s){
        if(s.length() > 0){
            if(s.charAt(0)=='a' && s.charAt(s.length()-1)=='b'){
                return anbn(s.substring(1,s.length()-1));
            }
            return false;
        }
        return true;
    }
}
