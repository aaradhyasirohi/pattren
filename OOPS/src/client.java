public class client {
    public static void main(String[] args) {
      // P obj=new P();
//       P obj1=new C();
//        System.out.println(obj1.d);
//        System.out.println(obj1.d1);
//        System.out.println(((C)(obj1)).d2);
//        System.out.println(((C)(obj1)).d);
//        // Override
//        obj1.fun();
//        obj1.fun1();
//        ((C)(obj1)).fun2();

        // case3  not allowed
//         C obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(obj.d2 );

        // case 4
        C obj = new C();
        System.out.println(obj.d);
       System.out.println(obj.d1);
       System.out.println(obj.d2 );
        System.out.println(((P)obj).d);
        
    }
}
