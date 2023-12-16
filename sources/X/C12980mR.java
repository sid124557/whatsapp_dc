package X;

/* renamed from: X.0mR  reason: invalid class name and case insensitive filesystem */
public class C12980mR implements Runnable {
    public final /* synthetic */ C10130hR A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ C131266dJ A02;
    public final /* synthetic */ C835248t A03;

    public C12980mR(C10130hR r1, C153427bI r2, C131266dJ r3, C835248t r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void run() {
        C157157hp r4 = new C157157hp(this.A02);
        C835248t r3 = this.A03;
        C152057Xj r2 = new C152057Xj();
        r2.A05(this.A01, 0);
        r4.A02(r2.A03(), r3);
    }
}
