package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.8zQ  reason: invalid class name and case insensitive filesystem */
public class C188748zQ extends TranslateAnimation {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C188748zQ(X.C108145cU r10, int r11) {
        /*
            r9 = this;
            r0 = r9
            r9.A01 = r11
            r9.A00 = r10
            r1 = 1
            r2 = 0
            int r11 = 2 - r11
            if (r11 == 0) goto L_0x0016
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
        L_0x000e:
            r5 = r1
            r7 = r1
            r3 = r1
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0016:
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188748zQ.<init>(X.5cU, int):void");
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A01;
        super.applyTransformation(f, transformation);
        switch (i) {
            case 0:
                AnonymousClass7T7 r1 = (AnonymousClass7T7) this.A00;
                r1.A00(C86664Kz.A02(r1.A01) * f);
                return;
            case 1:
                AnonymousClass7T7 r2 = (AnonymousClass7T7) this.A00;
                r2.A00(C86664Kz.A02(r2.A01) * (1.0f - f));
                return;
            case 2:
                C108145cU r22 = (C108145cU) this.A00;
                r22.A0F((int) (C86664Kz.A02(r22.A0J) * (1.0f - f)));
                return;
            default:
                C108145cU r12 = (C108145cU) this.A00;
                r12.A0F((int) (C86664Kz.A02(r12.A0J) * f));
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C188748zQ(X.AnonymousClass7T7 r10, int r11) {
        /*
            r9 = this;
            r0 = r9
            r9.A01 = r11
            r9.A00 = r10
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L_0x0014
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x000c:
            r5 = r1
            r7 = r1
            r3 = r1
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0014:
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188748zQ.<init>(X.7T7, int):void");
    }
}
