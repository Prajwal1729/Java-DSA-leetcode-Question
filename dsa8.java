import java.util.ArrayList;
import java.util.Stack;
public class dsa8 {

    private ArrayList<Integer> items;

    public void Stack(){
       items = new ArrayList<>();
    }

    
    public void push(int item){
        items.add(item);
    }

    public Integer pop(){
        if(!isEmpty()){
            return items.remove(items.size() - 1);
        }
        return null;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }
    public static void main(String[] args) {
        
        Stack s  = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("top element: "+ s.peek());

        System.out.println("popped element: "+s.pop());
        System.out.println("popped element: "+s.pop());

        System.out.println("Top element after popping: "+ s.peek());


    }
}
