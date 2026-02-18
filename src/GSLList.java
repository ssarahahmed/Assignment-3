public class GSLList <N> {

    private GSLNode<N> Head;

    public GSLList(){
        Head = null;

    }

    public void addy(N s){
        GSLNode<N> node = new GSLNode<>(s);
        if(Head == null){
            Head = node; // list is empty
        } else{
            GSLNode<N> current = Head;
            // traverse to the end
            while (current.next != null){
                current = current.next;
            }
        }
    }

    public void removy(int pos){
        // if removing first element, move head forward
        if(pos == 0){
            Head = Head.next;
        } else{
            GSLNode<N> current = Head;
            // stop one before pos to change pointer
            for( int i = 0; i < pos - 1; i++){
                current.next = current.next.next;
            }
        }
    }

    public String toString(){
        String result = "";
        GSLNode<N> current = Head;
        while( current != null){
            result = result + current.object + "\n";
            current = current.next;
        }
        return result;
    }
}
