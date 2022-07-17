package day18.task3;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers) {
            addNode(number, root);
        }
        System.out.println();
        dfs(root);
    }

    public static void addNode(int number, Node root) {
        if (root == null)
            throw new IllegalArgumentException("root не должен быть null");
        Node nextNode = root;
        Node current = null;
        while (nextNode != null) {

            current = nextNode;
            System.out.println(current);
            if (number < current.getValue()) {
                nextNode = current.getLeft();

            } else {
                nextNode = current.getRight();
            }
        }
        if (number < current.getValue()) {
            current.setLeft(new Node(number));
        } else {
            current.setRight(new Node(number));
        }
    }

    public static void dfs(Node root) {
        if (root == null)
            return;
        dfs(root.getLeft());
        System.out.print(root.getValue() + " ");
        dfs(root.getRight());
    }
}
