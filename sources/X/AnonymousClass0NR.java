package X;

import android.os.Handler;

/* renamed from: X.0NR  reason: invalid class name */
public class AnonymousClass0NR {
    public C12640ls A00;
    public final Handler A01 = new Handler();
    public final AnonymousClass08A A02;

    public final void A00(AnonymousClass0GH r3) {
        C12640ls r0 = this.A00;
        if (r0 != null) {
            r0.run();
        }
        C12640ls r1 = new C12640ls(r3, this.A02);
        this.A00 = r1;
        this.A01.postAtFrontOfQueue(r1);
    }

    public AnonymousClass0NR(C15910sA r2) {
        this.A02 = new AnonymousClass08A(r2);
    }
}
