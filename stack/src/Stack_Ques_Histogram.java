import java.util.Stack;

public class Stack_Ques_Histogram {
    //stock span
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5};
        Span_call(arr);
    }
    public static void Span_call(int arr[]){
        int nge[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
               st.pop();
            }
           if(st.isEmpty()){
               nge[i]=i+1;
           }
           else{
               nge[i]=i-st.peek();
           }
           st.push(i);
        }
        
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+"->"+nge[i]);
        }
        }
    }


