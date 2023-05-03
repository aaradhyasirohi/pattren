import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
         st.push(89);
         st.push(40);
         st.push(67);
        System.out.println(st.peek());
        System.out.println(st);
        // reverse a stack
//        int n=st.size();
//        for (int i = 0; i <n; i++) {
//            System.out.println(st.peek());
//          st.pop();
//        }
        Reverse(st);

    }
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty())return;
        int x=st.pop();
        Reverse(st);
        Insert_down(st,x);
    }
    private static void Insert_down(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return; }
        int y=st.pop();
        Insert_down(st, x);
        st.push(y);
    }

    
}
