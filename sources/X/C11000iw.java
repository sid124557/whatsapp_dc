package X;

/* renamed from: X.0iw  reason: invalid class name and case insensitive filesystem */
public class C11000iw implements Runnable {
    public final /* synthetic */ C06270Wx A00;

    public C11000iw(C06270Wx r1) {
        this.A00 = r1;
    }

    public void run() {
        Object obj;
        C06270Wx r3 = this.A00;
        synchronized (r3.A06) {
            obj = r3.A09;
            r3.A09 = C06270Wx.A0A;
        }
        r3.A0H(obj);
    }
}
