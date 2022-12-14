package binarysearchtree;

import java.util.Stack;

public class LevelOrderTraversal {

    Stack<Node> s1 = new Stack();
    Stack<Node> s2 = new Stack();
    public void levleOrderTraversal(Node root){
        if (root == null ){
            return;
        }
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()) {
            while(!s1.isEmpty()){
                Node node = s1.pop();
                System.out.println(node.val);
                if(node.right != null){
                    s2.push(node.right);
                }
                if(node.left != null){
                    s2.push(node.left);
                }
            }
            while(!s2.isEmpty()){
                Node node = s2.pop();
                System.out.println(node.val);
                if(node.left != null){
                    s1.push(node.left);
                }
                if(node.right != null){
                    s1.push(node.right);
                }
            }
        }
    }
}
