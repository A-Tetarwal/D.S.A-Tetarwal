package HashMap;

// Node class representing each node in the tree
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// BinaryTree class with basic operations
class BinaryTree {
    Node root;

    // Constructor to initialize an empty tree
    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a new node with given data
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            insertNode(root, newNode);
        }
    }

    // Helper method to insert a new node into the tree
    private void insertNode(Node currentNode, Node newNode) {
        if (newNode.data < currentNode.data) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                insertNode(currentNode.left, newNode);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                insertNode(currentNode.right, newNode);
            }
        }
    }

    // Method to print the tree using in-order traversal
    public void printTree() {
        printInOrder(root);
    }

    // Helper method to print the tree using in-order traversal
    private void printInOrder(Node currentNode) {
        if (currentNode != null) {
            printInOrder(currentNode.left);
            System.out.print(currentNode.data + " ");
            printInOrder(currentNode.right);
        }
    }
}

// Example usage
public class tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("Tree nodes:");
        tree.printTree();
    }
}