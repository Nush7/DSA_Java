package TREES;

public class SizeMaxSumHeight {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val= val;
        }
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left)+ size(root.right);
    }
    public static int max(Node root){
        if(root== null) return Integer.MIN_VALUE;
        int a= root.val;
        int b= max(root.left);
        int c= max(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static int height(Node root){
        if(root== null) return 0;
        if(root.left== null && root.right== null) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }
    public static int sum(Node root){
        if(root== null) return 0;
        return root.val+ sum(root.left) + sum(root.right);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right= b;
        Node c= new Node(4);
        Node d= new Node(5);
        a.left=c;
        a.right= d;
        Node e= new Node(6);
        b.right= e;

    }

}
