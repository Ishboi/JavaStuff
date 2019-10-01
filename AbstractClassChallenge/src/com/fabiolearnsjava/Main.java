package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Lisboa Lisboa Sacavem Amadora Oeiras Cacem Povoa Telheiras Benfica Reboleira Campolide";
        String[] data =stringData.split(" ");
        for(String s : data) {
            // create a new item with value set to the string s
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Sacavem"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Amadora"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Reboleira"));
        tree.removeItem(new Node("Telheiras"));
        tree.removeItem(new Node("Campolide"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Oeiras"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("Cacem"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("Povoa"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());



    }
}
