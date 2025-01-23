package Tree_Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Tree
{
    // Code of a Node
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode (int val)
        {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // InOrder Traversal
    static void inOrder (TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    // PreOrder Traversal
    static void preOrder (TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // PostOrder Traversal
    static void postOrder (TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // BFS
    static void bfs (TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);


        while(!queue.isEmpty())
        {
            TreeNode data = queue.poll();

            System.out.print(data.val + " ");

                if(data.left != null) queue.add(data.left);
                if(data.right != null) queue.add(data.right);
        }
    }

    public static void main (String args[])
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        bfs(root);
    }
}
