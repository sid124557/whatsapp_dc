package X;

/* renamed from: X.0iT  reason: invalid class name and case insensitive filesystem */
public class C10760iT implements Runnable {
    public final /* synthetic */ C07540bC A00;

    public C10760iT(C07540bC r1) {
        this.A00 = r1;
    }

    public void run() {
        C002803e r1 = this.A00.A0C;
        if (r1 != null) {
            r1.A0B = true;
            r1.requestLayout();
        }
    }
}
