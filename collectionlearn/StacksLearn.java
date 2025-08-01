package collectionlearn;

import java.util.Stack;

public class StacksLearn {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
          char temp;
            String a ="";
        String s = "Hello World";
        // for (char c : s.toCharArray()) {
        //     stack.push(c);
        // }
        for(int i = 0; i <s.length(); i++){
            stack.push(s.charAt(i));
        }
        
        while(!stack.empty()) {
            temp = stack.pop();
            a = a + temp;
        }
        System.out.println(a);
        
    String param = "{{[]}}";
    Stack<Character> stack2 = new Stack<>();
   for(char charTemp : param.toCharArray()) {
        stack2.push(charTemp);
    }
     int countpar1 =0;
        int cuntpar2=0;
    while(!stack2.isEmpty()){
        char temp2 =stack2.pop();
       System.out.println(temp2);
        if(temp2=='{' || temp2=='['|| temp2 == '(' || temp2=='}' || temp2==']'|| temp2 == ')') {
            countpar1++;
        }
       
    }
        if(countpar1%2==0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

   }
}
