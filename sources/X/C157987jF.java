package X;

/* renamed from: X.7jF  reason: invalid class name and case insensitive filesystem */
public class C157987jF {
    public boolean A00;
    public final C186588vc A01;

    public synchronized void A00() {
        this.A00 = false;
    }

    public synchronized boolean A01() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public C157987jF(C186588vc r1) {
        this.A01 = r1;
    }

    public C157987jF() {
        this(C186588vc.A00);
    }
}
