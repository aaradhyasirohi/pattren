public interface StackI extends DSAI,DynamicInterface {
    // by default they are public and abstract
    public void push();
    public int pop();
    public int size();
    int val=9; // public static final
     // after java8  we can give body to static or default methods
     default void khushi(){
         System.out.println("khushi");
     }
     public static void khushi1(){
         System.out.println("khushi Sirohi");
     }
     default int fun1(){
         return 7;
     }
}
