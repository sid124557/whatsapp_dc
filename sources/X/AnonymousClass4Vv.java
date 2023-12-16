package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Vv  reason: invalid class name */
public final class AnonymousClass4Vv extends AnonymousClass0O4 {
    public static final AnonymousClass4Vv A00 = new AnonymousClass4Vv();

    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        boolean A0P;
        C104825Sm r5 = (C104825Sm) obj;
        C104825Sm r6 = (C104825Sm) obj2;
        C18260x0.A0O(r5, r6);
        if (!C162457s7.A0P(r5.A04, r6.A04) || !C162457s7.A0P(r5.A02, r6.A02) || r5.A00 != r6.A00 || !C162457s7.A0P(r5.A03, r6.A03)) {
            return false;
        }
        Drawable drawable = r5.A01;
        Drawable drawable2 = r6.A01;
        if (drawable == null) {
            if (drawable2 == null) {
                return true;
            }
            return false;
        } else if (drawable2 == null) {
            return false;
        } else {
            Drawable.ConstantState constantState = drawable.getConstantState();
            Drawable.ConstantState constantState2 = drawable2.getConstantState();
            if (constantState == null && constantState2 == null) {
                A0P = drawable.equals(drawable2);
            } else {
                A0P = C162457s7.A0P(constantState, constantState2);
            }
            if (A0P) {
                return true;
            }
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C104825Sm r3 = (C104825Sm) obj;
        C104825Sm r4 = (C104825Sm) obj2;
        C18260x0.A0O(r3, r4);
        return C162457s7.A0P(r3.A02, r4.A02);
    }
}
