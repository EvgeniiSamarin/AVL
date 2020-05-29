package com.company;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private int height;
    private int key;


    public Node( int key) {

        this.key = key;
        leftChild = rightChild = null;
        this.height = 1;
    }




    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
