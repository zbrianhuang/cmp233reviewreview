public class Client {
    public static Node head;
    public static Node tail;
    public static void main(String[] args){
        Node temp=new Node(null,5);
        head = temp;
        tail = temp;
        for(int i= 0;i<5435;i++){
            temp = new Node(null,i);
            tail.setNext(temp);
            tail = temp;
        }
        Node asf=head;
        while(temp!=null){
            
            System.out.println(asf.getValue());
            asf=asf.getNext();
        }
    }
}
