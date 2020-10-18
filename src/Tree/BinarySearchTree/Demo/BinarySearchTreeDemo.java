package Tree.BinarySearchTree.Demo;

import Tree.BinarySearchTree.TreeNode;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.insert(10);
        root.insert(20);
        root.insert(70);
        root.insert(30);
        root.insert(5);
        root.insert(1);

        System.out.println(root.height());
        root.printLevel();



    }
}

