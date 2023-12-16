package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.67l  reason: invalid class name and case insensitive filesystem */
public class C1231867l extends AnonymousClass0P5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1231867l(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A02(Drawable drawable) {
        AnonymousClass677 r1;
        boolean z = drawable instanceof AnonymousClass6D5;
        if (this.A02 != 0) {
            if (z) {
                r1 = ((AnonymousClass5TP) this.A00).A0D.A0m;
            } else {
                return;
            }
        } else if (!z || (r1 = ((C93324oK) this.A00).A0m) == null) {
            return;
        }
        r1.Brx((C624134x) this.A01);
    }
}
