public class wrapper_class {
    public static void main(String[] args) {
        Integer a1=89;
        int a=89;
        System.out.println(a1);
        System.out.println(a );
        //auto-boxing :  primitive data into non primitive data
        Integer b=12;
        int b1=17;
        b=b1;
        System.out.println(b);
        // un boxing :non-primitive into primitive data
        Integer c=12;
        int c1=17;
        c1=c;
        System.out.println(c1);


    }
}
