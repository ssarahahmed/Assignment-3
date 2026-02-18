public class GSLNode <N> {
    N object;
    GSLNode<N> next;

    public GSLNode (N song){
        this.object = song;
        this.next = null;
    }
}
