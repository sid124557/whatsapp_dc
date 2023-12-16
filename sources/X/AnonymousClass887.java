package X;

/* renamed from: X.887  reason: invalid class name */
public class AnonymousClass887 implements C185348tV {
    public final C185348tV[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4 > r17) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Azd(long r17) {
        /*
            r16 = this;
            r15 = 0
        L_0x0001:
            r1 = r16
            long r13 = r1.BA0()
            r11 = -9223372036854775808
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
            X.8tV[] r10 = r1.A00
            int r9 = r10.length
            r8 = 0
            r7 = 0
        L_0x0012:
            if (r8 >= r9) goto L_0x0034
            r6 = r10[r8]
            long r4 = r6.BA0()
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r2 = r17
            if (r0 == 0) goto L_0x0025
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x0031
        L_0x002c:
            boolean r0 = r6.Azd(r2)
            r7 = r7 | r0
        L_0x0031:
            int r8 = r8 + 1
            goto L_0x0012
        L_0x0034:
            r15 = r15 | r7
            if (r7 != 0) goto L_0x0001
        L_0x0037:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass887.Azd(long):boolean");
    }

    public final long B4y() {
        long j = Long.MAX_VALUE;
        for (C185348tV B4y : this.A00) {
            long B4y2 = B4y.B4y();
            if (B4y2 != Long.MIN_VALUE) {
                j = Math.min(j, B4y2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long BA0() {
        long j = Long.MAX_VALUE;
        for (C185348tV BA0 : this.A00) {
            long BA02 = BA0.BA0();
            if (BA02 != Long.MIN_VALUE) {
                j = Math.min(j, BA02);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public boolean BHy() {
        for (C185348tV BHy : this.A00) {
            if (BHy.BHy()) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass887(C185348tV[] r1) {
        this.A00 = r1;
    }
}
