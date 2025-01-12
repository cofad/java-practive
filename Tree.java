public class Main {
    public static void main(String[] args) {
        System.out.println("Tree.java");
        // Tree tree = new Tree(10);
        Node tree = new Node(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(2);
        tree.insert(40);
        tree.insert(30);
        tree.insert(50);
        tree.insert(25);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(9);
        tree.insert(8);
        tree.insert(7);
        tree.print();
    }
}

public class Node {
    private Node left;
    private Node right;
    private int value;

    Node(int value) {
        this.value = value;
    }

    void setValue(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    void insert(int value) {
        if (value < this.value) {
            if (this.left != null) {
                this.left.insert(value);
            } else {
                this.left = new Node(value);
            }
        } else {
            if (this.right != null) {
                this.right.insert(value);
            } else {
                this.right = new Node(value);
            }
        }
    }

    public void print() {
        if (this.left != null) {
            this.left.print();
        }

        System.out.println(this.value);

        if (this.right != null) {
            this.right.print();
        }
    }
}

public class Tree {
    private Node root;

    Tree(int value) {
        this.root = new Node(value);
    }

    void insert(int value) {
        this.root.insert(value);
    }

    void print() {
        this.root.print();
    }
}