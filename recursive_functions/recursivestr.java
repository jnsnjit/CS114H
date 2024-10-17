package recursive_functions;
public class recursivestr {
    public static void main(String[] args){
        System.out.println(reverse("grandmother"));
    }
    //hello
    //o l l e h
    public static String reverse(String s){
        if(s.length() < 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
