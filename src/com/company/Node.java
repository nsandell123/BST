package com.company;

// Look into Comparables and Wildcards


public class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;
    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return this.data;
    }
    public Node<T> getLeft() {
        return this.left;
    }
    public Node<T> getRight() {
        return this.right;
    }
}
