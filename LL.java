public class LL
{
    private Node first;

    public LL()
    {
        first = null;
    }

    private class Node{
        public Object item;
        public Node next;

        public Node(Object data)
        {
            item = data;
            next = null;
        }
    }

    public void insert(Object o)
    {
        Node n = new Node(o)
        if (first == null)
            first = n;

        else{
            n.next = first;
            first = n;
        }
    }


}
