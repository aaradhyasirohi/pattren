

public class contain {
    public static void main(String[] args) {
        String str= "abdcgjdhparty";
        int m=0;
        if(str.contains("party")){
            m=str.indexOf("party");
        }
        for (int i = 0; i < m; i++) {
         char d=   str.charAt(m+2);
        }

        System.out.println(str);
        System.out.println(m);
    }
}
