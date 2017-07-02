import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
          
      while(sc.hasNext()) {
         String input=sc.next();
         
          System.out.println(isValid(input)?"true":"false");
      }                 
   }
   public static boolean isValid(String input){
            //Complete the code
          Stack<Character> stack=new Stack<Character>();
          char ch[]=input.toCharArray();
          for(int i=0;i<ch.length;i++){
              if(ch[i]=='('||ch[i]=='['||ch[i]=='{')
                  stack.push(ch[i]);
              else if(ch[i]==')'||ch[i]=='}'||ch[i]==']')
              { 
                if (stack.isEmpty())
                    return false;;

                char last = stack.peek();
                if (ch[i] == '}' && last == '{' || ch[i] == ')' && last == '(' || ch[i] == ']' && last == '[')
                    stack.pop();
                else 
                    return false;
             }
                  
           }
       return stack.isEmpty();
   }
}
