package com.company;

public class Avl {
    private Node headNode;
    private int size;

    public Avl() {
        headNode = null;
        size = 0;
    }

    public int balance(Node node) {
        return node.getLeftChild().getHeight() - node.getRightChild().getHeight();
    }

    public void fixHeight(Node node) {
        int heightOfLeftChild = node.getLeftChild().getHeight();
        int heightOfRightChild = node.getRightChild().getHeight();

        //node.setHeight();
    }



}
