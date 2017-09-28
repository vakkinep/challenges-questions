import java.util.*;

public class lca //Least Common Ancestor in a BST
{
    public Node root;

    public location
    {
        root = null;
    }

    private class Node
    {
        public Node right;
        public Node left;
        public int item;

        public Node(int x)
        {
            right = null;
            left = null;
            item = x;
        }
    }

    public int lca(Node a, Node b)
    {
        if ()
    }

    public void insert(int n)
    {
        if (root == null)
        {
            Node p = new Node(n);
            root = p;
        }

        else
        {
            Node p = root;
            while (p != null)
            {
                if (p.item < n)
                {
                    if (p.right = null)
                    {
                        p.right = new Node(n);
                        return;
                    }
                    p= p.right;
                }

                else
                {
                    if (p.left = null)
                    {
                        p.left = new Node(n);
                        return;
                    }
                    p = p.left;
                }
            }
        }
    }

}
