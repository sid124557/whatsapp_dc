package X;

/* renamed from: X.0ls  reason: invalid class name and case insensitive filesystem */
public class C12640ls implements Runnable {
    public boolean A00 = false;
    public final AnonymousClass0GH A01;
    public final AnonymousClass08A A02;

    public void run() {
        if (!this.A00) {
            this.A02.A04(this.A01);
            this.A00 = true;
        }
    }

    public C12640ls(AnonymousClass0GH r2, AnonymousClass08A r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
