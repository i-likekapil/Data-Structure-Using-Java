package Tree.BinarySearchTree;

public class TreeNode {
	int val;
	public TreeNode left;
	public TreeNode right;

    public TreeNode() {
        root = null;
    }

    static class Node {
        int val;
        Node left, right;

        public Node(int item) {
            val = item;
            left = right = null;
        }
    }

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public int height() {
        return Height(root);
    }

    public void print(){
        Print(root);
    }

    public void delete(int key){
        Delete(root,key);
    }

    public int smallest(){
        return Smallest(root);
    }

    public int largest() {
        return Largest(root);
    }

    public int parent(int key){
        return Parent(root,key,-1);
    }

    public boolean search(int key){
        return  Search(root,key);
    }

    public void printLevel(){
        PrintLevel(root,height());
    }


    private static Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.val > val)
            root.left = insertRec(root.left, val);
        if (root.val < val)
            root.right = insertRec(root.right, val);
        return root;
    }

    private static int Height(Node node) {
        if (node != null)
            return 1 + Math.max(Height(node.left), Height(node.right));
        return 0;
    }

    private static void Print(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        Print(root.left);
        Print(root.right);
    }

	/*private static Node Delete(Node root , int key){
		if(root == null) return null;
		if(root.val > key){
			root.left= Delete(root.left,key);
		}
		else if(root.val < key){
			root.right= Delete(root.right,key);
		}
		else if(root.val == key){
			if(root.left == null && root.right == null) {
				return null;
			}
		}
		return root;
	}*/

    private int Smallest(Node root) {
        if(root.left == null) return root.val;
        return Smallest(root.left);
    }

    private int Largest(Node root){
        if(root.right == null) return root.val;
        return  Largest(root.right);
    }

    private boolean Search(Node root, int key) {
        if(root == null) return false;
        if(root.val== key) return true;
        else if(root.val > key) return Search(root.left,key);
        else if(root.val < key) return Search(root.right,key);
        return false;
    }

    private int Parent(Node root ,int key,int parent) {
        if(root == null) return -1;
        if(root.val == key) return parent;
        if(root.val > key) return Parent(root.left,key,root.val);
        return Parent(root.right,key,root.val);
    }


    private Node Delete(Node root , int key){
        if(root == null) return null;
        if(key<root.val) root.left= Delete(root.left,key);
        if(root.val < key) root.right= Delete(root.right,key);
        else {
            if(root.left == null) return  root.right;
            else if(root.right == null) return root.left;
            root.val =Smallest(root.right);
            root.right=Delete(root.right,root.val);
        }
        return root;
    }

    private void PrintLevel(Node root,int h){
        if(h == -1) return;
        PrintLevel(root,h-1);
        PrintLevelTraversal(root ,h);
        System.out.println();
    }
    private void PrintLevelTraversal(Node root , int h){
        if (root == null) return;
        if (h == 0) System.out.print(root.val + " ");
        PrintLevelTraversal(root.left, h - 1);
        PrintLevelTraversal(root.right, h - 1);
    }




}

