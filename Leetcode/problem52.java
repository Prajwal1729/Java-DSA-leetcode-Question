package Leetcode;

public class problem52 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    static Node head;

    // public static int duplicateNumber(int nums[]){
    //     int n = nums.length;

    //     for(int i =0;i<n;i++){
    //         int index = Math.abs(nums[i]);
    //         if(nums[index] < 0){
    //            return index;
    //         }

    //         nums[index] = -nums[index];
    //     }
        
    //     return -1;
    
    // }

    public static void addNode(int data){
        Node newNode = new Node(data);
        Node curr = head;

        if(head ==null){
          head = newNode;
        }
        else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
     }

     public static int duplicateNumber(int nums[]){
          int slow = nums[0];
          int fast = nums[nums[0]];


          while(slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
          }

          slow = 0;

          while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
          }

          return slow;
     }

    public static void printLinkedList(){
        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

       System.out.println();
        
    }
    public static void main(String[] args) {
        int nums[] = {6,3,1,4,2,4,5};
        int res = duplicateNumber(nums);

        System.out.println("The duplicate number is: "+ res);

    }
}
