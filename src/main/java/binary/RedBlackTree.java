package binary;

import java.util.Comparator;

/**
 * Created by Ganzhenko on 09.09.2016.
 */
public class RedBlackTree<E> extends LinkedBinaryTree implements Comparator{


    public RedBlackTree(int size) {
        tree = (E[])new Object[size];
    }

    public RedBlackTree() {
        super();
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
