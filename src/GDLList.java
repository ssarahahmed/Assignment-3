public class GDLList <N>{
    private GDLNode<N> Head;

    public GDLList(){
        Head = null;
    }

    public void addy(N s) {
        GDLNode<N> node = new GDLNode<>(s);
        if (Head == null) {
            Head = node; // list is empty
        } else {
            GDLNode<N> current = Head;
            while (current.next != null) {
                current = current.next;
            }
            // attatch new node and set its previous to the old last node
            current.next = node;
            node.previous = current;
        }
    }

            public void removy(int pos) {
                if (pos == 0) { // if the head is removed. move the head forward
                    Head = Head.next;
                } else {
                    GDLNode<N> current = Head;
                    // traverse until the node to be removed is reached
                    for (int i = 0; i < pos; i++) {
                        current = current.next;
                    }
                    // make the previous node skip the current
                    current.previous.next = current.next;
                    // update previous pointer of next node
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                }
            }
                    public String toString () {
                        String result = "";
                        GDLNode<N> current = Head;
                        while (current != null) {
                            result = result + current.song + "\n";
                            current = current.next;
                        }
                        return result;
                    }
                }
