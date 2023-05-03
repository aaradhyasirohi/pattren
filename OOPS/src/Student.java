public class Student {
       String name;
       int age;
       public Student(){

       }
       public Student(String name,int age){
           this.age=age;
           this.name=name;
       }
        @Override
    public  String toString(){
          return this.name +" "+ this.age;
        }
        public static void hllo(){
            System.out.println("hloo");
        }
        // block
    static  {
            System.out.println("in sttaic block" +
                    "" + " it is excuted first ");
        }


}
