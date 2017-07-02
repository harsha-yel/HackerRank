import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student implements Comparable<Student>{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    public int compareTo(Student s2){
        if(getCgpa()==(s2.getCgpa())){
            if(getFname().compareTo(s2.getFname())==0) {
                if(getToken()==s2.getToken()) return 0;
                else return (getToken()-s2.getToken())>0?-1:1;
            }
            else if(getFname().compareTo(s2.getFname())<0) return -1;
            else return 1;
        }
        else if(getCgpa()<s2.getCgpa()) return 1;
        else return -1;
            }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
       PriorityQueue<Student> st=new PriorityQueue<Student>();
       Student buf=null; 
      while(totalEvents>0){
          String event = in.next();
         if(event.compareTo("ENTER")==0){
             String name=in.next();
             double gpa=in.nextDouble();
             int toke=in.nextInt();
             Student s1=new Student(toke,name,gpa);
             st.offer(s1);
         }
         else if(event.equals("SERVED")){
             buf=st.poll();
           //  if(in.hasNextLine()) in.nextLine();
         }
      totalEvents--;
      }
        in.close();
        if(buf==null) System.out.println("EMPTY");
    
        else
         while ( ! st.isEmpty()) {
                Student s = st.remove();
                System.out.println(s.getFname());
            }
    
    }
}
