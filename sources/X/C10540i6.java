package X;

/* renamed from: X.0i6  reason: invalid class name and case insensitive filesystem */
public class C10540i6 implements Cloneable {
    public float A00;
    public AnonymousClass0G3 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r1 / r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00() {
        /*
            r3 = this;
            r2 = 1119879168(0x42c00000, float:96.0)
            X.0G3 r0 = r3.A01
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x000e
            switch(r1) {
                case 3: goto L_0x002c;
                case 4: goto L_0x0024;
                case 5: goto L_0x001d;
                case 6: goto L_0x0017;
                case 7: goto L_0x0011;
                default: goto L_0x000e;
            }
        L_0x000e:
            float r0 = r3.A00
            return r0
        L_0x0011:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1086324736(0x40c00000, float:6.0)
            goto L_0x002a
        L_0x0017:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x002a
        L_0x001d:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x002a
        L_0x0024:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1076006748(0x40228f5c, float:2.54)
        L_0x002a:
            float r1 = r1 / r0
            return r1
        L_0x002c:
            float r1 = r3.A00
            float r1 = r1 * r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10540i6.A00():float");
    }

    public float A01(AnonymousClass0YF r6) {
        float sqrt;
        if (this.A01 != AnonymousClass0G3.percent) {
            return A02(r6);
        }
        AnonymousClass0TM r1 = r6.A02;
        C05400Te r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A00;
        }
        float f = r0.A03;
        float f2 = r0.A00;
        if (f == f2) {
            sqrt = this.A00 * f;
        } else {
            sqrt = this.A00 * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / 1.414213562373095d));
        }
        return sqrt / 100.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return r2 * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return r2 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        return r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A02(X.AnonymousClass0YF r4) {
        /*
            r3 = this;
            X.0G3 r0 = r3.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x001c;
                case 2: goto L_0x0027;
                case 3: goto L_0x0017;
                case 4: goto L_0x003e;
                case 5: goto L_0x0047;
                case 6: goto L_0x0050;
                case 7: goto L_0x0036;
                case 8: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r0 = r3.A00
            return r0
        L_0x000c:
            X.0TM r1 = r4.A02
            X.0Te r0 = r1.A02
            if (r0 != 0) goto L_0x0058
            X.0Te r0 = r1.A03
            if (r0 != 0) goto L_0x0058
            goto L_0x0009
        L_0x0017:
            float r2 = r3.A00
            r1 = 1119879168(0x42c00000, float:96.0)
            goto L_0x0034
        L_0x001c:
            float r2 = r3.A00
            X.0TM r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            goto L_0x0034
        L_0x0027:
            float r2 = r3.A00
            X.0TM r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x0034:
            float r2 = r2 * r1
            return r2
        L_0x0036:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1086324736(0x40c00000, float:6.0)
            goto L_0x005f
        L_0x003e:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1076006748(0x40228f5c, float:2.54)
            goto L_0x005f
        L_0x0047:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x005f
        L_0x0050:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x005f
        L_0x0058:
            float r2 = r3.A00
            float r0 = r0.A03
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
        L_0x005f:
            float r2 = r2 / r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10540i6.A02(X.0YF):float");
    }

    public float A03(AnonymousClass0YF r3) {
        if (this.A01 != AnonymousClass0G3.percent) {
            return A02(r3);
        }
        AnonymousClass0TM r1 = r3.A02;
        C05400Te r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A00;
        }
        return (this.A00 * r0.A00) / 100.0f;
    }

    public float A04(AnonymousClass0YF r3, float f) {
        if (this.A01 == AnonymousClass0G3.percent) {
            return (this.A00 * f) / 100.0f;
        }
        return A02(r3);
    }

    public C10540i6(AnonymousClass0G3 r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(String.valueOf(this.A00));
        return AnonymousClass000.A0R(this.A01, A0o);
    }

    public C10540i6(float f) {
        this.A00 = f;
        this.A01 = AnonymousClass0G3.px;
    }
}
