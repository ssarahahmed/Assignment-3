public class GDLNode <N> {
    N song;
    GDLNode<N> next;
    GDLNode<N> previous;

    public GDLNode(N song){
        this.song = song;
        this.next = null;
        this.previous = null;  // because it is doubly linked
    }
}
