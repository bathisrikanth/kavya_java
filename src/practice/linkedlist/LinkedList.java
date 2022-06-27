package practice.linkedlist;

public class LinkedList {
    private Node head;  // instance variable
    // 1->5->6-7->null
    public void  insert(Integer value){
        if(head == null){ // this means my list is empty
            head = new Node();
            head.data = value;
        }
        else{
            Node temp = new Node();
            temp.data = value;

            Node tempHead = head;

            while(tempHead.next != null)
                tempHead = tempHead.next;

            tempHead.next = temp;
        }

    }

    public void  delete(Integer value){

        Node temp = head;

        while (temp.next!=null &&  temp.next.data != value)
            temp = temp.next;

        if(temp.next!=null)
            temp.next = temp.next.next;
    }


    public void print(){

        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("");
    }

}
