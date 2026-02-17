// import java.util.Stack;
public class dsa4 {

    private int[] arr = new int[5];
    int top = -1;
    int size;

    public dsa4(){
        size = arr.length;
        top = -1;
    }

    public void push(int data){
       top++;
       if(top < size){
         arr[top] = data;
       }
       else{
        System.out.println("stack overflow");
       }
    }

    // for removing the data //
    public int pop(){
        if(top > -1){
          return arr[top--];
        }

        else{
            System.out.println("under flow");
        }
        return 0;
    }

    // for reading the data //
    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // stack //

        // Stack nums = new Stack<>();
        // nums.push(90);
        // nums.push(10);

        // make instance of class //
        dsa4 nums = new dsa4();
        nums.push(10);
        nums.push(90);
        nums.push(34);
        System.out.println(nums.pop());
        nums.push(78);
        nums.push(100);
        System.out.println(nums.peek());
        nums.push(200);
        System.out.println(nums.peek());
        nums.printStack();

    }
    
}
