package X;

import android.os.SystemClock;

/* renamed from: X.4lF  reason: invalid class name and case insensitive filesystem */
public final class C91854lF extends C56602sG {
    public long A00;
    public final /* synthetic */ C92614my A01;

    public C91854lF(C92614my r1) {
        this.A01 = r1;
    }

    public void A03(C95814uZ r7) {
        C92614my r5 = this.A01;
        if (C162457s7.A0P(r7, r5.A0D.A1J.A00) && SystemClock.uptimeMillis() - this.A00 > 2000) {
            this.A00 = SystemClock.uptimeMillis();
            C92614my.setupNewsletterIcon$default(r5, false, 1, (Object) null);
            r5.A24();
            r5.A23();
        }
    }
}
