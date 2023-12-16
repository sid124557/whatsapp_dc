package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0Yn  reason: invalid class name and case insensitive filesystem */
public class C06620Yn implements TypeEvaluator {
    public C06160Wm[] A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        C06160Wm[] r11 = (C06160Wm[]) obj;
        C06160Wm[] r12 = (C06160Wm[]) obj2;
        if (AnonymousClass0WW.A01(r11, r12)) {
            C06160Wm[] r4 = this.A00;
            if (!AnonymousClass0WW.A01(r4, r11)) {
                if (r11 == null) {
                    r4 = null;
                } else {
                    int length = r11.length;
                    r4 = new C06160Wm[length];
                    for (int i = 0; i < length; i++) {
                        r4[i] = new C06160Wm(r11[i]);
                    }
                }
                this.A00 = r4;
            }
            for (int i2 = 0; i2 < r11.length; i2++) {
                C06160Wm r7 = r4[i2];
                C06160Wm r6 = r11[i2];
                C06160Wm r5 = r12[i2];
                r7.A00 = r6.A00;
                int i3 = 0;
                while (true) {
                    float[] fArr = r6.A01;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    r7.A01[i3] = AnonymousClass002.A01(r5.A01, f, fArr[i3] * (1.0f - f), i3);
                    i3++;
                }
            }
            return r4;
        }
        throw AnonymousClass001.A0c("Can't interpolate between two incompatible pathData");
    }
}
