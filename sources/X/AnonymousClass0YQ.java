package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.0YQ  reason: invalid class name */
public final class AnonymousClass0YQ {
    public static final AnonymousClass0YQ A00 = new AnonymousClass0YQ();

    public static final C04580Ov A00(C153427bI r1, AnonymousClass84O r2) {
        return new AnonymousClass09P(r1, r2);
    }

    public static final C152007Xe A01(Context context, AnonymousClass84O r2) {
        C04280Np A04 = C06410Xo.A00.A04(context, r2);
        return new C01910Cr(A04.A01, A04.A02);
    }

    public static final Rect[] A04(int i, int i2, int i3, boolean z) {
        Rect[] rectArr = new Rect[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            rectArr[i5] = AnonymousClass001.A0N();
        }
        if (i2 != 0) {
            double d = ((double) i2) / ((double) i3);
            while (i4 < i3) {
                int A002 = C1222663s.A00(((double) i4) * d);
                int i6 = i4 + 1;
                int A003 = i2 - C1222663s.A00(((double) i6) * d);
                Rect rect = rectArr[i4];
                if (i != 1) {
                    rect.top = A002;
                    rect.bottom = A003;
                } else if (!z) {
                    rect.left = A002;
                    rect.right = A003;
                } else {
                    rect.left = A003;
                    rect.right = A002;
                }
                i4 = i6;
            }
        }
        return rectArr;
    }

    public static final boolean A02(AnonymousClass84O r3) {
        AnonymousClass84O A0I = r3.A0I();
        if (A0I == null || A0I.A0D() != 16482) {
            return false;
        }
        return A0I.A0W(36, false);
    }
}
