package CommonTopics;

public class DFSBasic {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    static void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.left = new Node(6);
        tree.right.right = new Node(7);

        System.out.println("====== Preorder =====");
        preorderTraversal(tree);
        System.out.println();

        System.out.println("====== Inorder =====");
        inorderTraversal(tree);
        System.out.println();

        System.out.println("====== Postorder =====");
        postorderTraversal(tree);
        System.out.println();
    }
}
