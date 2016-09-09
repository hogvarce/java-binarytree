package binary;

import binary.Node;

import java.util.Iterator;

/**
 * Concrete implementation of a binary tree using a node-based, linked structure
 *
 * @param <E> element
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    // nonpublic utility

    protected E[] tree;
    protected int lastElementIndex;

    public LinkedBinaryTree() {
        tree = (E[])new Object[16];
        lastElementIndex = 1;
    }

    /**
     * Validates the node is an instance of supported {@link NodeImpl} type and casts to it
     * @param n node
     * @return casted {@link NodeImpl} node
     * @throws IllegalArgumentException
     */
    protected NodeImpl<E> validate(Node<E> n) throws IllegalArgumentException {
        return null;
    }


    public int getIndex(E e) {
        for(int i = 0; i < tree.length; i++) {
            if(e.equals(tree[i]))
                return i;
        }
        return -1;
    }

    // update methods supported by this class

    /**
     * Places element <i>e</i> at the root of an empty tree and returns its new {@link Node}
     *
     * @param e element
     * @return created root
     * @throws IllegalStateException if tree is not empty
     */
    public Node<E> addRoot(E e) throws IllegalStateException {
        tree[0] = e;
        return null;
    }

    /**
     * Creates a new left child of {@link Node} <i>n</i> storing element <i>e</i>
     *
     * @param n node
     * @param e    element
     * @return created node
     * @throws IllegalArgumentException if <i>node</i> already has a left child
     */
    public Node<E> addLeft(Node<E> n, E e) throws IllegalArgumentException {
        int inx = this.getIndex((E) n);
        int inxLeft = 2*inx + 1;
        if(inxLeft >= tree.length) {
            E[] newTree = (E[]) new Object[tree.length * 2];
            tree = newTree;
        }
        tree[inxLeft] = e;
        lastElementIndex++;
        return (Node<E>) tree[inxLeft];
    }

    /**
     * Creates a new right child of {@link Node} <i>n</i> storing element <i>e</i>
     *
     * @param n node
     * @param e    element
     * @return created node
     * @throws IllegalArgumentException if <i>n</i> already has a right child
     */
    public Node<E> addRight(Node<E> n, E e) throws IllegalArgumentException {
        int inx = this.getIndex((E) n);
        int inxRight = 2*inx + 2;
        if(inxRight >= tree.length) {
            E[] newTree = (E[]) new Object[tree.length * 2];
            tree = newTree;
        }
        tree[inxRight] = e;
        lastElementIndex++;
        return (Node<E>) tree[inxRight];
    }

    /**
     * Replaces the element at {@link Node} <i>n</i> with <i>e</i>
     *
     * @param n node
     * @param e element
     * @return replace element
     * @throws IllegalArgumentException
     */
    public E set(Node<E> n, E e) throws IllegalArgumentException {
        int inx = this.getIndex((E) n);
        tree[inx] = (E) n;
        return tree[inx];
    }

    /**
     * Replaces the element at {@link Node} <i>n</i> with <i>e</i>
     *
     * @param n node
     * @return replace element
     * @throws IllegalArgumentException
     */
    public E remove(Node<E> n) throws IllegalArgumentException {
        int inx = this.getIndex((E) n);
        tree[inx] = null;
        return null;
    }

    // {@link Tree} and {@link BinaryTree} implementations

    @Override
    public Node<E> left(Node<E> p) throws IllegalArgumentException {
        int inx = 2 * this.getIndex((E) p) + 1;
        return (Node<E>) tree[inx];
    }

    @Override
    public Node<E> right(Node<E> p) throws IllegalArgumentException {
        int inx = 2 * this.getIndex((E) p) + 2;
        return (Node<E>) tree[inx];
    }

    @Override
    public Node<E> root() {
        return (Node<E>) tree[0];
    }

    @Override
    public Node<E> parent(Node<E> n) throws IllegalArgumentException {
        int inx = (this.getIndex((E) n) - 1) / 2;
        return (Node<E>) tree[inx];
    }

    @Override
    public int size() {
        return tree.length;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<Node<E>> nodes() {
        return null;
    }

    protected static class NodeImpl<E> implements Node<E> {

        @Override
        public E getElement() {
            return null;
        }
    }

}