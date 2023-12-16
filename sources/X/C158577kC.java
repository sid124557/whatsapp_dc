package X;

/* renamed from: X.7kC  reason: invalid class name and case insensitive filesystem */
public final class C158577kC {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158577kC) {
                C158577kC r5 = (C158577kC) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A03 * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r5 <= 0.0f) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C158577kC(int r3, int r4, float r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            r2.A02 = r4
            r2.A01 = r5
            if (r3 <= 0) goto L_0x0013
            if (r4 <= 0) goto L_0x0013
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2.A04 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x001e
            float r1 = (float) r3
            float r1 = r1 * r5
            float r0 = (float) r4
            float r1 = r1 / r0
        L_0x001e:
            r2.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158577kC.<init>(int, int, float):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoSizeInfo(width=");
        A0o.append(this.A03);
        A0o.append(", height=");
        A0o.append(this.A02);
        A0o.append(", pixelWidthHeightRatio=");
        A0o.append(this.A01);
        return AnonymousClass000.A0c(A0o);
    }

    public C158577kC() {
        this(0, 0, 0.0f);
    }
}
