public class letter_skip {
    public static void main(String[] args) {
        String str="bacad";
        System.out.println(skip(str));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return " ";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
              return skip(str.substring(1));
        }
        return skip(str.substring(1)) +ch;
    }
}
