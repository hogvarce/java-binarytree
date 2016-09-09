import binary.LinkedBinaryTree;
import binary.RedBlackTree;

public class Main {

    LinkedBinaryTree tree;

    public static void main(String[] args) {
        System.out.println("started\n-------------------------");
        RedBlackTree tree = new RedBlackTree();
        Node root = new Node("Root node");
//        Node leftChild = new Node("Left node - parent root");
//        Node rightChild = new Node("Right node - parent root");
//        Node moreNode = new Node("node 3 layout");

        tree.addRoot(root);
//        tree.addLeft(root, leftChild);
//        tree.addRight(root, rightChild);
//        tree.addRight(rightChild, moreNode);
//        Node RootTree = (Node) tree.root();



        System.out.println("ended\n-------------------------");
    }

    static class Node implements binary.Node {

        String title;

        public Node(String title) {
            this.title = title;
        }

        public String getTitle() {
              return this.title;
        }

        @Override
        public Object getElement() {
            return null;
        }
    }
}