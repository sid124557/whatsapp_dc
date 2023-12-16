package X;

/* renamed from: X.6b8  reason: invalid class name and case insensitive filesystem */
public class C129946b8 extends C172878Nf {
    public boolean done;
    public final /* synthetic */ Object val$value;

    public C129946b8(Object obj) {
        this.val$value = obj;
    }

    public boolean hasNext() {
        return !this.done;
    }

    public Object next() {
        if (!this.done) {
            this.done = true;
            return this.val$value;
        }
        throw AnonymousClass6CA.A0c();
    }
}
