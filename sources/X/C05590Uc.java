package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0Uc  reason: invalid class name and case insensitive filesystem */
public abstract class C05590Uc {
    public int A00 = Integer.MIN_VALUE;
    public final Rect A01 = AnonymousClass001.A0N();
    public final C06440Xs A02;

    public static C05590Uc A00(C06440Xs r2, int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                throw AnonymousClass001.A0c("invalid orientation");
            }
        }
        return new C17600vq(r2, i2);
    }

    public abstract int A01();

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06(View view);

    public abstract int A07(View view);

    public abstract int A08(View view);

    public abstract int A09(View view);

    public abstract int A0A(View view);

    public abstract int A0B(View view);

    public abstract void A0C(int i);

    public C05590Uc(C06440Xs r2) {
        this.A02 = r2;
    }
}
