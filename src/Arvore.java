
import java.util.Arrays;
import java.util.List;

public class Arvore {

    static class Node {
        int key;
        Node left, right;
        int height; 

        Node(int k) {
            key = k;
            height = 1;
        }
    }
    static class BST {
        Node root;

        void insert(int key) {
            root = insertRec(root, key);
        }

        private Node insertRec(Node node, int key) {
            if (node == null) return new Node(key);
            if (key < node.key) node.left = insertRec(node.left, key);
            else if (key > node.key) node.right = insertRec(node.right, key);
            
            return node;
        }
    }

    static class AVL {
        Node root;

        void insert(int key) {
            root = insertRec(root, key);
        }

        private Node insertRec(Node node, int key) {
            if (node == null) return new Node(key);
            if (key < node.key) node.left = insertRec(node.left, key);
            else if (key > node.key) node.right = insertRec(node.right, key);
            else return node; 

            updateHeight(node);
            int balance = getBalance(node);

            
            if (balance > 1 && key < node.left.key) {
                return rightRotate(node); 
            }
            if (balance > 1 && key > node.left.key) {
                node.left = leftRotate(node.left); 
                return rightRotate(node);
            }

            
            if (balance < -1 && key > node.right.key) {
                return leftRotate(node); 
            }
            if (balance < -1 && key < node.right.key) {
                node.right = rightRotate(node.right); 
                return leftRotate(node);
            }

            return node;
        }

        private int height(Node n) {
            return (n == null) ? 0 : n.height;
        }

        private void updateHeight(Node n) {
            n.height = 1 + Math.max(height(n.left), height(n.right));
        }

        private int getBalance(Node n) {
            return (n == null) ? 0 : height(n.left) - height(n.right);
        }

        private Node rightRotate(Node y) {
            Node x = y.left;
            Node T2 = x.right;
            x.right = y;
            y.left = T2;
            updateHeight(y);
            updateHeight(x);
            return x;
        }

        private Node leftRotate(Node x) {
            Node y = x.right;
            Node T2 = y.left;
            y.left = x;
            x.right = T2;
            updateHeight(x);
            updateHeight(y);
            return y;
        }
    }

    
    static void printTree(Node node) {
        printTree(node, "", true);
    }

    private static void printTree(Node node, String prefix, boolean isTail) {
        if (node == null) return;
        if (node.right != null) {
            printTree(node.right, prefix + (isTail ? "│   " : "    "), false);
        }
        System.out.println(prefix + (isTail ? "└── " : "┌── ") + node.key);
        if (node.left != null) {
            printTree(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }

    // Impressões auxiliares (in-order)
    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        List<Integer> elementos = Arrays.asList(1,2,3,10,4,5,9,7,8,6);

        BST bst = new BST();
        AVL avl = new AVL();

        for (int v : elementos) {
            bst.insert(v);
            avl.insert(v);
        }

        System.out.println("Elementos inseridos: " + elementos);
        System.out.println();

        System.out.println("Árvore BST (sem balanceamento) - impressão rotacionada:");
        printTree(bst.root);
        System.out.print("BST inorder: ");
        inorder(bst.root);
        System.out.println("\n");

        System.out.println("Árvore AVL (balanceada) - impressão rotacionada:");
        printTree(avl.root);
        System.out.print("AVL inorder: ");
        inorder(avl.root);
        System.out.println();
    }
}
