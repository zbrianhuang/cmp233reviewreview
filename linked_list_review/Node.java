public class Node{
    private int value;
    private Node next;
    public Node(Node n,int v){
        next = n;
        value = v;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int in){
        value = in;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node n){
        next = n;
    }
}