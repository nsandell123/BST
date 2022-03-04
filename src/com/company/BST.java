package com.company;
//Look into getters and setters versus exposing fields (https://stackoverflow.com/questions/1568091/why-use-getters-and-setters-accessors)

import java.util.Collection;

public class BST<T extends Comparable<T>> {
    private Node root;
    private int size;

    public BST(Collection<T> data) {

    }

    public void addIterative(Node<T> input) {
        if (input == null) {
            throw new IllegalArgumentException("You can't pass in a null input").
        }
        Node<T> traversal = root;
        while (traversal.getLeft() != null && traversal.getRight() != null) {
            if (input.getData().compareTo(traversal.getData()) > 0) {
                traversal = traversal.getRight();
            } else {
                traversal = traversal.getLeft();
            }
        }
        if (input.getData().compareTo(traversal.getData()) > 0) {
            traversal.
        }
    }
    public void addRecursive(Node<T> input) {

    }


}
