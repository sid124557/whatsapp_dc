package X;

/* renamed from: X.6bB  reason: invalid class name and case insensitive filesystem */
public abstract class C129976bB extends C172878Nf {
    public Object next;
    public C142826xq state = C142826xq.NOT_READY;

    public abstract Object computeNext();

    private boolean tryToComputeNext() {
        this.state = C142826xq.FAILED;
        this.next = computeNext();
        if (this.state == C142826xq.DONE) {
            return false;
        }
        this.state = C142826xq.READY;
        return true;
    }

    public final Object endOfData() {
        this.state = C142826xq.DONE;
        return null;
    }

    public final boolean hasNext() {
        C142826xq r4 = this.state;
        if (r4 != C142826xq.FAILED) {
            int ordinal = r4.ordinal();
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 0) {
                return tryToComputeNext();
            }
            return true;
        }
        throw AnonymousClass6CA.A0O();
    }

    public final Object next() {
        if (hasNext()) {
            this.state = C142826xq.NOT_READY;
            Object obj = this.next;
            this.next = null;
            return obj;
        }
        throw AnonymousClass6CA.A0c();
    }
}
