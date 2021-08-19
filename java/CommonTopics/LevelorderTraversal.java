package CommonTopics;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static void bfs(Node rootNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(rootNode);

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(5);
        rootNode.right.left = new Node(6);
        rootNode.right.right = new Node(7);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(rootNode);

        bfs(rootNode);
    }
}
