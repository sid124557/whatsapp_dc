package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.0BU  reason: invalid class name */
public class AnonymousClass0BU extends C09290fx {
    public C04850Qx A00;
    public final C04850Qx A01;
    public final C09320g0 A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0BU(X.AnonymousClass01G r13, X.C09430gB r14, X.C09320g0 r15) {
        /*
            r12 = this;
            X.0FJ r0 = r14.A05
            int r1 = r0.ordinal()
            r2 = 0
            if (r1 == r2) goto L_0x0052
            r0 = 1
            if (r1 == r0) goto L_0x004f
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            X.0FK r0 = r14.A06
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x004c
            if (r1 == r2) goto L_0x0049
            r0 = 1
            if (r1 == r0) goto L_0x0046
            r4 = 0
        L_0x001d:
            float r11 = r14.A00
            X.0Bo r8 = r14.A04
            X.0Bn r6 = r14.A03
            java.util.List r10 = r14.A08
            X.0Bn r7 = r14.A02
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            java.lang.String r0 = r14.A07
            r12.A03 = r0
            boolean r0 = r14.A09
            r12.A04 = r0
            X.0Bi r0 = r14.A01
            java.util.List r1 = r0.A00
            X.0Be r0 = new X.0Be
            r0.<init>(r1)
            r12.A01 = r0
            X.C04850Qx.A05(r0, r15, r12)
            return
        L_0x0046:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001d
        L_0x0049:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001d
        L_0x004c:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001d
        L_0x004f:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x0052:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BU.<init>(X.01G, X.0gB, X.0g0):void");
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        if (!this.A04) {
            Paint paint = this.A01;
            C01520Be r2 = (C01520Be) this.A01;
            paint.setColor(r2.A0G(AnonymousClass0K1.A00(r2), r2.A08()));
            AnonymousClass001.A11(paint, this.A00);
            super.B2C(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.A03;
    }

    public void Aws(C05560Tz r3, Object obj) {
        super.Aws(r3, obj);
        if (obj == C17150ue.A0T) {
            this.A01.A0F(r3);
        } else if (obj == C17150ue.A00) {
            C04850Qx r1 = this.A00;
            if (r1 != null) {
                this.A02.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0BZ r0 = new AnonymousClass0BZ(r3, (Object) null);
            this.A00 = r0;
            C04850Qx.A06(r0, this);
            this.A02.A08(this.A01);
        }
    }
}
