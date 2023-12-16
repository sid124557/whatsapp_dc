package X;

import java.util.ArrayList;

/* renamed from: X.0cp  reason: invalid class name and case insensitive filesystem */
public class C07790cp implements C15680rl {
    public float A00 = 0.0f;
    public C17070uW A01;
    public C04700Qh A02 = null;
    public ArrayList A03 = AnonymousClass001.A0s();
    public boolean A04 = false;

    public void A05(C04700Qh r5, C04700Qh r6, C04700Qh r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        C17070uW r0 = this.A01;
        if (!z) {
            r0.Bhm(r5, -1.0f);
            A00(this, r6, 1.0f);
            A00(this, r7, 1.0f);
            return;
        }
        r0.Bhm(r5, 1.0f);
        A00(this, r6, -1.0f);
        A00(this, r7, -1.0f);
    }

    public void A06(C04700Qh r5, C04700Qh r6, C04700Qh r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        C17070uW r0 = this.A01;
        if (!z) {
            r0.Bhm(r5, -1.0f);
            A01(this, r6, r7, 1.0f, -1.0f);
            return;
        }
        r0.Bhm(r5, 1.0f);
        A01(this, r6, r7, -1.0f, 1.0f);
    }

    public C04700Qh BBM(C05620Uf r2, boolean[] zArr) {
        return A02((C04700Qh) null, zArr);
    }

    public static void A00(C07790cp r0, C04700Qh r1, float f) {
        r0.A01.Bhm(r1, f);
    }

    public static void A01(C07790cp r1, C04700Qh r2, C04700Qh r3, float f, float f2) {
        r1.A01.Bhm(r2, f);
        r1.A01.Bhm(r3, f2);
    }

    public final C04700Qh A02(C04700Qh r11, boolean[] zArr) {
        C02300Fq r1;
        C17070uW r7 = this.A01;
        int B6a = r7.B6a();
        C04700Qh r8 = null;
        float f = 0.0f;
        for (int i = 0; i < B6a; i++) {
            float BED = r7.BED(i);
            if (BED < 0.0f) {
                C04700Qh BEC = r7.BEC(i);
                if ((zArr == null || !zArr[BEC.A02]) && BEC != r11 && (((r1 = BEC.A06) == C02300Fq.SLACK || r1 == C02300Fq.ERROR) && BED < f)) {
                    f = BED;
                    r8 = BEC;
                }
            }
        }
        return r8;
    }

    public void A03(C07790cp r4, boolean z) {
        this.A00 += r4.A00 * this.A01.Bs9(r4, z);
        if (z) {
            r4.A02.A03(this);
        }
    }

    public void A04(C04700Qh r5) {
        C04700Qh r0 = this.A02;
        if (r0 != null) {
            A00(this, r0, -1.0f);
            this.A02 = null;
        }
        C17070uW r2 = this.A01;
        float Bj2 = r2.Bj2(r5, true) * -1.0f;
        this.A02 = r5;
        if (Bj2 != 1.0f) {
            this.A00 /= Bj2;
            r2.B22(Bj2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r4 = r0.BED(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            X.0Qh r2 = r10.A02
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r2 != 0) goto L_0x0097
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
        L_0x0012:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = " = "
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r1)
            float r1 = r10.A00
            r6 = 0
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0095
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r7)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r8 = 1
        L_0x0034:
            X.0uW r0 = r10.A01
            int r5 = r0.B6a()
        L_0x003a:
            if (r6 >= r5) goto L_0x009f
            X.0uW r0 = r10.A01
            X.0Qh r1 = r0.BEC(r6)
            if (r1 == 0) goto L_0x0072
            float r4 = r0.BED(r6)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            java.lang.String r3 = r1.toString()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 != 0) goto L_0x007f
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = "- "
        L_0x005e:
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r1)
            float r4 = r4 * r2
        L_0x0063:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0075
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
        L_0x006d:
            java.lang.String r7 = X.AnonymousClass000.A0V(r7, r3, r0)
            r8 = 1
        L_0x0072:
            int r6 = r6 + 1
            goto L_0x003a
        L_0x0075:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r7)
            r0.append(r4)
            java.lang.String r7 = " "
            goto L_0x006d
        L_0x007f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 <= 0) goto L_0x008f
            r1.append(r7)
            java.lang.String r0 = " + "
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0063
        L_0x008f:
            r1.append(r7)
            java.lang.String r0 = " - "
            goto L_0x005e
        L_0x0095:
            r8 = 0
            goto L_0x0034
        L_0x0097:
            r1.append(r0)
            r1.append(r2)
            goto L_0x0012
        L_0x009f:
            if (r8 != 0) goto L_0x00ab
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = "0.0"
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00ab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07790cp.toString():java.lang.String");
    }

    public C07790cp(AnonymousClass0M1 r3) {
        this.A01 = new C07770cn(this, r3);
    }

    public C07790cp() {
    }
}
