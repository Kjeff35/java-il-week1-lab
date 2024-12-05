package org.example;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);

        System.out.println("In-order traversal:");
        tree.inOrder();

        System.out.println("Search for 15: " + tree.search(15));
        System.out.println("Search for 100: " + tree.search(100));

        tree.delete(10);
        System.out.println("In-order traversal after deleting 10:");
        tree.inOrder();
    }
}