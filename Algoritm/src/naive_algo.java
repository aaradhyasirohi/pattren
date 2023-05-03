public class naive_algo {
    public static void main(String[] args) {
        String a="aa";
        String b="a";
        int i=0;
        int j=0;
        while (i<a.length()&&j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }
            else {
                i=i-j+1;
                j=0;
            }
        }
        if(j==(b.length())){
            System.out.println("yes");
        }
    }
}
