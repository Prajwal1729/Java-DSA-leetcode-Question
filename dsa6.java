public class dsa6 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            
        }
        
    }

    Node root;
    
    public void insert(int data){
       // Implement insertion logic here
      
        root = insertRec(root, data);
    
    }

    public Node insertRec(Node root,int data){

      if(root == null){
          root = new Node(data);
       }
       else if(data < root.data){
            root.left = insertRec(root.left, data); 
       }
       else if(data > root.data){
            root.right = insertRec(root.right, data);
       }

       return root;
    }

    public void inOrder(){
        inOrderRec(root);

    }

    public void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){
         preOrderRec(root);
    }

    public void preOrderRec(Node root){
        if(root!=null){
           System.out.print(root.data+" ");
           preOrderRec(root.left);
           preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }

    public void postOrderRec(Node root){
        if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");

        }
    }

    public static void main(String[] args) {

        dsa6 tree = new dsa6();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
       
        
    }
}
