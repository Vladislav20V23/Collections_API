package com.example.benaryTree;

public class Start {
    public static void main(String[] args) {
        Tree tree = new Tree();
        // вставляем узлы в дерево:
        tree.insertNode(11);
        tree.insertNode(13);
        tree.insertNode(10);
        tree.insertNode(13);
        tree.insertNode(7);
        tree.insertNode(14);
        tree.insertNode(12);
        tree.insertNode(9);
        tree.insertNode(15);
        tree.insertNode(8);
        tree.insertNode(6);
        // отображение дерева:
        tree.printTree();

        // удаляем один узел и выводим оставшееся дерево в консоли
        tree.deleteNode(10);
        tree.printTree();

        // находим узел по значению и выводим его в консоли
        Node foundNode = tree.findNodeByValue(9);
        foundNode.printNode();
    }
}
