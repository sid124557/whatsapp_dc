package X;

import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.0NA  reason: invalid class name */
public class AnonymousClass0NA {
    public final Handler A00;
    public final C05280Ss A01;

    public void A00(C05350Sz r5) {
        Handler handler;
        Runnable r1;
        int i = r5.A00;
        if (i == 0) {
            Typeface typeface = r5.A01;
            C05280Ss r0 = this.A01;
            handler = this.A00;
            r1 = new C12580lm(typeface, r0, this);
        } else {
            C05280Ss r02 = this.A01;
            handler = this.A00;
            r1 = new C12590ln(r02, this, i);
        }
        handler.post(r1);
    }

    public AnonymousClass0NA(Handler handler, C05280Ss r2) {
        this.A01 = r2;
        this.A00 = handler;
    }
}
