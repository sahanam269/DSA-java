import java.util.*;
public class stacks{
    public static void main (String[]args){
        Stack<String> stack =new Stack<String>();
        stack.push("bro");
        stack.push("code");
        stack.push("prasa");
        stack.push("pravee");
        stack.push("sana");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

    }
}
