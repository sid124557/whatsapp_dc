package X;

import android.graphics.Typeface;

/* renamed from: X.90G  reason: invalid class name */
public class AnonymousClass90G implements C181218mO {
    public Object A00;
    public final int A01;

    public AnonymousClass90G(C159177lI r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void AxB(Typeface typeface) {
        boolean A0C;
        int i = this.A01;
        C159177lI r1 = (C159177lI) this.A00;
        if (i != 0) {
            A0C = r1.A0D(typeface);
        } else {
            A0C = r1.A0C(typeface);
        }
        if (A0C) {
            r1.A0B(false);
        }
    }
}
