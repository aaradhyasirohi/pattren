import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
         String name ="Khushi Sirohi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println( name.length());
        System.out.println(name.indexOf('a'));
        // extra space remove
        System.out.println("    angela ".strip());
        // array will cut when space came
        System.out.println(Arrays.toString(name.split("o")));
        
    }
}
