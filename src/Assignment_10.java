class Node
{

    String data;
    Node next;
    Node(String data, Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node(String data){
        this(data, null);
    }
    public String toString()
    {
        if (data == null)
        {
            String message = "The node is empty" ;
            return message;
        }
        else
        return data;
    }
};

class SList {
    Node head = new Node(null);
    public SListIterator iterateList() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head==null) {
            return "The list is already empty....";
        }
        SListIterator iterator = this.iterateList();
        StringBuilder s=new StringBuilder();
        while (iterator.hasNext()) {
            s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        return "The list goes like this \n "+s;
    }
};

class SListIterator         //Creating a new iterator for the singly linked list
{
    Node t;
    SListIterator(Node node)
    {
        this.t = node;
    }
    public Node next() {
        t = t.next;
        return t;
    }
    public boolean hasNext() {
        return t.next!=null;
    }
    public void insertNode(String data) {
        t.next = new Node(data, t.next);
        t = t.next;
    }
    public void removeNode() {
        if(t.next != null) {
            t.next = t.next.next;
        }
    }
};
