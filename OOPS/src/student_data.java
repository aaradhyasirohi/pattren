class student {
    String name;
    int rollno;
    String pass;
    public void alldata(){
        System.out.println(this.name + " "+this.pass +" "+this.rollno);
    }
   // student(){
     //   System.out.println("constructor called");
     /*tudent(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
      }  */
    // copy constructor
    student(student st2){
        this.name=st2.name;
        this.rollno=st2.rollno;  }

        student(){

        }
}
public class student_data {
    public static void main(String[] args) {
          student st=new student();// constructor
        st.rollno=9;
        st.name="khush";

          student st2=new student(st);
          st2.name="aara";
          st2.rollno=8;
        st2.alldata();
    }
}
