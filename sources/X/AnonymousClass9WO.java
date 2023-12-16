package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.9WO  reason: invalid class name */
public class AnonymousClass9WO {
    public static final String A0G = AnonymousClass9ZS.class.getSimpleName();
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Rect A04;
    public Rect A05;
    public AnonymousClass96t A06;
    public AnonymousClass96u A07;
    public C194899Ux A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public MeteringRectangle[] A0C;
    public MeteringRectangle[] A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper(), new C204529pV(this, 1));
    public final C194439Sw A0F = new C194439Sw();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r11 < r10) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r11 == r10) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A00(float r7, float r8, float r9, float r10, float r11) {
        /*
            r6 = 0
            r5 = 1
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x000b
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            return r11
        L_0x0027:
            float r7 = r7 - r8
            float r9 = r9 - r8
            float r7 = r7 / r9
            float r11 = r11 - r10
            float r7 = r7 * r11
            float r7 = r7 + r10
            return r7
        L_0x002e:
            return r10
        L_0x002f:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = "invalid range bounds"
        L_0x0039:
            r4.append(r0)
            if (r3 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0074
            java.lang.String r0 = " & "
        L_0x0042:
            r4.append(r0)
            if (r2 == 0) goto L_0x0049
            java.lang.String r1 = "zero source range"
        L_0x0049:
            r4.append(r1)
            java.lang.String r3 = A0G
            java.util.Locale r2 = java.util.Locale.US
            r0 = 6
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.AnonymousClass001.A1P(r1, r7, r6)
            X.AnonymousClass001.A1P(r1, r8, r5)
            r0 = 2
            X.AnonymousClass001.A1P(r1, r9, r0)
            r0 = 3
            X.AnonymousClass001.A1P(r1, r10, r0)
            r0 = 4
            X.AnonymousClass001.A1P(r1, r11, r0)
            r0 = 5
            X.AnonymousClass0x7.A1E(r4, r1, r0)
            java.lang.String r0 = "Projecting zoom value %.3f from [%.2f, %.2f] to [%.2f, %.2f] failed - %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.AnonymousClass9WT.A01(r3, r0)
            r7 = 0
            return r7
        L_0x0074:
            r0 = r1
            goto L_0x0042
        L_0x0076:
            r0 = r1
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WO.A00(float, float, float, float, float):float");
    }

    public float A02() {
        AnonymousClass96t r1 = this.A06;
        if (r1 == null) {
            return -1.0f;
        }
        return AnonymousClass001.A05(C195049Vr.A04(C195049Vr.A0q, r1));
    }

    public final float A03(float f) {
        float A012;
        Object obj;
        List list = this.A0A;
        List list2 = this.A09;
        if (list == null || list2 == null) {
            return 0.0f;
        }
        float A002 = A00(f, -1.0f, 1.0f, (float) (-(list2.size() - 1)), (float) (list.size() - 1));
        double d = (double) A002;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        if (A002 >= 0.0f) {
            A012 = C1899593h.A01(list, floor) / 100.0f;
            obj = list.get(ceil);
        } else {
            A012 = C1899593h.A01(list2, -floor) / 100.0f;
            obj = list2.get(-ceil);
        }
        return A00(A002, (float) floor, (float) ceil, A012, AnonymousClass001.A05(obj) / 100.0f);
    }

    public int A04() {
        AnonymousClass96t r1 = this.A06;
        if (r1 == null) {
            return 0;
        }
        return C195049Vr.A02(C195049Vr.A0x, r1);
    }

    public final MeteringRectangle[] A05(MeteringRectangle[] meteringRectangleArr) {
        C194899Ux r0 = this.A08;
        AnonymousClass96t r1 = this.A06;
        Rect rect = this.A04;
        if (r0 == null || !this.A0B) {
            if (r1 == null || rect == null) {
                throw AnonymousClass001.A0e("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
            } else if (C195049Vr.A02(C195049Vr.A0x, r1) != 0) {
                return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, rect.width(), rect.height()), 0)};
            }
        }
        return meteringRectangleArr;
    }

    public static void A01(Rect rect, Rect rect2, float f) {
        int width = rect.width();
        int height = rect.height();
        double d = ((double) f) * 2.0d;
        int i = (int) (((double) width) / d);
        int i2 = (int) (((double) height) / d);
        int i3 = width / 2;
        int i4 = height / 2;
        rect2.set(i3 - i, i4 - i2, i3 + i, i4 + i2);
    }
}
