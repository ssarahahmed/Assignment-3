public class DLList {
private DLNode Head;

public DLList(){
    Head = null;
}

    public void addy(Problem1Song s){
    DLNode node = new DLNode(s);
    if (Head == null){
        Head = node;
    } else {
        DLNode current = Head;
        while(current.next != null){
            current = current.next;
        }

        current.next = node;
        node.previous = current;
    }
    }

    public void removy(int pos){
    if(pos == 0){
        Head = Head.next;
    } else {
        DLNode current = Head;
        for(int i = 0; i < pos; i ++){
            current = current.next;
        }
        current.previous.next = current.next;
        if( current.next != null){
            current.next.previous = current.previous;
        }
    }
    }

    public String toString(){
    String result = "";
    DLNode current = Head;
    while (current != null){
        result = result + current.song + "\n";
        current = current.next;
    }
    return result;
    }
}
