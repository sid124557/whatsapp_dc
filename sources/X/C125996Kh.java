package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: X.6Kh  reason: invalid class name and case insensitive filesystem */
public class C125996Kh extends AnonymousClass6KU {
    public static Bitmap A04;
    public static PorterDuffColorFilter A05;
    public static C153297b0 A06;
    public static final ArrayList A07 = AnonymousClass002.A0I(5);
    public int A00;
    public EnumSet A01;
    public final Paint A02;
    public final AnonymousClass6KW A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C125996Kh(X.C110885hC r19, X.AnonymousClass6KW r20) {
        /*
            r18 = this;
            X.7AE r1 = new X.7AE
            r1.<init>()
            r4 = r20
            r1.A00 = r4
            r3 = 0
            X.7b0 r0 = A06
            if (r0 != 0) goto L_0x0015
            X.7b0 r0 = new X.7b0
            r0.<init>()
            A06 = r0
        L_0x0015:
            r2 = r18
            r5 = r19
            r2.<init>(r5, r0, r1)
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.A02 = r0
            r0 = 1
            r2.A00 = r0
            r2.A03 = r3
            r2.A03 = r4
            X.7Pa r0 = r4.A03
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "dark"
        L_0x0033:
            r4.A01 = r0
            X.5hC r1 = r2.A09
            X.4PH r0 = r1.A0R
            java.util.EnumSet r0 = r0.A0k
            r2.A01 = r0
            X.6KX r0 = new X.6KX
            r0.<init>(r2)
            r2.A08 = r0
            android.graphics.Bitmap r0 = A04
            if (r0 != 0) goto L_0x00ae
            int r3 = r1.A0O
            android.content.Context r0 = r1.A0P
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r1 = r0.densityDpi
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
            A04 = r0
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r0)
            r0 = 320(0x140, float:4.48E-43)
            r2 = 16
            if (r1 < r0) goto L_0x0067
            r2 = 32
        L_0x0067:
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r0 = -7235677(0xffffffffff9197a3, float:NaN)
            r9.setColor(r0)
            r6 = 0
            r5 = 0
        L_0x0074:
            float r8 = (float) r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00ae
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0083
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 18
            if (r1 != 0) goto L_0x0085
        L_0x0083:
            r0 = 44
        L_0x0085:
            r9.setAlpha(r0)
            r7 = r5
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r5 - r0
            r10 = r4
            r12 = r6
            r13 = r11
            r14 = r8
            r15 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r5
            r12 = r4
            r13 = r6
            r14 = r5
            r15 = r8
            r17 = r9
            r12.drawLine(r13, r14, r15, r16, r17)
            r16 = r11
            r14 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            float r0 = (float) r2
            float r5 = r5 + r0
            goto L_0x0074
        L_0x00ac:
            r0 = 0
            goto L_0x0033
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125996Kh.<init>(X.5hC, X.6KW):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A07;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (((double) size) * 0.1d), 1.1d);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((AnonymousClass6KV) arrayList.get(i2)).A00;
        }
        int i3 = ((int) (((double) i) * max)) + 1;
        iArr[0] = i3;
        iArr[1] = Math.max((i3 - i) - 1, 1);
    }

    public void A0B(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A0B(canvas);
        C86614Ku.A1N(C158827kc.A0F, nanoTime);
    }

    public C160697o9 A0C(int i, int i2, int i3) {
        C160697o9 A0C = super.A0C(i, i2, i3);
        if (A0C != null) {
            A0C.A02 = i;
            A0C.A03 = i2;
            A0C.A04 = i3;
        }
        return A0C;
    }

    public void A0D() {
        super.A0D();
        this.A00 = 0;
        ArrayList arrayList = A07;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            C153297b0 r1 = this.A0A;
            if (r1.A03 != -1) {
                r1.A03 = -1;
            }
        }
        int[] iArr = this.A0B;
        A00(iArr);
        C153297b0 r12 = this.A0A;
        r12.A01 = iArr[0];
        r12.A02 = iArr[1];
        r12.A01();
    }
}
