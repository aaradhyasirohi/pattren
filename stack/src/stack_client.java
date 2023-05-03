public class stack_client {
    public static void main(String[] args) throws Exception {
         Stack s=new Stack();
         s.push(10);
         s.push(20);
         s.push(80);

          s.push(90);
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
         s.push(67);
         s.push(78);
        s.push(78);

        
        System.out.println(s.size());
    }
}
