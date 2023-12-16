package X;

import android.os.Handler;

/* renamed from: X.7Rt  reason: invalid class name and case insensitive filesystem */
public final class C150677Rt {
    public final Handler A00;
    public final AnonymousClass81X A01;

    public void A00(C150237Pv r3) {
        synchronized (r3) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, this, r3, 3);
        }
    }

    public C150677Rt(Handler handler, AnonymousClass81X r2) {
        this.A00 = r2 == null ? null : handler;
        this.A01 = r2;
    }
}
