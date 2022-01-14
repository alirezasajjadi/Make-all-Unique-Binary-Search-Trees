import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Solution {
    public List<TreeNode> generateTrees(int n) {
        TreeNode vertex;
        List<Integer> nodes = new ArrayList<Integer>();

        //count BST = (2n)!/((n+1!)*n!)
        int cnt = factorial(2*n)/(factorial(n+1)*factorial(n));
        while(cnt!=0){

        }
        return null;
    }
    int factorial(int n)
    {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }


}






/*public class Program {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        Queue<Node> queue = new LinkedList<>();
        tree.inorderTraversal(tree.root, queue);       //save inorder traversal of tree to queue
        tree.convertToRightThreaded(tree.root, queue);

    }

}

class BinaryTree {
    Node root;

    void convertToRightThreaded(Node ptr, Queue<Node> q) {
        Node p = q.remove();
        while (true) {
            if (p.right == null) {
                p.right = q.peek();
                p.rightThreaded = true;
            }
            if(q.peek()==null)
                break;
            p = q.remove();
        }

    }

    void inorderTraversal(Node ptr, Queue<Node> q) {
        if (ptr != null) {
            inorderTraversal(ptr.left, q);
            q.add(ptr);
            inorderTraversal(ptr.right, q);
        }
    }


}


class Node {
    int info;
    Node left, right;
    boolean rightThreaded = false;

    public Node(int ptr) {
        info = ptr;
        left = right = null;
    }
}
*/
