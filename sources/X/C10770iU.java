package X;

/* renamed from: X.0iU  reason: invalid class name and case insensitive filesystem */
public class C10770iU implements Runnable {
    public final /* synthetic */ C07540bC A00;

    public C10770iU(C07540bC r1) {
        this.A00 = r1;
    }

    public void run() {
        C07540bC r2 = this.A00;
        C002803e r0 = r2.A0C;
        if (r0 != null && C06360Xi.A04(r0) && r2.A0C.getCount() > r2.A0C.getChildCount()) {
            r2.A0C.getChildCount();
            r2.A0B.setInputMethodMode(2);
            r2.Bod();
        }
    }
}
