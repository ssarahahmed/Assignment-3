public class SLList {

    private SLNode Head;

    public SLList(){
        Head = null;
    }

    public void addy(Problem1Song s){
        SLNode node = new SLNode(s);
        if (Head == null){
            Head = node;
        } else{
            SLNode current = Head;
            while (current.next != null){
                current = current.next;
            }
        }
    }

    public void removy(int pos){
        if( pos == 0){
            Head = Head.next;
        } else{
            SLNode current = Head;
            for( int i = 0; i < pos - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public String toString(){
        String result = "";
        SLNode current = Head;
        while(current != null){
            result = result + current.song + "\n";
            current = current.next;
        }
return result;
    }
}
