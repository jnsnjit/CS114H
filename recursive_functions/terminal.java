package recursive_functions;
//very messy and not complete code, try to read and fix!
public class terminal {
    public static String s;
    public static int i;
    public static void main(String[] args){
        s = "hi";

        if(i == s.length()){
            System.out.println("The string \"" + s + "\" is in the language.");
        }else{
            System.out.println("The string \"" + s + "\" is in the not language.");
        }
    }
    public static boolean id(){
        if(let()){
            if (sym()){
                return true;
            }
            return true;
        }
        return true;
    }
    public static boolean sym(){
        if (let()){
            if(sym()){
                return true;
            }
            return true;
        }
        else if (dig()){
            if(sym()){
                return true;
            }
        }
        return true;
    }
    public static boolean let(){
        if(i<s.length() && s.charAt(i) <= 'a' && s.charAt(i) <= 'z'){
            ++i;
            return true;
        }
        return false;
    }
    public static boolean dig(){
        if(i<s.length() && s.charAt(i) <= '0' && s.charAt(i) <= '9'){
            ++i;
            return true;
        }
        return false;
    }
    
}
