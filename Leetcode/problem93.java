package Leetcode;

public class problem93 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
          this.data = data;
        }

        public static Node insert(Node root,int data){
            if(root==null){
                root = new Node(data);
            }
            else if(data < root.data){
                root.left = insert(root.left, data);
            }
            else if(data > root.data){
                root.right = insert(root.right, data);
            }
            return root;
        }


        public static void preOrder(Node root){
            if(root!=null){
                System.out.print(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        public static Node lowestCommonAncestor(Node root,Node p,Node q){
            int par = root.data;
            int pval = p.data;
            int qval = q.data;

            if(pval > par && qval > par){
                return lowestCommonAncestor(root.right, p, q);
            }

            if(pval < par && qval < par){
                return lowestCommonAncestor(root.left, p, q);
            }

            else{
                return root;
            }
        }
    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 6);
        root = Node.insert(root, 2);
        root = Node.insert(root, 8);
        root = Node.insert(root, 0);
        root = Node.insert(root, 4);
        root = Node.insert(root, 7);
        root = Node.insert(root, 9);
        root = Node.insert(root, 3);
        root = Node.insert(root, 5);


        Node p = root.left;
        Node q = root.left.right;
        Node ans = Node.lowestCommonAncestor(root, p, q);
        System.out.println("The lowest common ancestor is: "+ ans.data);
        
    }
}
