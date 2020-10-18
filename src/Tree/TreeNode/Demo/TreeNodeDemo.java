package Tree.TreeNode.Demo;

import Tree.TreeNode.TreeNode;

public class TreeNodeDemo {
    public static void main(String[] args) {
        TreeNode root =new TreeNode(10);
        TreeNode left=new TreeNode(20);
        TreeNode right=new TreeNode(30);
        TreeNode left_left=new TreeNode(40);
        TreeNode left_right=new TreeNode(50);
        TreeNode right_left=new TreeNode(60);
        TreeNode right_right=new TreeNode(70);

        root.left=left;
        root.right=right;
        left.left=left_left;
        left.right=left_right;
        right.left=right_left;
        right.right=right_right;
        /*root.PrintInorder(root);
        root.PrintLevel(root,root.Height(root));
        System.out.println(root.Height(root));*/
        root.printVorder(root);

    }
}
