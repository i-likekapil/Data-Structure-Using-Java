package Tree.TreeNode;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeNode {
    private static int max_level=0;//for left view
    private static int[][] ver;

    int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) { this.val = val; }

    // preorder

    public static void PrintPreorder(TreeNode node){
        if(node != null){
            System.out.print(node.val+" ");
            PrintPreorder(node.left);
            PrintPreorder(node.right);

        }
        return;
    }


    //postorder

    public static void PrintPostorder(TreeNode node){
        if(node != null){
            PrintPostorder(node.left);
            PrintPostorder(node.right);
            System.out.print(node.val+" ");

        }
        return;
    }


    //inorder

    public static void PrintInorder(TreeNode node){
        if(node != null){
            PrintInorder(node.left);
            System.out.print(node.val+" ");
            PrintInorder(node.right);


        }
        return;
    }
    //public static int count =0;
    public static int Height(TreeNode node){
        if(node == null){
            return 0;
        }
        else {

            return 1+ Math.max(Height(node.left),Height(node.right));
        }
    }


    public static int height(TreeNode node){
        if(node.left !=null)
            return 1+ height(node.left);
        else if(node.right!=null)
            return 1+ height(node.right);
        return 1;
    }

    //public static int x=0;
    public static int sum(TreeNode node){
        if(node != null)
            return node.val + sum(node.left)+ sum(node.right);
        return 0;
    }

    public static int oddEvenSum(TreeNode node){
        if(node == null) return 0;
        return node.val-(oddEvenSum(node.left)+oddEvenSum(node.right));

    }

    public static int totalNodes(TreeNode node){
        if(node==null) return 0;
        return 1+totalNodes(node.left)+totalNodes(node.right);
    }

    public static int totalLeafNode(TreeNode node){
        if(node.left==null) return 1;
        if(node.right==null) return 1;
        return totalLeafNode(node.left)+totalLeafNode(node.right);
    }

//    public static int totalInternalNode(TreeNode node){
//        return totalNodes(node)-totalLeafNode(node)-1;
//    }

    public static int totalInternalNode(TreeNode node){
        if(node.right != null || node.left != null)
            return 1+totalInternalNode(node.left)+totalInternalNode(node.right);
        return 0;
    }

    public static void PrintLevelTraversal(TreeNode node , int h){
        if(node == null) return;
        if(h==0) System.out.print(node.val+" ");
        PrintLevelTraversal(node.left,h-1);
        PrintLevelTraversal(node.right,h-1);
    }
    public static void PrintLevel(TreeNode node,int h){
        if(h==-1) return;
        PrintLevel(node,h-1);
        PrintLevelTraversal(node,h);
        System.out.println();
    }
    public static void rightView(TreeNode node , int level){
        if(node == null) return;
        if(max_level<level){
            System.out.println(node.val);
            max_level=level;
        }
        rightView(node.right, level+1);
        rightView(node.left, level+1);
    }
    public static void leftView(TreeNode node , int level){
        if(node == null) return;
        if(max_level>level){
            System.out.println(node.val);
            max_level=level;
        }
        leftView(node.right, level+1);
        leftView(node.left, level+1);
    }


    public static void printBoundaryLeft(TreeNode node){
        if(node == null) return;
        if(node.left != null)
        {
            System.out.println(node.val);
            printBoundaryLeft(node.left);
        }
        else if(node.right != null){
            System.out.println(node.val);
            printBoundaryLeft(node.right);
        }
    }

    public static void printBoundaryRight(TreeNode node){
        if(node == null) return;
        if(node.right != null)
        {
            printBoundaryRight(node.right);
            System.out.println(node.val);

        }
        else if(node.left != null){
            System.out.println(node.val);
            printBoundaryRight(node.left);
        }
    }

    public static void printLeaf(TreeNode node){
        if(node == null) return;
        printLeaf(node.left);
        if(node.left == null && node.right == null)
            System.out.println(node.val);

        printLeaf(node.right);
    }

    public static void printBoundary(TreeNode node){
        System.out.println(node.val);
        printBoundaryLeft(node.left);
        printLeaf(node);
        printBoundaryRight(node.right);
    }

    public static void printVorder(TreeNode node){
        TreeMap<Integer ,ArrayList<Integer>> m= new TreeMap<>();
        int x=0;
        getVertical(node,m,x);
        for (Map.Entry<Integer, ArrayList<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }

    }
    public static void getVertical(TreeNode node, TreeMap<Integer,ArrayList<Integer>> m , int x){
        if(node == null) return ;

        if( m.get(x) ==null){
            ArrayList<Integer> v = new ArrayList<>();
            v=new ArrayList<>();
            v.add(node.val);
            m.put(x, v);
        }
        else
        {
            ArrayList<Integer> v=m.get(x);
            v.add(node.val);
            m.put(x, v);
        }

        getVertical(node.left, m , x-1);
        getVertical(node.right, m , x+1);
    }



}


//    public static void Print2(TreeNode node){
//        Stack<TreeNode> stack =new Stack();
//        TreeNode current =node;
//        while(current!=null || stack.size()>0){
//            while(current!=null){
//                stack.push(current);
//                current=current.left;
//            }
//            System.out.print(current.val+" ");
//            current=stack.pop();
//            //System.out.print(current.val+" "); //inorder
//            current=current.right;
//
//
//        }
//    }
//
//    public static void Print3(TreeNode node){
//        Stack<TreeNode> stack =new Stack();
//        TreeNode current =node;
//        while(current!=null || stack.size()>0){
//            while(current!=null){
//                System.out.print(current.val+" "); //preorder
//                stack.push(current);
//                current=current.left;
//            }
//            current=stack.pop();
//            current=current.right;
//
//
//        }
//    }
//
//    public static void Print4(TreeNode node){
//        Stack<TreeNode> stack =new Stack();
//        TreeNode current =node;
//        while(current!=null || stack.size()>0){
//            while(current!=null){
//                    stack.push(current);
//                    current=current.left;
//            }
//            while(stack.peek()!=null){
//                current=stack.peek();
//                if(current.right!=null){
//                    current=current.right;
//                    stack.push(current.right);
//
//                }
//                else{
//                    //stack.push(current);
//                    System.out.print(current.val+" ");
//                    current=null;
//                    stack.pop();
//                }
//            }

