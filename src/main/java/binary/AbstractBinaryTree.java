package binary;

import binary.AbstractTree;
import binary.Node;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    @Override
    public Node<E> sibling(Node<E> n) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Iterable<Node<E>> children(Node<E> n) throws IllegalArgumentException {
        return null;
    }

    @Override
    public int childrenNumber(Node<E> n) throws IllegalArgumentException {
        return 0;
    }

    /**
     *
     * @return an iterable collection of nodes of the tree in inorder
     */
    public Iterable<Node<E>> inOrder() {
        return null;
    }
}
