package CommonTopics;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceLeafNode {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int bfs(Node rootNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(rootNode);
        int level = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                Node currentNode = queue.poll();

                if (currentNode.left == null && currentNode.right == null) {
                    return level;
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            level += 1;
        }

        return level;
    }

    static int dfs(int level, Node rootNode) {
        if (rootNode.left == null && rootNode.right == null) {
            return level;
        }

        return Math.min(dfs(level + 1, rootNode.left), dfs(level + 1, rootNode.right));
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(5);
        System.out.println(dfs(0, rootNode));
        System.out.println(bfs(rootNode));
    }
}
