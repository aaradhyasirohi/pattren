import java.util.Stack;

public class Stack_ques_next_greaterElement   {
    public static void main(String[] args) {
        int arr[]={11,3,56,8,90};
        NGE(arr);
    }
    public static void NGE(int []arr){
        int nge[]=new int[arr.length];
        Stack <Integer> st=new Stack<>();
           for (int i=0;i< arr.length;i++){
               while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
                  int ii=st.pop();
                  nge[ii]=arr[i];
               }
               st.push(i);
           }
           while(!st.isEmpty()){
               int ii=st.pop();
               nge[ii]=-1;
           }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+"->"+nge[i]);
        }
    }
}
