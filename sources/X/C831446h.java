package X;

import android.os.Handler;

/* renamed from: X.46h  reason: invalid class name and case insensitive filesystem */
public abstract class C831446h extends AnonymousClass46A implements C84824Dv {
    public AnonymousClass4C7 BGx(Runnable runnable, C85494Gl r7, long j) {
        C831346g r4 = (C831346g) this;
        Handler handler = r4.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C72683e7(runnable, r4);
        }
        r4.A05(runnable, r7);
        return C72713eA.A00;
    }
}
